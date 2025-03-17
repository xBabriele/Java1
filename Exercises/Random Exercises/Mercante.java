import java.util.Scanner;

public class Mercante{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean cicle = true;
        int finale = 0;
        int resto = 0;
        int credito;
        int cost;
        
        System.out.print("Immetti i soldi dati dall'acquirente: "); //Credito
        int pagato = scan.nextInt();
        
        while(cicle){
            System.out.print("Immetti il costo dell'oggetto preso: "); //Costo oggetto preso
            cost = scan.nextInt();
            if((pagato - cost) <= 0) {
                cicle = false;
            }
            if(pagato - cost > 0) {
                resto += cost;
            }
            if(cost >= 500) {
                cost = cost - (cost / 100) * 5;
            } else if(cost >= 100) {
                cost = cost - (cost / 100) * 2;
            } else if (cost >= 50) {
                cost = cost - (cost / 100) * 1;
            }
            
            if(cost > pagato){
                System.out.println("Credito insufficciente");
            }else{
                credito = pagato - cost;
                System.out.println("Il resto è di: " + credito + "€");
                pagato -= cost;
                finale += cost;
            }
        }
        System.out.println("Il prezzo finale è di: " +  finale + "€");
        System.out.println("Il prezzo senza sconto è di: " + resto + "€ con sconto di: " + (resto - finale) + "€");
        
        cicle = true;
        
        int b500=0;
        int b200=0;
        int b100=0;
        int b50=0;
        int b20=0;
        int b10=0;
        int b5=0;
        int m2=0;
        int m1=0;
        
        while(cicle) {
            if (resto >= 500) {
                b500 = resto/500;
                resto -= b500 * 500;
            } else if(resto >= 200) {
                b200 = resto/200;
                resto -= b200 * 200;
            } else if(resto >= 100) {
                b100 = resto/100;
                resto -= b100 * 100;
            } else if(resto >= 50) {
                b50 = resto/50;
                resto -= b50 * 100;
            } else if(resto >= 20) {
                b20 = resto/20;
                resto -= b20 * 20;
            } else if(resto >= 10) {
                b10 = resto/10;
                resto -= b10 * 10;
            } else if(resto >= 5) {
                b5 = resto/5;
                resto -= b5 * 5;
            } else if(resto >= 2) {
                m2 = resto/2;
                resto -= m2 * 2;
            } else if(resto >= 1) {
                m1 = resto;
                resto -= m1;
            } else {
                cicle=false;
            }
        }
        System.out.println("Banconote:\n" + "500: " + b500 + "\n200: " + b200 + "\n100: " + b100 + "\n50: " + b50 + "\n20: " + b10 + "\n5. " + b5 + "\n2: " + m2 + "\n1: " + m1);
        
    }
}