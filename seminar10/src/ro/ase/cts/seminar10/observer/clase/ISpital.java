package ro.ase.cts.seminar10.observer.clase;

public interface ISpital {
    void trimiteMesaj(String mesaj);

    void aboneazaPacient(Pacient pacient);

    void dezaboneazaPacient(Pacient pacient);


}
