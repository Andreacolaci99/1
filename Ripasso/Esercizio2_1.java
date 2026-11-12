package Ripasso;

public class Esercizio2_1 {

    public static void main(String[] args) {
        String parola = "otto";
       // char carattere = 'a';

        System.out.println(isPalindroma(parola));
    }

    public static int contaCarattere(String parola, char carattere) {
        int numeroCaratteri = 0;
        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == carattere) {
                numeroCaratteri++;
            }
        }
        return numeroCaratteri;
    }

    public static String invertiParola1(String parola) {
        String parolaInvertita = "";
        for (int i = parola.length() - 1; i >= 0; i--) {
            parolaInvertita += parola.charAt(i);
        }
        return parolaInvertita;
    }

    public static String invertiParola2(String parola) {
        String parolaInvertita = "";
        for (char p : parola.toCharArray()) {
            parolaInvertita = p + parolaInvertita;
        }
        return parolaInvertita;
    }

    public static boolean isPalindroma(String parola) {

        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindroma2(String parola) {

        parola = parola.toLowerCase();

        for (int i = 0; i < parola.length() / 2; i++) {

            char sinistra = parola.charAt(i);

            char destra = parola.charAt(parola.length() - 1 - i);

            if (sinistra != destra) {

                return false;

            }
        }
        return true;
    }
}