
public class UsaProdotto{

    public static void main(String[] args){

        Prodotto computer = new Prodotto("Computer", 500, 3);

        Prodotto mouse = new Prodotto("Mouse", 10, 5);

        Prodotto tastiera = new Prodotto("Tastiera", 20, 10);

        System.out.println(computer);
        System.out.println(mouse);
        System.out.println(tastiera);

        double prezzoPreSconto = computer.getPrezzo();

        System.out.println("Prezzo senza sconto " + prezzoPreSconto);

        try {
            computer.applicaSconto(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Non puoi inserire questo valore : " + e.getMessage());
        }
        double prezzoScontato = computer.getPrezzo();
        System.out.println("Prezzo attuale " + (prezzoScontato));

         try {
            computer.applicaSconto(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Non puoi inserire questo valore : " + e.getMessage());
        }

    }
}