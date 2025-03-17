package Ereditarieta;

public class Dipendente extends Persona {
    private int anno;
    private int stipendio;

    public Dipendente(String nome, String indirizzo, int anno, int stipendio) {
        super(nome, indirizzo);
        this.anno = anno;
        this.stipendio = stipendio;
    }

    public int getAnno() { return anno; }
    public int getStipendio() { return stipendio; }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public void visualizza() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Indirizzo: " + this.getIndirizzo());
        System.out.println("Anno: " + anno);
        System.out.println("Stipendio: " + stipendio);
    }

    public boolean guadagnaDiPiu(Dipendente dip) {
        if (this.stipendio > dip.stipendio) return true;
        else return false;
    }
}
