public class Example {
    public static void main(String [] args) {
        String var = new String("Hello");
        System.out.println(var);

        java.util.Scanner scan = new java.util.Scanner(System.in);      // al posto di importare si può usare così
        scan.nextLine();
        

        var += " World!";
        System.out.println(var);
    }
}
