package OOP;

public class Avvio {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Java Base", 180);
        Libro libro2 = new Libro("Spring Boot", 350);

        System.out.println(libro1.descrizione());
        System.out.println(libro2.descrizione());
    }
}