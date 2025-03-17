package Ereditarieta;

public class UsaDipendente {
    public static void main(String [] args) {
        Dipendente dip1 = new Dipendente("Marco", "Juve", 2018, 1300);
        Dipendente dip2 = new Dipendente("Franco", "Pillo", 2016, 1400);
        Dipendente dip3 = new Dipendente("Fillippo", "Cici", 2020, 1100);
        Dipendente dip4 = new Dipendente("Paolo", "Paoli", 2005, 2500);
        
        System.out.println(dip1 instanceof Dipendente);
        System.out.println(dip1.getClass().getName() == "Ereditarieta.Dipendente");
    }
}
