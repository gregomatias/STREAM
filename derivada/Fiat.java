package derivada;

import Interface.Auto;

public class Fiat implements Auto {
    private String patente;

    public Fiat(String patente) {
        this.patente = patente;
    }

    @Override
    public void arrancar() {
        System.out.println("arranca Fiat");

    }

    @Override
    public void frenar() {
        System.out.println("frena Fiat");

    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String obtenerPatente() {

        return this.patente;
    }

}
