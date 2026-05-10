package cts.philipe.simpleFactory.spital.clase;

public class Brancardier extends PersonalSpital{
    protected int nr_ture;

    public Brancardier(String nume, int varsta, int nr_ture) {
        super(nume, varsta);
        this.nr_ture = nr_ture;
    }

    public int getNr_ture() {
        return nr_ture;
    }

    public void setNr_ture(int nr_ture) {
        this.nr_ture = nr_ture;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier: ");
        sb.append("nr_ture=").append(nr_ture);
        sb.append(super.toString());
        return sb.toString();
    }
}
