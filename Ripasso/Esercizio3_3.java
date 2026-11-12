package Ripasso;

public class Esercizio3_3 {

    // Immagina di lavorare su un'applicazione che gestisce i prezzi di alcuni
    // prodotti.
    // Un collega ha scritto questo metodo per calcolare il prezzo più alto:

    public static void main(String[] args) {

        int[] prezzi = null;

        System.out.println(trovaPrezzoMassimo(prezzi));
    }

    public static int trovaPrezzoMassimo(int[] prezzi) {

        if (prezzi == null || prezzi.length == 0) {
            throw new IllegalArgumentException("Non puoi inserire un array vuoto o null");
        }
        int massimo = prezzi[0];

        for (int i = 0; i < prezzi.length; i++) {

            if (prezzi[i] > massimo) {
                massimo = prezzi[i];
            }

        }

        return massimo;
    }
}
