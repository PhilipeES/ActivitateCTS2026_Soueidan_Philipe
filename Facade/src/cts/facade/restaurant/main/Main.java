package cts.facade.restaurant.main;

import cts.facade.restaurant.clase.Client;
import cts.facade.restaurant.clase.Masa;
import cts.facade.restaurant.clase.ReceptionerFacade;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);
        Masa masa3 = new Masa(3, false, true, true);

        Client client1 = new Client("Philipe");
        Client client2 = new Client("Natalia");
        Client client3 = new Client("Rares");

        ReceptionerFacade facade1 = new ReceptionerFacade(masa1);
        ReceptionerFacade facade2 = new ReceptionerFacade(masa2);
        ReceptionerFacade facade3 = new ReceptionerFacade(masa3);

        facade1.pregatesteMasa(client1);
        facade2.pregatesteMasa(client2);
        facade3.pregatesteMasa(client3);
    }
}