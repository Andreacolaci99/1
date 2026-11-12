package Ripasso;

public class Test1 {

    public static void main(String[] args) {

       // int[] numeri = { 12, 5, 8, 21, 3, 17, 10 };

        int[] primoTest = { -4, 0, 7, -9, 6 };
        int[] secondoTest = {};
        System.out.println(numeroPiuGrande(primoTest));
        System.out.println(numeroPiuGrande(secondoTest));
    }

    public static int numeroPiuGrande(int[] numeri) {
        if (numeri.length > 0) {
            int numMax = numeri[0];
            for (int n : numeri) {
                if (n > numMax) {
                    numMax = n;
                }
            }
            return numMax;
        } else {
            throw new IllegalArgumentException("L'array non può essere vuoto");
        }
    }

    public static int numeroPiuPiccolo(int[] numeri) {
        if (numeri.length > 0) {
            int numMin = numeri[0];
            for (int n : numeri) {
                if (n < numMin) {
                    numMin = n;
                }
            }
            return numMin;
        } else {
            throw new IllegalArgumentException("L'array non può essere vuoto");
        }
    }

    public static int calcolaSomma(int[] numeri) {
        int somma = 0;
        for (int n : numeri) {
            somma += n;
        }
        return somma;
    }

    public static void contaPariEDispari(int[] numeri) {
        int numPari = 0;
        int numDispari = 0;
        for (int n : numeri) {
            if (n % 2 == 0) {
                numPari++;
            }else{
                numDispari++;
            }
        }
        System.out.println("I numeri pari sono : " + numPari + " e i numeri dispari sono : " + numDispari);
    }

    public static double calcolaMedia(int[] numeri) {
        double avg = (double) calcolaSomma(numeri) / numeri.length;
        return avg;
    }
}
