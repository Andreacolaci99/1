package OOP;

public class Veicolo {

    private String marca;

    private int anno;

    public Veicolo(String marca, int anno) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("La marca non può essere null o vuota");
        }
        if (anno <= 0) {
            throw new IllegalArgumentException("L'anno non puo' essere 0");
        }
        this.marca = marca;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public String descrivi() {
        return "Veicolo: " + getMarca();
    }
}
