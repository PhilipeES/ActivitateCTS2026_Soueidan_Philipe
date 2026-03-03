package ro.ase.cts.seminar01.main;

import ro.ase.cts.seminar01.animals.Lion;
import ro.ase.cts.seminar01.animals.Tiger;
import ro.ase.cts.seminar01.animals.Zebra;
import ro.ase.cts.seminar01.zoo.Zoo;
import ro.ase.cts.seminar01.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper1 = new ZooKeeper("Edward");
        Lion lion1 = new Lion("Richard", 18, 120);
        Zebra zebra1 = new Zebra("Marius", 33, 9);
        Zoo gradinaZooBucuresti = new Zoo("Grădina Zoologică Bucureşti", zooKeeper1);

        gradinaZooBucuresti.addAnimal(lion1);
        gradinaZooBucuresti.addAnimal(zebra1);
        gradinaZooBucuresti.addAnimal(new Tiger("Popescu", 44, "vargat"));
        gradinaZooBucuresti.feedAllAnimals();
    }
}
