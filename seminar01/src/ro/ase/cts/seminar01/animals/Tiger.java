package ro.ase.cts.seminar1.animals;

public class Tiger extends Animal {
    protected String breed;

    public Tiger(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println("Tigrul a mancat " + food);
    }

}
