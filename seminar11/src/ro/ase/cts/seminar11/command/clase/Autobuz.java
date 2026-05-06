package ro.ase.cts.seminar11.command.clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println("Atobuzul marca "+ this.producator + " porneste pe linia "+ nrLinie);
    }
}
