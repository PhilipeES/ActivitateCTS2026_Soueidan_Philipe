package ro.ase.cts.seminar09.strategy.main;

import ro.ase.cts.seminar09.strategy.clase.Client;
import ro.ase.cts.seminar09.strategy.clase.PlataCash;

//B.11. Este dorită implementarea modului de plată pentru clienții restaurantului. Modul de plată îl
//decide clientul în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau cash.
//Sa se implementeze modulul de plata al restaurantului.
public class Main {
    public static void main(String[] args) {
        System.out.printf("DESIGN PATTERN: STRATEGY\n");
        Client client = new Client("Christopher");
        client.tranzactie(100);

        client.setModalitateDePlata(new PlataCash());
        client.tranzactie(1500);

    }
}