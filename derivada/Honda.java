package derivada;

import Interface.Auto;

public class Honda implements Auto {

    private String patente;

    public Honda(String patente) {
        this.patente = patente;
    }

    @Override
    public void arrancar() {
        System.out.println("arranca Honda");
        
    }

    @Override
    public void frenar() {
        System.out.println("frena Honda");
        
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String obtenerPatente() {

        return this.patente;
    }
    
}
