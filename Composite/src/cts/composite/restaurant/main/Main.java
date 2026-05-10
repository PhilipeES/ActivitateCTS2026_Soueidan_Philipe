package cts.composite.restaurant.main;

import cts.composite.restaurant.clase.Componenta;
import cts.composite.restaurant.clase.Item;
import cts.composite.restaurant.clase.Structura;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- DESIGN PATTERN STRUCTURAL - COMPOSITE B.08 ----------\n");

        Structura food = new Componenta("Meniu Mancare Casa Romaneasca");
        Structura drinks = new Componenta("Meniu Bauturi Casa Romaneasca");
        Structura alcool = new Componenta("Bauturi alcoolice");
        Structura nonalcool = new Componenta("Bauturi nonalcoolice");
        Structura dulce = new Componenta("Desert");
        Structura sarat = new Componenta("Snacks");
        Structura bere = new Item("Bere Corona", 12);
        Structura limonada = new Item("Limonada cu miere si menta", 24);
        Structura domnisoara = new Item("Buze", 22);
        Structura chips = new Item("Chipuri Pringles cu gust de doliu", 20);

        ((Componenta) food).adaugaStructura(dulce);
        ((Componenta) food).adaugaStructura(sarat);
        ((Componenta) drinks).adaugaStructura(alcool);
        ((Componenta) drinks).adaugaStructura(nonalcool);
        ((Componenta) alcool).adaugaStructura(bere);
        ((Componenta) nonalcool).adaugaStructura(limonada);
        ((Componenta) dulce).adaugaStructura(domnisoara);
        ((Componenta) sarat).adaugaStructura(chips);

        food.afiseazaDetalii("  ");
        drinks.afiseazaDetalii("  ");

        System.out.println("rezultat dupa modificare:\n");
        ((Componenta) sarat).stergeStructura(chips);
        food.afiseazaDetalii("  ");

        ((Componenta) food).getStructura(0).afiseazaDetalii("            ");

    }
}