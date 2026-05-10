package cts.flyweight.stb.main;

import cts.flyweight.stb.clase.Autobuz;
import cts.flyweight.stb.clase.FlyWeightLinie;
import cts.flyweight.stb.clase.ILinie;
import cts.flyweight.stb.clase.Linie;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n---------- FLYWEIGHT - STB F.9. ----------\n");

        FlyWeightLinie registruLinii = new FlyWeightLinie();
        ILinie linie = new Linie(100, "Piata Unirii", "Aeroport OTP");
        ILinie linie2 = new Linie(300, "Clabucet", "Galeriile Orizont");

        linie.desfasuratorLinie(new Autobuz("Logan", 2007, 44));
        linie2.desfasuratorLinie(new Autobuz("seria5", 2020, 5));

        registruLinii.cautaLinie(101, "Piata Unirii", "Aeroport OTP").desfasuratorLinie(new Autobuz("AMG", 2021, 2));
        registruLinii.cautaLinie(100, "Piata Unirii", "Aeroport OTP").desfasuratorLinie(new Autobuz("AMG", 2021, 2));

    }
}
