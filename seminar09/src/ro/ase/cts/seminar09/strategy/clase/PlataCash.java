package ro.ase.cts.seminar09.strategy.clase;

public class PlataCash implements ModalitatiDePlata {

    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul " + numeClient + " plateste cash suma de " + suma + " de lei.");
    }
}
