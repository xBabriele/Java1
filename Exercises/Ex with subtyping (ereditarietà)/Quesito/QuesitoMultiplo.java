package Es4_ereditarieta;

public class QuesitoMultiplo extends QuesitoNumerico {
    private String [] opzioni;

    public QuesitoMultiplo(String d, String r, int p, String [] opzioni) {
        super(d, r, p);
        this.opzioni = opzioni;
    }

    public int ask() {
        System.out.println(domanda);
        for(int i=0; i<opzioni.length; i++) {
            System.out.println("\t" + "(" + i + ") "+ opzioni[i]);
        }

        String risposta = " ";
        while(!risposta.matches("[0-9]+")) {
            risposta = scan.nextLine();
        }
        if (risposta.equals(this.risposta)) return punteggio;
        return 0;
    }
}
