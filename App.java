import java.util.ArrayList;
import java.util.List;

import Interface.Auto;
import derivada.*;

public class App {
    public static void main(String[] args) throws Exception {
        // fian honda forrd
        List<Auto> autos = new ArrayList<Auto>();

        autos.add(new Fiat("ADC115"));
        autos.add(new Fiat("ADP234"));
        autos.add(new Fiat("LLE765"));
        autos.add(new Ford("LLE799"));
        autos.add(new Fiat("ADT543"));

        for (Auto auto : autos) {
            if (auto.obtenerPatente().equalsIgnoreCase("LLE765")) {

                System.out.println(auto.obtenerPatente());

            }

        }

        Auto auto1 = autos.stream().filter((auto) -> auto.obtenerPatente().contains("AD")).findFirst().get();

        System.out.println(auto1.obtenerPatente()); 

        System.out.println("--------------------------------------------"); 

       autos.stream()
        .filter((auto) -> !auto.obtenerPatente().contains("AD"))
        .forEach((e)->System.out.println(e.obtenerPatente()));

    }
}
