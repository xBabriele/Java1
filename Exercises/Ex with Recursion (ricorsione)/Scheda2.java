/**
 * @author Gabriel Madiotto 4A
 * @see seconda scheda su esercizi sulla ricorsione in classroom {@link https://classroom.google.com}
 * @version 1.0, 27/10/2024
 * Esercizi sulla ricorsione della seconda scheda in classroom, totale di es: 5, gli esercizi hanno prevalentemente l'uso dell'array e di un'altra variabile per ciclare al suo interno
 */

public class Scheda2 {
    public static void main(String [] args) {
        int [] array = {21, 123, 123, 32};
        int dim = array.length-1;

        System.out.println(es5(dim));
    }

    /**
     * @param array - array degli elementi in cui cercare l'elemento minore
     * @param n - indice dell'array partendo dalla lunghezza dell'array-1
     * @return restituisce il elemento minore dell'array
     */
    public static int es1(int [] array, int n) {
        if(n > 0)
            if(array[n] < es1(array, n-1))
                return array[n];
            else
                return es1(array, n-1);
        else
            return array[n];
    }

    /**
     * @param array - array degli elementi in cui cercare un elemento uguale a 10
     * @param n - indice array, parte dalla lunghezza dell'array meno 1
     * @return se all'interno dell'array non riesce a trovare un elemento che sia uguale a '10', quando n sarà minore di 0 (-1) returnerà false, altrimenti true se ne trova almeno uno uguale a 10
     */
    public static boolean es2(int [] array, int n) {
        if(n < 0)
            return false;
        else {
            if(array[n] == 10)
                return true;
            else
                return es2(array, n-1);
        }
    }

    public static boolean es3(int [] array, int n) {
        if(n > 0) {
            if(array[n] > 10)
                return es3(array, n-1);
            else
                return false;
        }
        
        else
            return true;
    }

    public static int es4(int n) {
        if(n == 1)
            return 2;
        else
            return 2*es4(n-1);
    }

    public static int es5(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return 2*es5(n-2) + 5;
    }
}