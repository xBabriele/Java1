package Es4_ereditarieta;

import java.util.Random;
public class Test {
    public static void main(String [] args) {
        Random rand = new Random();
        Quesito [] domande = new Quesito[4];
        String [] opz = {"George", "Madi", "porc", "gianni"};

        domande[0] = new Quesito("Ciao", "Ciao", 4);
        domande[1] = new QuesitoSiNo("bello?", "si", 5);
        domande[2] = new QuesitoNumerico("Quanti anni?", "52", 12);
        domande[3] = new QuesitoMultiplo("Chi era?", "2", 3, opz);

        int punt = domande[rand.nextInt(4)].ask();
        System.out.println(punt);
    }
}
