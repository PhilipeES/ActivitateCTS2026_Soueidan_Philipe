package ro.ase.cts.seminar01.zoo;

import ro.ase.cts.seminar01.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    ZooKeeper zooKeeper;
    List<Animal> listaAnimale;

    public Zoo(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.listaAnimale = new ArrayList<Animal>();
    }

    public void feedAllAnimals() {
        for (Animal animal : listaAnimale) {
            zooKeeper.feedAnimal(animal);
        }
    }

    public void addAnimal(Animal animal) {
        listaAnimale.add(animal);
    }

}