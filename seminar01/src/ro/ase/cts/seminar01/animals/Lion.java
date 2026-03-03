package ro.ase.cts.seminar01.animals;

public class Lion extends Animal {
    int weight;

    public Lion(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

//    @Override //pentru getName()
//    public void eat(String food){
//        System.out.println("Leul " + getName() + " mananca " + food);
//    }


    @Override
    public void eat(String food) {
        System.out.println("Leul a mancat " + food);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder(); //de vazut care e diferenta intre StringBuffer si StringBuilder
        buffer.append(super.toString());
        buffer.append("Leul cantareste " + weight + " kg.");
        return buffer.toString();
    }
}
