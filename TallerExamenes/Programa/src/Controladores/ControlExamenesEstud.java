
package Controladores;

import Modelos.ExamenEstudiante;
import java.util.ArrayList;
import java.util.Stack;

public class ControlExamenesEstud {
    
    public static Stack <ExamenEstudiante> examenes = new Stack <ExamenEstudiante>();
    public ArrayList<ExamenEstudiante> examenesCalif = new ArrayList<>();

    public ControlExamenesEstud() {
    }

    public static Stack <ExamenEstudiante> getExamenes() {
        return examenes;
    }

    public static void setExamenes(Stack <ExamenEstudiante> aExamenes) {
        examenes = aExamenes;
    }


    
    //Metodos

    
    public ExamenEstudiante gExamClaif(int j){
        
        ExamenEstudiante ec;
        ec=examenes.get(j);
        return ec;
        
    }
    
    public void agregarExam(ExamenEstudiante e){
        
        getExamenes().push(e);
        
    }

    public ExamenEstudiante gExamEst(int i){
        
        ExamenEstudiante e;
        e=examenes.get(i);
        return e;
        
    }
    
    public static ExamenEstudiante consultar(String nom){
        ExamenEstudiante ee=null;
        for(int i=0;i<getExamenes().size();i++){//recorrer todas las lavadoras
            ExamenEstudiante e=(ExamenEstudiante)getExamenes().get(i);
            if(e.getNombre().equals(nom)){//si el codigo de la lavadora es = a cod entonces lo retorno
                ee=e;
            }            
        }return ee;
    }

    
}
