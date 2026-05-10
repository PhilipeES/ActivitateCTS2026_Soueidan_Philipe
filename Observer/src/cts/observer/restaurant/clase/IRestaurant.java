package cts.observer.restaurant.clase;

public interface IRestaurant {
    void aboneazaClient(IClient client);
    void dezaboneazaClient(IClient client);
    void trimiteNotificare(String mesaj);

}
