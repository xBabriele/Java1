import java.io.PrintStream;

public class Ricorsiva2 {
    public static void main(String [] args) {
        String str = "stollots";
        System.out.println(Palindroma(str));
    }

    public static boolean Appartiene(String s, char c) {
        if (s.length() == 0) return false;
        if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(c)) return true;
        else return Appartiene(s.substring(1), c);
    }

    public static int Occorrenze(String s, char c) {
        if (s.equals("")) return 0;
        if (s.charAt(0) == c) return 1 + Occorrenze(s.substring(1), c);
        else return Occorrenze(s.substring(1), c) ;
    }

    public static String Underscore(String s) {
        if (s.equals("")) return "";
        if (s.charAt(0) == ' ') return "_" + Underscore(s.substring(1));
        else return s.charAt(0) + Underscore(s.substring(1));
    }

    public static String Reverse(String s) {
        if (s.equals("")) return "";
        else return s.charAt(s.length()-1) + Reverse(s.substring(0, s.length()-1));
    }

    public static boolean Palindroma(String s) {
        if (s.equals("")) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        else return Palindroma(s.substring(1, s.length()-1));
    }

    public static void Permutazioni(String s, PrintStream p) {
        
    }
}
