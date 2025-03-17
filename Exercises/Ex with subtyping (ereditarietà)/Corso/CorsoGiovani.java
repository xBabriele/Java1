public class CorsoGiovani extends CorsoBase {
    public CorsoGiovani(String nome, String data, int costo, int giorni) {
        super(nome, data, costo, giorni);

        partecipanti++;
    }
    public int CostoTotale() {
        return this.costo * this.giorni - 60;
    }

    public int IncassoTot() {
        return CostoTotale() * partecipanti;
    }

    public void EliminaUltimo() {
        partecipanti--;
    }
}