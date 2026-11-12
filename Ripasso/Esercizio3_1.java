package Ripasso;

public class Esercizio3_1 {

    public static void main(String[] args) {

    // Hai un array contenente diverse parole. Devi realizzare un metodo che
    // restituisca quante di queste parole sono palindrome

        String[] test1 = { "Anna", "casa", "osso" };
        String[] test2 = { "Java", "Spring", "Docker" };
        String[] test3 = { "Radar", "anna", "OSSO" };
        String[] test4 = { "", null, "radar" };
        String[] test5 = {};
        String[] test6 = null;

        System.out.println("Test 1: " + contaPalindrome(test1));
        System.out.println("Test 2: " + contaPalindrome(test2));
        System.out.println("Test 3: " + contaPalindrome(test3));
        System.out.println("Test 4: " + contaPalindrome(test4));
        System.out.println("Test 5: " + contaPalindrome(test5));
        System.out.println(contaPalindrome(test6));

    }

    public static boolean isPalindroma(String parola) {
        if (parola == null || parola.isEmpty()) {
            throw new IllegalArgumentException("Parola non valida");
        }
        parola = parola.toLowerCase();
        for (int i = 0; i < parola.length() / 2; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int contaPalindrome(String[] parole) {
        if (parole == null) {
            throw new IllegalArgumentException("L'array non può essere null");
        }
        int contatore = 0;
        for (String p : parole) {
            if (p != null && !p.isEmpty()) {
                if (isPalindroma(p)) {
                    contatore++;
                }
            }
        }
        return contatore;
    }
}