
package Modelo;

public class JugadoresClase {
    
    private String nombre;
    private String fechanacimiento;
    private String posicion;
    private int estatura;

    public JugadoresClase(String nombre, String fechanacimiento, String posicion, int estatura) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.posicion = posicion;
        this.estatura = estatura;
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
     * @return the fechanacimiento
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the estatura
     */
    public int getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
    
}
