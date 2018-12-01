
package Controladores;

import Modelo.Prenda;
import java.util.Vector;

public class ControlPrenda {
    private static Vector prendas=new Vector();

    /**
     * @return the prendas
     */
    public static Vector getPrendas() {
        return prendas;
    }

    /**
     * @param aPrendas the prendas to set
     */
    public static void setPrendas(Vector aPrendas) {
        prendas = aPrendas;
    }
    
    public static void agregar(Prenda p){
        getPrendas().add(p);
    }
}
