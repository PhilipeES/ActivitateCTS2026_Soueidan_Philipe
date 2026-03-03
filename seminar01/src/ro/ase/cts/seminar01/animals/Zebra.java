package ro.ase.cts.seminar1.animals;

public class Zebra extends Animal {
    private int stripes;

    public Zebra(String name, int age, int stripes) {
        super(name, age);
        this.stripes = stripes;
    }

    @Override
    public void eat(String food) {
        System.out.println("Zebra mananca " + food);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());
        buffer.append("Zebra are " + stripes + " dungi");
        return buffer.toString();
    }
}
