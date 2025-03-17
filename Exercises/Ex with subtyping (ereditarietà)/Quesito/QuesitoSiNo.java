package Es4_ereditarieta;

public class QuesitoSiNo extends Quesito{
    public QuesitoSiNo(String d, String r, int p) {
        super(d,r,p);
    }

    public int ask() {
        System.out.println(domanda);
        String risposta = "";
        while(!risposta.toLowerCase().matches("si|no")) {
            risposta = scan.nextLine();
        }
        if (risposta.equals(this.risposta)) return punteggio;
        return 0;
    }
}
