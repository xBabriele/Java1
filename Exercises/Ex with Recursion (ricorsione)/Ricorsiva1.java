public class Ricorsiva1 {
    public static void main(String [] args) {
        int [] array = {1,2,3,4,5,-2,-5,8,9,-1};
        System.out.println(Pos(array, (array.length-1)));
    }

    public static int Somma(int [] array, int n) {  //Esercizio 1 su sommare gli elementi di un array in modo ricorsivo
        if (array.length == 0) return 0;
        
        if (n > 0) return array[n] + Somma(array, n-1);
        else        return array[0];
    }

    public static int Min(int [] array, int n) {    //Esercizio 2 sul trovare il minimo di un array
        if (array.length == 0) return 0;
        if (n > 0) {
            if (array[n] < Min(array, n-1)) return array[n];
            else return Min(array, n-1);
        }
        else return array[n];
    }

    public static boolean Trova10(int [] array, int n) {
        if (array.length == 0) return false;
        if (n >= 0) {
            if (array[n] == 10) return true;
            else return Trova10(array, n-1);
        }
        else return false;
    }

    public static boolean Greater10(int [] array, int n) {
        if (array.length == 0) return false;
        if (n >= 0) {
            if (array[n] <= 10) return false;
            else return Greater10(array, n-1);
        }
        else return true;
    }

    public static int POT(int n) {
        if (n == 1) return 2;
        else return 2*POT(n-1);
    }

    public static int TIME(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return 2*TIME(n-2) + 5;
    }

    public static int Pos(int [] array, int n) {
        if (array.length == 0) return 0;
        if (n >= 0) {
            if (array[n] >= 0) return 1 + Pos(array, n-1);
            else return Pos(array, n-1);
        }
        else return 0;
    }
}
