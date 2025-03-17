import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //vargargs -> ... -> String [] args
        Scanner scan = new Scanner(System.in);
        //String s = new String("Ciao");
        
        //System.out.println("Hello world!\n"); // Print
        
        /*
        int x = scan.nextInt();
        double y = scan.nextDouble();
        float z = scan.nextFloat();
        short l = scan.nextShort();*/
        
        String s = scan.nextLine(); //Input Stringa
        //int len = s.length(); -> Lunghezza Stringa
        
        System.out.print("+");
        for(int x=0; x <= (s.length()-1); x++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|" + s + "|");
        System.out.print("+");
        for(int x=0; x <= (s.length()-1); x++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.print("FINITO 1° ES");
        
        //if     else if     else
        
        if(s == "Lorenzo") {
            System.out.println("Sei un figo");
        } else if(s == "Madiotto") {
            System.out.println("Sei stra figo");
        } else {
            System.out.println("Zanin");
        }
        
        System.out.print("FINITO 1° ES");
        
        // ES MAX TRA 3 NUMERI
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        int max;
        
        if(x >= y) {
            if(x >= z) {
                max = x;
            } else {
                max = z;
            }
        } else if(y >= z) {
            max = y;
        } else {
            max = z;
        }
        
        boolean cicle = true;
        int somma = 0;
        System.out.println("Scrivi i numeri da sommare (0 per fermarti)");
        while(cicle) {
            int num = scan.nextInt();
            if(num == 0) {
                cicle = false;
            } else {
                somma += num;
            }
        }
        
        cicle = true;
        int molt = 1;
        System.out.println("Scrivi i numeri da sommare (0 per fermarti)");
        while(cicle) {
            int num = scan.nextInt();
            if(num == 0) {
                cicle = false;
            } else {
                molt *= num;
            }
        }
    }
}