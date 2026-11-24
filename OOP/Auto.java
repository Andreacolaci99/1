package OOP;

public class Auto extends Veicolo {

    private int numeroPorte;

    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        if (numeroPorte <= 0) {
            throw new IllegalArgumentException("Le porte non possono essere 0");
        }
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String descrivi() {
        return "Auto: " + getMarca() + " - " + numeroPorte + " porte";
    }
}
