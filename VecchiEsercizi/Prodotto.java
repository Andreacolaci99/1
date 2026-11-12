public class Prodotto {

    private String nome;

    private double prezzo;

    private int quantita;

    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double calcolaValoreMagazzino() {
        return prezzo * quantita;
    }

    public void applicaSconto(double percentuale) {
        if (percentuale >= 0 && percentuale <= 100) {
            prezzo -= (percentuale * prezzo) / 100;
        } else {
            throw new IllegalArgumentException("Valore inserito non corretto !");
        }
    }

    @Override
    public String toString() {
       
        return "Prodotto: " + nome + " Prezzo: " + prezzo + " Quantità: " + quantita + " Valore magazzino: " + calcolaValoreMagazzino();
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }
}