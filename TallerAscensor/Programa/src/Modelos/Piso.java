
package Modelos;

import java.io.Serializable;

public class Piso implements Serializable{
    
    private String codigo;
    private int numero;

    public Piso() {
    }

    public Piso(String codigo, int numero) {
        this.codigo = codigo;
        this.numero = numero;
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
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
