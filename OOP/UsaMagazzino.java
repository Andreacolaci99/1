package OOP;

public class UsaMagazzino {

    public static void main(String[] args) {

        Prodotto mouse = new Prodotto("Mouse", 5, 15);
        Prodotto tastiera = new Prodotto("Tastiera", 10, 30);

        Magazzino magazzino = new Magazzino();

        magazzino.aggiungiProdotto(mouse);
        magazzino.aggiungiProdotto(tastiera);

        try {
            magazzino.getAll().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Lista protetta correttamente");
        }

        System.out.println(magazzino.contaProdotti());

    }
}
