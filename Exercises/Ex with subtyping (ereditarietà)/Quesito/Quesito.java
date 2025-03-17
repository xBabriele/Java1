package Es4_ereditarieta;

import java.util.Scanner;

public class Quesito {
    protected String domanda;
    protected String risposta;
    protected int punteggio;
    protected Scanner scan = new Scanner(System.in);

    public Quesito(String domanda, String risposta, int punteggio) {
        this.domanda = domanda;
        this.risposta = risposta;
        this.punteggio = punteggio;
    }

    public int ask() {
        System.out.println(domanda);
        String risposta = scan.nextLine();
        if (risposta.equals(this.risposta)) return punteggio;
        return 0;
    }
}
