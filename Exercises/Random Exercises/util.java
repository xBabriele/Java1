import java.util.Scanner;
import java.util.Random;

public class util {
    public static int[]creaArray(int min, int max, int dim) {
        Random rand = new Random();
        int [] array = new int[dim];
        for(int i=0; i<dim; i++) {
            array[i] = rand.nextInt(max-min+1)+min;
        }
        return array;
    }
    public static int[] quadratiArray(int [] array) {
        int [] quadrati = new int[array.length];
        for(int i=0; i<array.length; i++) {
            quadrati[i] = (int)Math.pow(array[i], 2);
        }
        return quadrati;
    }
    public static void stampaArray(int [] array) {
        System.out.print("[ ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    public static String maiuscole(String str) {
        String frase = "";
        frase += Character.toUpperCase(str.charAt(0));
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == ' ') {
                frase += Character.toUpperCase(str.charAt(i));
            } else {
                frase += str.charAt(i);
            }
        }
        return frase;
    }
    public static String creaSpazi(String str) {
        String frase = "";
        frase += str.charAt(0);
        for(int i=1; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                frase += " " + str.charAt(i);
            } else {
                frase += str.charAt(i);
            }
        }
        return frase;
    }
    public static int[] stringToArray(String str) {
        int [] array = new int[str.length()];
        String [] strArray = str.split("");
        
        for(int i=0; i<str.length(); i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        return array;
    }
}