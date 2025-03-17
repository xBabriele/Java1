import java.util.Scanner;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        int[] a;
        int[] q;
        int min, max, dim;
        min = 0;
        max = 10;
        dim = max - min + 1;
        // crea un array di dimensione dim con elementi casuali compresi tra min e max
        a = util.creaArray(min, max, dim);
        // crea un array di dim elementi con i quadrati dei valori presenti in a
        // Esempio: a = {1,2,3,4,5} -> q = {1,4,9,16,25}
        q = util.quadratiArray(a);
        util.stampaArray(q);
        
        String s1 = "ciao Ciao ciao  c 56";
        System.out.println("Stringa composta da parole con lettere minuscole e maiuscole: "+s1);
        // rende maiuscola la prima lettera di ogni parola che forma la stringa
        String s2 = util.maiuscole (s1); 
        //Esempio: Ciao Ciao Ciao
        System.out.println("Stringa composta da parole con lettere maiuscole: "+s2); 
        System.out.println();
    
        String s3 = "CiaoCiaoCiao3453456cfC";
        System.out.println("Stringa senza spazi: "+s3);
        // separa le parole caratterizzate dalla prima lettera maiuscola con uno spazio
        //Esempio: "CiaoCiaoCiao" -> "Ciao Ciao Ciao"
        String s4 = util.creaSpazi (s3); 
        System.out.println("Stringa con spazi: "+s4); 
        System.out.println();    
    
        String s5 = "20645754674734563424";
        System.out.println("Stringa composta da cifre: "+ s5);
        int s[];
        // crea un array a partire dalle cifre della stringa 
        //Esempio: s = {2,0,2,4}  
        s = util.stringToArray(s5);
        util.stampaArray(s);
    }
}