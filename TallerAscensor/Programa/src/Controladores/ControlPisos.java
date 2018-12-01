
package Controladores;

import Modelos.Piso;
import java.util.ArrayList;

public class ControlPisos {

    private static ArrayList<Piso> pisos = new ArrayList<>();


    /**
     * @return the pisos
     */
    public static ArrayList<Piso> getPisos() {
        return pisos;
    }

    /**
     * @param aPisos the pisos to set
     */
    public static void setPisos(ArrayList<Piso> aPisos) {
        pisos = aPisos;
    }

    public static void añadirPiso(Piso p){
        getPisos().add(p);
    }
    
}
