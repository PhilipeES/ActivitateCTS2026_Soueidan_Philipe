package ro.ase.cts.seminar06.fabrici;

import ro.ase.cts.seminar06.clase.Ciorba;
import ro.ase.cts.seminar06.clase.FelDeMancare;
import ro.ase.cts.seminar06.clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire, 500);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipSupa.SupaCrema :
                return new SupaCrema(gramaj, denumire);
            case TipSupa.Ciorba:
                return new Ciorba(gramaj,denumire);
            default:
                throw new IllegalStateException("Unexpected value: " + tip);
        }
    }
}
