package cts.chainOfResponsabilty.restaurant.v2.main;

import cts.chainOfResponsabilty.restaurant.v2.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Varianta omeneasca a exercitiului");

        Notificare sms = new SMS();
        Notificare eMail = new Email();
        Notificare posta = new Adresa();
        Notificare navem = new Manager();
        Notificare destept = new Bursier();


        sms.setSuccesor(eMail);
        eMail.setSuccesor(posta);
        posta.setSuccesor(destept);
        destept.setSuccesor(navem);

        System.out.println(sms.trimiteNotificare("Alexia", ""));
        System.out.println(sms.trimiteNotificare("Natalia", "sava.aki@yahoo.ro"));
        System.out.println(sms.trimiteNotificare("Philipe", "+40734468420"));
        System.out.println(sms.trimiteNotificare("Lip", "Bulevarul Aviatorilor 1, Sector 1, Bucuresti, cod postal 011413"));
        System.out.println(sms.trimiteNotificare("Edward", "9"));


    }
}
