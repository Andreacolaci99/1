package OOP;

public class Libro {

    private String titolo;
    private int pagine;

    public Libro(String titolo, int pagine) {
        this.titolo = titolo;
        this.pagine = pagine;
    }

    public String descrizione() {
        return titolo + " - " + pagine + " pagine";
    }
}