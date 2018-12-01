
package Modelos;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private String nombre;
    private String codigo;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, String codigo, double peso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.peso = peso;
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
