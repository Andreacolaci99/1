package OOP;

public class Prodotto {

    private String nome;

    private int quantita;

    private double prezzo;

    private static int numeroProdottiCreati = 0;

    public Prodotto(String nome, int quantita, double prezzo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Il nome del prodotto non è valido");
        }
        if (quantita < 0) {
            throw new IllegalArgumentException("Quantita inserita non valida");
        }
        if (prezzo <= 0 || !Double.isFinite(prezzo)) {
            throw new IllegalArgumentException("Prezzo non valido");
        }
        this.nome = nome;
        this.quantita = quantita;
        this.prezzo = prezzo;
        numeroProdottiCreati++;
    }

    public double calcolaValoreTotale() {
        return this.quantita * this.prezzo;
    }

    @Override
    public String toString() {
        return "Il prodotto è " + nome + " la quantità è di : " + quantita + " il prezzo cada uno è di : " + prezzo
                + " il prezzo complessivo di tutte le unità è di " + (calcolaValoreTotale());
    }

    public void vendi(int quantitaVenduta) {
        if (quantitaVenduta <= 0) {
            throw new IllegalArgumentException("La quantità inserità non è corretta");
        }
        if (quantitaVenduta > quantita) {
            throw new IllegalArgumentException("Quantità disponibile non sufficiente");
        }
        quantita -= quantitaVenduta;
    }

    public void rifornisci(int quantitaAggiunta) {
        if (quantitaAggiunta <= 0) {
            throw new IllegalArgumentException("La quantità inserità non è corretta");
        }
        if (quantitaAggiunta > (Integer.MAX_VALUE - quantita)) {
            throw new IllegalArgumentException("Quantita inserita troppo elevata");
        }
        quantita += quantitaAggiunta;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo <= 0 || !Double.isFinite(prezzo)) {
            throw new IllegalArgumentException("Prezzo non valido");
        }
        this.prezzo = prezzo;
    }

    public static int getNumeroProdottiCreati() {
        return numeroProdottiCreati;
    }

}