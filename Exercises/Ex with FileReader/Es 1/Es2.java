/**
 * @author Gabriel Madiotto 4A
 * @version 0.0.1 20/11/2024
 * Esercizio uno della verifica di informatica sulla ricorsione e file reading
 */

public class Es2 {
    public static void main(String [] args) {
        int [] array = {12,40,12,320};
        boolean risultato = Magg10(array, array.length-1);
        System.out.println(risultato);
    }

    /**
     * @param array - Array dei numeri da controllare se sono maggiori di 10
     * @param n - Indice dell'array che va a scalare ad ogni ricorsione fino al valore '-1'
     * @return Se tutti gli elementi dell'array sono maggiori di 10
     */
    public static boolean Magg10(int [] array, int n) {
        if (array.length == 0) return false;
        if (n >= 0) {
            if (array[n] <= 10) return false;
            else return Magg10(array, n-1);
        }
        else return true;
    }
}
 