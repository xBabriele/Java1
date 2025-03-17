public abstract class CorsoBase {
    protected String nome;
    protected String data;
    protected int costo;
    protected int giorni;

    protected static int partecipanti;

    public CorsoBase(String nome, String data, int costo, int giorni) {
        this.nome = nome;
        this.data = data;
        this.costo = costo;
        this.giorni = giorni;

        partecipanti++;
    }
    public int CostoTotale() {
        return this.costo * this.giorni;
    }

    public int IncassoTot() {
        return CostoTotale() * partecipanti;
    }

    public void EliminaUltimo() {
        partecipanti--;
    }
}