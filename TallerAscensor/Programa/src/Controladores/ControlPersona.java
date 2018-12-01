
package Controladores;

import Modelos.Persona;
import java.util.ArrayList;

public class ControlPersona {
    
    public static ArrayList <Persona> listaPersonas = new ArrayList<>();
    public static ArrayList <Persona> listaPersonasT = new ArrayList<>();

    /**
     * @return the listaPersonas
     */
    public static ArrayList <Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * @param aListaPersonas the listaPersonas to set
     */
    public static void setListaPersonas(ArrayList <Persona> aListaPersonas) {
        listaPersonas = aListaPersonas;
    }
    
    public static void añadirPersona(Persona p){
        
        getListaPersonas().add(p);
        
    }

    /**
     * @return the listaPersonasT
     */
    public static ArrayList <Persona> getListaPersonasT() {
        return listaPersonasT;
    }

    /**
     * @param aListaPersonasT the listaPersonasT to set
     */
    public static void setListaPersonasT(ArrayList <Persona> aListaPersonasT) {
        listaPersonasT = aListaPersonasT;
    }
            
    public static void añadirPersTemp(Persona pe){
        
        getListaPersonasT().add(pe);
        
    }
    
    
}
