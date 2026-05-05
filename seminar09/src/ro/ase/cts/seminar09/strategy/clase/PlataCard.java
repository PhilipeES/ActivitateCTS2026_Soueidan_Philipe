package ro.ase.cts.seminar09.strategy.clase;

public class PlataCard implements ModalitatiDePlata {

    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul " + numeClient + " plateste cu cardul suma de " + suma + " de lei.");

    }

}
