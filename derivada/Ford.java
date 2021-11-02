package derivada;

import Interface.Auto;

public class Ford implements Auto {

    private String patente;

    public Ford(String patente) {
        this.patente = patente;
    }

    @Override
    public void arrancar() {
        System.out.println("arranca Ford");
        
    }

    @Override
    public void frenar() {
        System.out.println("frena Ford");
        
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String obtenerPatente() {

        return this.patente;
    }
    
}
