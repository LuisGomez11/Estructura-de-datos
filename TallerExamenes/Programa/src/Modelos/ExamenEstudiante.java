
package Modelos;

import java.io.Serializable;

public class ExamenEstudiante implements Serializable {
    
    private String nombre;
    private String codigo;
    private double estado;
    private int preguntasBuenas;

    public ExamenEstudiante() {
    }

    public ExamenEstudiante(String nombre, String codigo, double estado, int preguntasBuenas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
        this.preguntasBuenas = preguntasBuenas;
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
     * @return the estado
     */
    public double getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(double estado) {
        this.estado = estado;
    }

    /**
     * @return the preguntasBuenas
     */
    public int getPreguntasBuenas() {
        return preguntasBuenas;
    }

    /**
     * @param preguntasBuenas the preguntasBuenas to set
     */
    public void setPreguntasBuenas(int preguntasBuenas) {
        this.preguntasBuenas = preguntasBuenas;
    }
    
    
    
}
