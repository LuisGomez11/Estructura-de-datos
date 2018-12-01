
package Modelo;

public class Prendas {
    
    private String codigo;
    private String tipo;
    private String color;
    private String talla;

    public Prendas(String codigo, String tipo, String color, String talla) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.color = color;
        this.talla = talla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    
    
}
