
package Controladores;

import Modelos.Ingreso;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ControlIngreso {
    
    public static ArrayList<Ingreso> listaIngresos = new ArrayList<>();
    public static ArrayList <Ingreso> listaIngresosT = new ArrayList<>();

    public static Stack<Ingreso> pilaCuartoPiso = new Stack<>();

    public static Queue<Ingreso> colaTercerPiso = new LinkedList<>();

    /**
     * @return the listaIngresos
     */
    public static ArrayList<Ingreso> getListaIngresos() {
        return listaIngresos;
    }

    /**
     * @param aListaIngresos the listaIngresos to set
     */
    public static void setListaIngresos(ArrayList<Ingreso> aListaIngresos) {
        listaIngresos = aListaIngresos;
    }
    
    public static void añadirIngreso(Ingreso i) {
        
        getListaIngresos().add(i);
        
    }

    /**
     * @return the listaIngresosT
     */
    public static ArrayList <Ingreso> getListaIngresosT() {
        return listaIngresosT;
    }

    /**
     * @param aListaIngresosT the listaIngresosT to set
     */
    public static void setListaIngresosT(ArrayList <Ingreso> aListaIngresosT) {
        listaIngresosT = aListaIngresosT;
    }
    
    public static void añadirIngTemp(Ingreso it){
        
        getListaIngresosT().add(it);
        
    }

    /**
     * @return the pilaCuartoPiso
     */
    public static Stack<Ingreso> getPilaCuartoPiso() {
        return pilaCuartoPiso;
    }

    /**
     * @param aPilaCuartoPiso the pilaCuartoPiso to set
     */
    public static void setPilaCuartoPiso(Stack<Ingreso> aPilaCuartoPiso) {
        pilaCuartoPiso = aPilaCuartoPiso;
    }
    
    public static void añadiralCP(Ingreso ic){
        
        getPilaCuartoPiso().push(ic);
        
    }

    /**
     * @return the colaTercerPiso
     */
    public static Queue<Ingreso> getColaTercerPiso() {
        return colaTercerPiso;
    }

    /**
     * @param aColaTercerPiso the colaTercerPiso to set
     */
    public static void setColaTercerPiso(Queue<Ingreso> aColaTercerPiso) {
        colaTercerPiso = aColaTercerPiso;
    }
    
    public static void añadirenCola(Ingreso ic){
        
        getColaTercerPiso().offer(ic);
        
    }

    
}
