
package Controladores;

import Modelos.Examen;
import java.util.ArrayList;

public class ControlExamenes {
    
    public ArrayList<Examen> listaExamenes = new ArrayList<>();

    public ArrayList<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(ArrayList<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }
    
    public void añadirExamen (Examen e){
        
        getListaExamenes().add(e);
        
    }
    
    
}
