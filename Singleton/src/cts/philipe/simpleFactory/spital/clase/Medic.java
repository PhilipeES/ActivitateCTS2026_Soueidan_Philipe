package cts.philipe.simpleFactory.spital.clase;

public class Medic extends PersonalSpital{
    private int aniExperienta;

    public Medic(String nume, int varsta, int aniExperienta) {
        super(nume, varsta);
        this.aniExperienta = aniExperienta;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic: ");
        sb.append("aniExperienta=").append(aniExperienta);
        sb.append(super.toString());
        return sb.toString();
    }

}
