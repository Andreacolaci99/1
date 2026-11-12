import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    private List<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void stampaProdotti2() {
        for (Prodotto p : prodotti) {
            System.out.println(p);
        }
    }

    public double calcolaValoreTotale() {
        double valoreTotale = 0;
        for (Prodotto p : prodotti) {
            valoreTotale += p.calcolaValoreMagazzino();
        }
        return valoreTotale;
    }

    public Prodotto cercaPerNome(String nome) {
        for (Prodotto p : prodotti) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public Prodotto trovaProdottoPiuCostoso() {
        if (prodotti.get(0) != null) {
            Prodotto piuCostoso = prodotti.get(0);
            for (int i = 1; i < prodotti.size(); i++) {
                if (prodotti.get(i).getPrezzo() > piuCostoso.getPrezzo()) {
                    piuCostoso = prodotti.get(i);
                }
            }
            return piuCostoso;
        }
        return null;
    }

    public Prodotto trovaProdottoConPiuQuantita() {
        if (prodotti.get(0) != null) {
            Prodotto piuQuantita = prodotti.get(0);
            for (int i = 1; i < prodotti.size(); i++) {
                if (prodotti.get(i).getQuantita() > piuQuantita.getQuantita()) {
                    piuQuantita = prodotti.get(i);
                }
            }
            return piuQuantita;
        }
        return null;
    }
 }
