package Ereditarieta.StudioDentistico;

public class Dipendente {
    protected String cognome;
    protected String nome;
    protected String funzione;
    protected int stipBase;
    protected int anni;

    public Dipendente(String cognome, String nome, String funzione, int stipBase, int anni) {
        this.cognome = cognome;
        this.nome = nome;
        this.funzione = funzione;
        this.stipBase = stipBase;
        this.anni = anni;
    }

    @Override
    public String toString() {
        return "Cognome: " + cognome + "\nNome: " + nome + "\nFunzione: " + funzione + "\nStipendio base: " + stipBase;
    }


    public String getCognome() { return cognome; }
    public String getNome() { return nome; }
    public String getFunzione() { return funzione; }
    public int getStipendio() { return stipBase; }

    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setNome(String nome) { this.nome = nome; }
    public void setFunzione(String funzione) { this.funzione = funzione; }
    public void setStipendio(int stipBase) { this.stipBase = stipBase; }


    public int stipendioMensile() {
        return stipBase + (50*anni);
    }
}
