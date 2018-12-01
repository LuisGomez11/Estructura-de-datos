
package Modelos;

import java.io.Serializable;

public class Examen implements Serializable{
    
    private String cogigo;
    private int numeroPreguntas;

    public Examen() {
    }

    public Examen(String cogigo, int numeroPreguntas) {
        this.cogigo = cogigo;
        this.numeroPreguntas = numeroPreguntas;
    }


    /**
     * @return the cogigo
     */
    public String getCogigo() {
        return cogigo;
    }

    /**
     * @param cogigo the cogigo to set
     */
    public void setCogigo(String cogigo) {
        this.cogigo = cogigo;
    }

    /**
     * @return the numeroPreguntas
     */
    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    /**
     * @param numeroPreguntas the numeroPreguntas to set
     */
    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }
    
    
    
}
