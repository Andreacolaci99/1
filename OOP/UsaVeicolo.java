package OOP;

public class UsaVeicolo {

    public static void main(String[] args) {

        Veicolo veicolo = new Veicolo("Fiat", 2020);
        Auto auto = new Auto("Peugeot", 2023, 5);

        System.out.println(veicolo.descrivi());
        System.out.println(auto.descrivi());
    }
}
