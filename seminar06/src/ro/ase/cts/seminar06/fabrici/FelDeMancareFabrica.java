package ro.ase.cts.seminar06.fabrici;

import ro.ase.cts.seminar06.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

}
