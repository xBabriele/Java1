public class Es2 {
    public static void main(String [] args) {
        String str = "1 3 6 7 9";

        boolean prova = isLinear(str.split(" "));
        boolean lvl;
        if (prova) {
            lvl = levels(str.split(" "));
            System.out.println(lvl);
        }
    }

    public static boolean levels(String [] array) {                     // Controlla se tra un numero e l'altro ci sono tra 1 e 3 livelli (2 5 ==> true)
        if (Integer.parseInt(array[0]) > Integer.parseInt(array[1])) {
            if (Integer.parseInt(array[0]) < 5) return false;
        } else {
            if (Integer.parseInt(array[0]) > 5) return false;
        }

        for (int i=0; i<array.length-1; i++) {
            if (Math.abs(Integer.parseInt(array[i]) - Integer.parseInt(array[i+1])) < 1 || Math.abs(Integer.parseInt(array[i]) - Integer.parseInt(array[i+1])) > 3) return false;
        }
        return true;
    }

    public static boolean isLinear(String [] array) {                   // Controlla se l'array è solo decrescente o solo crescente
        if (Integer.parseInt(array[1]) > Integer.parseInt(array[0])) {
            for (int i=1; i < array.length-1; i++) {
                if (Integer.parseInt(array[i]) > Integer.parseInt(array[i+1])) return false;
                else if (Integer.parseInt(array[i]) == Integer.parseInt(array[i+1])) return false;
            }
        } else if (Integer.parseInt(array[1]) < Integer.parseInt(array[0])) {
            for (int i=1; i < array.length-1; i++) {
                if (Integer.parseInt(array[i]) < Integer.parseInt(array[i+1])) return false;
                else if (Integer.parseInt(array[i]) == Integer.parseInt(array[i+1])) return false;
            }
        } else return false;

        return true;
    }
}