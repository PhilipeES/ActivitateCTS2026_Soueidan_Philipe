package cts.observer.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    List<IClient> listaClientiAbonati;

    public Restaurant() {
        this.listaClientiAbonati = new ArrayList<>();
    }

    @Override
    public void aboneazaClient(IClient client) {
        listaClientiAbonati.add(client);
    }

    @Override
    public void dezaboneazaClient(IClient client) {
        listaClientiAbonati.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient client : listaClientiAbonati){
            client.notificare(mesaj);
        }
    }

    public void produsNou(){
        trimiteNotificare("A aparut un produs nou! Arata-ne aceasta notificare si primesti o mostra din partea casei!");
    }

    public void meniuNou(){
        trimiteNotificare("Te asteptam sa incerci noul nostru meniu! Arata-ne aceasta notificare si primesti o reducere de 10%!");
    }
}
