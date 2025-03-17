public class Main {
    public static void main(String [] args) {
        CorsoBase corso = new CorsoGiovani("ciao", "01/01/24", 40, 20);

        System.out.println(corso.CostoTotale());
    }
}
