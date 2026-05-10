package cts.philipe.singleton.practice.main;

import cts.philipe.singleton.practice.clase.LogInventar;

public class MainSingleton {
    public static void main(String[] args) {
        System.out.println("Hello World");
        LogInventar logInventar1 = LogInventar.getInstanta("Autobuz", 100);
        System.out.println(logInventar1);
        LogInventar logInventar2 = LogInventar.getInstanta("Troleibuz", 200);
        System.out.println(logInventar2);

        logInventar2.setNrInventar(200);
        System.out.println(logInventar2);
    }
}
