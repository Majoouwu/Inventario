package src.Moldes.Productos;
import java.util.UUID;

public class Molde {

    private UUID id;
    private String material;
    private String precio;
    private String nombre;
    private String peso;


    /**
     * Constructor de la clase
     * @param material
     * @param precio
     * @param nombre
     * @param peso
     */
    public Molde(String material, String precio, String nombre, String peso){
        this.id = UUID.randomUUID();
        this.material = material;
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Geters
     * ***********************************************************************
      * @return
     */
    public String getMaterial() {
        return material;
    }

    public String getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPeso() {
        return peso;
    }

    /**
     * Setters
     * ***********************************************************************
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
