package cts.chainOfResponsabilty.restaurant.v2.clase;

public class Bursier extends Notificare{

    public Bursier() {
        super();
    }

    @Override
    public String trimiteNotificare(String nume, String info) {
        try{
        if (Integer.parseInt(info) > 8) {
            return "Clientul " + nume + " invata bine, shaorma din partea casei.";
        }}
        catch(NumberFormatException e){

        }
        return super.succesor.trimiteNotificare(nume, info);
    }
}
