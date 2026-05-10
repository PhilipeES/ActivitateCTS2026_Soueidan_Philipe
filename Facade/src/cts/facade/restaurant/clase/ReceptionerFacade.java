package cts.facade.restaurant.clase;

import cts.facade.restaurant.clase.Client;
import cts.facade.restaurant.clase.Masa;

public class ReceptionerFacade {
    private Masa masa;

    public ReceptionerFacade(Masa masa) {
        this.masa = masa;
    }

    public void pregatesteMasa(Client client) {
        if (masa.isLiber()) {
            if (masa.isCurat()) {
                if (masa.isServetel()) {
                    System.out.println("Clientul " + client.getNume() + " este asezat la masa " + masa.getNrMasa());
                } else
                    System.out.println("Masa " + masa.getNrMasa() + " nu are servetel!");
            } else
                System.out.println("Masa " + masa.getNrMasa() + " nu a fost curatata!");
        } else
            System.out.println("Masa " + masa.getNrMasa() + " nu este libera!");
    }
}