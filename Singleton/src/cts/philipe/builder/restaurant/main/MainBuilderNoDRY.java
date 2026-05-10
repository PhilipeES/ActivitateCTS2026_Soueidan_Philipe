package cts.philipe.builder.restaurant.main;

import cts.philipe.builder.restaurant.builderDRY.BuilderDRY;
import cts.philipe.builder.restaurant.builderNONDRY.BuilderNoDRY;
import cts.philipe.builder.restaurant.clase.Rezervare;

public class MainBuilderNoDRY {
    public static void main(String[] args) {
        BuilderNoDRY builderv1 =  new BuilderNoDRY();
        Rezervare rezervare1 = builderv1.setPriveliste(true).setScaunErgonomic(true).setEveniment("Petrecere in fundul gol").build();
        System.out.println(rezervare1.toString());

        BuilderDRY builderv2 =  new BuilderDRY();
        Rezervare rezervare2 = builderv2.setPriveliste(true).setScaunErgonomic(true).setEveniment("Petrecere in poponetul gol").buildDRY("test");
        System.out.println(rezervare2.toString());

    }
}
