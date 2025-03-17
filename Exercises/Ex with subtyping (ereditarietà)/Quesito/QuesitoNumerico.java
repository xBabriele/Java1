package Es4_ereditarieta;

public class QuesitoNumerico extends Quesito {
    public QuesitoNumerico(String d, String r, int p) {
        super(d,r,p);
    }

    public int ask() {
        System.out.println(domanda);
        String risposta = " ";
        while(!risposta.matches("[0-9]+")) {
            risposta = scan.nextLine();
        }
        if (risposta.equals(this.risposta)) return punteggio;
        return 0;
    }
}
