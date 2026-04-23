package ro.ase.cts.seminar07.facade.clase;

public class Salon {
    private boolean paturiLibere[] = new boolean[50];
    private static Salon instanta;

    private Salon(){
        this.paturiLibere[1] = false;
        this.paturiLibere[2] = true;
        this.paturiLibere[3] = true;
        this.paturiLibere[6] = true;
        this.paturiLibere[8] = true;
        this.paturiLibere[13] = true;
    }

    public int suntPaturiLibere(){
        for(int i=0; i<paturiLibere.length; i++){
            if(this.paturiLibere[i] == true) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i] = false;
    }

    public static Salon getInstance(){
        if(instanta == null){
            instanta = new Salon();
        }
        return instanta;
    }

}
