public class Main {
    
    public static void main(String[] args) {
        
        Magazzino magazzino = new Magazzino();

        Prodotto computer = new Prodotto("Computer", 1000, 5);
        Prodotto mouse = new Prodotto("Mouse", 10, 15);
        Prodotto tastiera = new Prodotto("Tastiera", 20, 12);
        Prodotto monitor = new Prodotto("Monitor", 300, 6);
        Prodotto cuffie = new Prodotto("Cuffie", 100, 23);

        magazzino.aggiungiProdotto(computer);
        magazzino.aggiungiProdotto(mouse);
        magazzino.aggiungiProdotto(tastiera);
        magazzino.aggiungiProdotto(monitor);
        magazzino.aggiungiProdotto(cuffie);

        magazzino.stampaProdotti2();
        System.out.println("Valore del magazzino : " + magazzino.calcolaValoreTotale());
        String mouseStamp = ("mouse");
        System.out.println(magazzino.cercaPerNome("cavo"));
        System.out.println(magazzino.trovaProdottoPiuCostoso());
        System.out.println(magazzino.trovaProdottoConPiuQuantita());
        System.out.println(mouseStamp);
        
    }
}
