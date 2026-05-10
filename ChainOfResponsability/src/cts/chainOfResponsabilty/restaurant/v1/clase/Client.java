package cts.chainOfResponsabilty.restaurant.v1.clase;

public class Client {
    protected String nume;
    protected String email;
    protected String numarDeTelefon;

    public Client() {
        this.nume = nume;
        this.email = email;
        this.numarDeTelefon = numarDeTelefon;
    }

    public Client(String nume, String email, String numarDeTelefon) {
        this.nume = nume;
        this.email = email;
        this.numarDeTelefon = numarDeTelefon;
    }


    protected String getEmail() {
        return email;
    }

    protected String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    protected String getNume() {
        return nume;
    }
}
