package Ereditarieta.StudioDentistico;
import java.util.ArrayList;

public class Studio {
    protected String studio;
    protected String sede;
    protected ArrayList<Dipendente> elenco = new ArrayList<>();

    public Studio(String studio, String sede, ArrayList<Dipendente> elenco) {
        this.studio = studio;
        this.sede = sede;
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return "Denominazione: " + studio + "\nSede: " + sede;
    }

    public int getQuantiIgienisti() {
        int count=0;
        for (Dipendente x : elenco) {
            if (x.getFunzione().toLowerCase().equals("igienista")) { count++; }
        }
        return count;
    }

    public int stipendi() {
        int stip=0;
        for (Dipendente x : elenco) {
            stip += x.getStipendio();
        }
        return stip;
    }
}