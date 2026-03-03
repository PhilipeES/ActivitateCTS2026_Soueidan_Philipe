package ro.ase.cts.seminar1.zoo;

import ro.ase.cts.seminar1.animals.Animal;

public class ZooKeeper {
    protected String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Zookeeper-ul " + name + " a hranit " + animal.toString());
        animal.eat("Coliva"); //cum ar fi trebuit sa fac daca voiam ca fiecare animal sa manance ceva diferit?
    }

}
