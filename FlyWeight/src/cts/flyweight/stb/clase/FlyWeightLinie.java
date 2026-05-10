package cts.flyweight.stb.clase;

import java.util.HashMap;

public class FlyWeightLinie {
    public HashMap<Integer,Linie> registruLinii = new HashMap<>();

    public ILinie cautaLinie(int nrLinie, String primaStatie, String ultimaStatie){
        ILinie linie = registruLinii.get(nrLinie);
        if( linie == null){
            linie = new Linie(nrLinie, primaStatie, ultimaStatie);
        }
        return linie;
    }
}
