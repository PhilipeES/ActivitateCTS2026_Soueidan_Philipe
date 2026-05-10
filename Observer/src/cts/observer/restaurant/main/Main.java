package cts.observer.restaurant.main;

import cts.observer.restaurant.clase.ClientAbonat;
import cts.observer.restaurant.clase.IClient;
import cts.observer.restaurant.clase.IRestaurant;
import cts.observer.restaurant.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        System.out.println("DESIGN PATTERN COMPORTAMENTAL - OBSERVER\n");
        IClient client = new ClientAbonat("Natalia");
        IClient client1 = new ClientAbonat("Philipe");
        IClient client2 = new ClientAbonat("Edward");
        IClient client3 = new ClientAbonat("Juanito");
        IClient client4 = new ClientAbonat("Lucas");
        IClient client5 = new ClientAbonat("Rodrigo");

        IRestaurant restaurant = new Restaurant();

        restaurant.aboneazaClient(client);
        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);
        restaurant.aboneazaClient(client3);

        ((Restaurant)restaurant).meniuNou();
        ((Restaurant)restaurant).produsNou();

        restaurant.dezaboneazaClient(client2);
        ((Restaurant)restaurant).meniuNou();
        restaurant.trimiteNotificare("Sex?");
    }
}