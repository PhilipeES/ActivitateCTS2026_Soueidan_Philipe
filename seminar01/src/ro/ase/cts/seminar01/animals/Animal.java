package ro.ase.cts.seminar01.animals;

public abstract class Animal {
    protected String name;
    protected int age;

    public abstract void eat(String food); //declararea metodei eat

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //public String getName() { return name; }

    @Override
    public String toString() {
        return name + " in varsta de " + age + " ani. ";
    }
}