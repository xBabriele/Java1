import java.util.Scanner;
import java.util.Random;

public class Es {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        while(!scan.hasNextInt()) {
            scan.next();
        }
        int num = scan.nextInt();
        int [] money = monete(num);
        for(int i=0; i<money.length; i++) {
            System.out.println(money[i]);
        }
        
        int [] a1 = {1,2,3,4,6666};
        int [] a2 = {2,6,7,9,10,30,1,6};
        int [] union = unione(a1, a2);
        for(int i=0; i<union.length; i++) {
            System.out.print(union[i] + " ");
        }
    }
    public static int[] monete(int num) {
        int [] monete = new int[6];
        
        while(num > 0) {
            if(num >= 50) {
                num -= 50;
                monete[0]++; 
            } else if(num >= 20) {
                num -= 20;
                monete[1]++;
            } else if(num >= 10) {
                num -= 10;
                monete[2]++;
            } else if(num >= 5) {
                num -= 5;
                monete[3]++;
            } else if(num >= 2) {
                num -= 2;
                monete[4]++;
            } else if(num >= 1) {
                num--;
                monete[5]++;
            }
        }
        return monete;
    }
    public static int[] unione(int [] arr1, int [] arr2) {
        String u = "";
        for(int i=0; i<arr1.length; i++) {
            u += arr1[i] + " ";
        }
        for(int i=0; i<arr2.length; i++) {
            if(!IsThere(arr2[i], arr1)) {
                u += arr2[i] + " ";
            }
        }
        String [] union = u.split(" ");
        
        int [] unionInt = new int[union.length];
        for(int i=0; i<unionInt.length; i++) {
            unionInt[i] = Integer.parseInt(union[i]);
        }
        return unionInt;
    }
    public static boolean IsThere(int num, int [] array) {
        for(int i=0; i<array.length; i++) {
            if(num == array[i]) {
                return true;
            }
        }
        return false;
    }
}