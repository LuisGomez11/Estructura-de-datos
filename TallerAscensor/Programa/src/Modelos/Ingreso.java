
package Modelos;

import java.io.Serializable;

public class Ingreso implements Serializable{
    
    private Persona persona;
    private Piso piso;
    private int momento;

    public Ingreso() {
    }

    public Ingreso(Persona persona, Piso piso, int momento) {
        this.persona = persona;
        this.piso = piso;
        this.momento = momento;
    }

    
    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * @return the piso
     */
    public Piso getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    /**
     * @return the momento
     */
    public int getMomento() {
        return momento;
    }

    /**
     * @param momento the momento to set
     */
    public void setMomento(int momento) {
        this.momento = momento;
    }
    
    
    
}
