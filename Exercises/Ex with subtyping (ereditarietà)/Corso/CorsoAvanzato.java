public class CorsoAvanzato extends CorsoBase {
    public CorsoAvanzato(String nome, String data, int costo, int giorni) {
        super(nome,data,costo,giorni);

        partecipanti++;
    }
    public int CostoTotale() {
        return (int)(this.costo * this.giorni * 1.15 + 10);
    }

    public int IncassoTot() {
        return CostoTotale() * partecipanti;
    }

    public void EliminaUltimo() {
        partecipanti--;
    }
}