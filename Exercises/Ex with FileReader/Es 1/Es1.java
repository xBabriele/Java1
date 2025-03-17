/**
 * @author Gabriel Madiotto 4A
 * @version 0.0.1 20/11/2024
 * Esercizio uno della verifica di informatica sulla ricorsione e file reading
 */

import java.util.Scanner;
import java.io.*;

public class Es1 {
    public static void main(String [] args) throws IOException {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");
        Scanner scan = new Scanner(reader);
        PrintWriter out = new PrintWriter(writer);

        String str1, str2, risultato;

        while (scan.hasNextLine()) {
            str1 = scan.next();
            str2 = scan.next();
            risultato = Uguali(str1, str2);
            out.println(risultato);
        }

        out.close();
        scan.close();
    }

    /**
     * @param s1 - Prima stringa da controllare che sia uguale o quasi a s2
     * @param s2 - Seconda stringa da controllare che sia uguale o quasi a s1
     * @return Ritorna "Non sono uguali" quando le due parole non sono uguali, ritorna "Sono uguali!" se invece sono uguali o ritorna "Sono quasi uguali!" se sono uguali ma una lettera diversa
     */
    public static String Uguali(String s1, String s2) {
        if (s1.length() != s2.length()) return "Non sono uguali";   //Se le stringhe non hanno lunghezza uguale, non possono essere uguali

        if (s1.charAt(0) == s2.charAt(0)) {
            for (int i=1; i < s1.length(); i++) {
                if (Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s2.charAt(i))) return "Non sono uguali";
                if (s1.charAt(i) != s2.charAt(i)) return "Sono quasi uguali";
            }
            return "Sono uguali!";
        }
        if (Character.toLowerCase(s1.charAt(0)) == Character.toLowerCase(s2.charAt(0))) {
            for (int i=0; i < s1.length();) {
                i += 1;
                if (Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s2.charAt(i))) return "Non sono uguali";
                else if (s1.charAt(i) != s2.charAt(i)) return "Sono quasi uguali";
                else return "Sono uguali!";
            }
            return "Sono quasi uguali";
        }
        else return "Non sono uguali";
    }
}
