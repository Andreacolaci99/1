package OOP;

public class UsaProdotto {

    public static void main(String[] args) {

        System.out.println(Prodotto.getNumeroProdottiCreati());

        Prodotto mouse = new Prodotto("Mouse", 5, 15);
        Prodotto tastiera = new Prodotto("Tastiera", 10, 30);

        System.out.println(Prodotto.getNumeroProdottiCreati());

        try {
            Prodotto errore = new Prodotto("Monitor", -5, 150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Prodotto.getNumeroProdottiCreati());

    }

}
