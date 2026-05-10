package cts.proxy.stb.main;

import cts.proxy.stb.clase.Autobuz;
import cts.proxy.stb.clase.IStatie;
import cts.proxy.stb.clase.ProxyStatie;
import cts.proxy.stb.clase.Statie;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- DESIGN PATTERN STRUCTURAL - PROXY F8 ----------\n");

        Autobuz autobuz = new Autobuz(335, 10);
        Autobuz autobuz1 = new Autobuz(131,0);
        Autobuz autobuz2 = new Autobuz(282,1);

        IStatie statie = new Statie("Aviatorilor");
        ProxyStatie proxy = new ProxyStatie(statie);

        statie.opreste(autobuz);
        proxy.opreste(autobuz1);
        proxy.opreste(autobuz2);
    }
}
