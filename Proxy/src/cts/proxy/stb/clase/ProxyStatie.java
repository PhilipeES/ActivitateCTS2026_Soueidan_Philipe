package cts.proxy.stb.clase;

public class ProxyStatie implements IStatie {
    private IStatie statie;

    public ProxyStatie(IStatie statie) {
        this.statie = statie;
    }

    @Override
    public void opreste(Autobuz autobuz) {
        if(autobuz.areCalatori()) {
            statie.opreste(autobuz);
        }
        else
            System.out.println("Nu sunt calatori in autobuzul "+ autobuz.getNumar());

    }
}
