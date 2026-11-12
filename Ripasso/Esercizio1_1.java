package Ripasso;

public class Esercizio1_1 {

    public static void main(String[] args) {
        
        int[] test2 = { -10, -3, -7, -1 }; // -3

        System.out.println(trovaSecGrande(test2));
    }

    public static int trovaSecGrande(int[] numeri) {
        if (numeri.length > 0) {
            int numMax = numeri[0];
            int secMax = 0;
            boolean trovato = false;

            for (int n : numeri) {
                if (n > numMax) {
                    numMax = n;
                }
            }
            for (int n : numeri) {
                if (n < numMax) {  //Ci serve per trovare il secondo più grande distino, in quanto ignora il 21 poiché è già uguale all'altro 21 (MAX)
                    if (!trovato || n > secMax) { // Ci serve perché grazie al boolean sappiamo se abbiamo trovato il candidato o no, soprattutto per i negativi in quanto partiamo da 0. !trovato = Non ho ancora un candidato, quindi accetto il primo valido. n > secMax = Ho già un candidato, ma ne ho trovato uno migliore. trovato = true = Da questo momento ho un candidato da utilizzare nei confronti.
                        secMax = n;
                        trovato = true;
                    }
                }
            }
            if (trovato == false) {
                throw new IllegalArgumentException("Tutti i numeri sono uguali");
            }
            return secMax;
        } else {
            throw new IllegalArgumentException("Array vuoto");
        }
    }
}
