package cts.chainOfResponsabilty.restaurant.v1.main;

import cts.chainOfResponsabilty.restaurant.v1.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------CHAIN OF RESPONSIBILITY, Restaurant B16---------");

        Notificare notificare = new SMS();
        Notificare notificare2 = new Email();
        Notificare notificare3 = new Manager();

        notificare.setSuccesor(notificare2);
        notificare2.setSuccesor(notificare3);

        System.out.println(notificare.trimiteNotificare(new Client("Natalia", null, "0765420699")));
        System.out.println(notificare.trimiteNotificare(new Client("Andreea", "sava.aki@gmail.com", null)));
        System.out.println(notificare.trimiteNotificare(new Client("Philipe", null, null)));

    }
}