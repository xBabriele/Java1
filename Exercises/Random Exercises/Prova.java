import java.util.Scanner;

public class Prova {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String ci = "ciaooo";
        String [] ciao = ci.split("");
        ci = "";
        for (int i=0; i<ciao.length; i++) {
            ci += ciao[i] + "k";
        }
        System.out.println(ci);
    }
}