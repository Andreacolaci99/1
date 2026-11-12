package Ripasso;

public class Esercizio3_2 {
    public static void main(String[] args){
        //Devi realizzare un programma capace di calcolare quante quantità sono maggiori della media delle quantità presenti nell'array.

        int[] quantita = null;
        
        System.out.println(calcolaMedia(quantita));
        System.out.println(sopraMedia(quantita));
    }

    public static double calcolaMedia(int[] quantita){
        if(quantita == null || quantita.length == 0){
            throw new IllegalArgumentException("L'array non può essere vuoto/null");
        }
        double somma = 0;
        for(int q : quantita){
            somma += q;
        }
        return somma / quantita.length;
    }

    public static int sopraMedia(int[] quantita){
        if(quantita == null || quantita.length == 0){
            throw new IllegalArgumentException("L'array non può essere vuoto/null");
        }
        int superiore = 0;
        double media = calcolaMedia(quantita);

        for(int q : quantita){
            if(q > media){
                superiore++;
            }
        }
        return superiore;
    }
}
