package OOP;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    private final ArrayList<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        if (prodotto == null) {
            throw new IllegalArgumentException("Il prodotto non può essere null");
        }
        prodotti.add(prodotto);
    }

    public int contaProdotti() {
        return prodotti.size();
    }

    public double calcolaValoreMagazzino() {
        double valoreMagazzino = 0.0;
        for (Prodotto p : prodotti) {
            valoreMagazzino += p.calcolaValoreTotale();
        }
        return valoreMagazzino;
    }

    public List<Prodotto> getAll() {
        return List.copyOf(prodotti);
    }

    public Prodotto cercaProdottoPerNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Il nome non può essere null");
        }
        for (Prodotto p : prodotti) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void vendiProdotto(String nome, int quantitaVenduta) {
        Prodotto prodottoTrovato = cercaProdottoPerNome(nome);
        if (quantitaVenduta < 0) {
            throw new IllegalArgumentException("Quantità inserita non valida");
        }
        if (prodottoTrovato != null) {
            if (prodottoTrovato.getQuantita() < quantitaVenduta) {
                throw new IllegalArgumentException("Scorte di magazzino non sufficienti");
            }
            prodottoTrovato.vendi(quantitaVenduta);
        }else{
            throw new IllegalArgumentException("Prodotto inesistente");
        }
    }
}
