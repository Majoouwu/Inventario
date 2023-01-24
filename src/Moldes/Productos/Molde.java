package src.Moldes.Productos;
import java.util.UUID;

public class Molde {

    private UUID id;
    private String material;
    private float precio;
    private String nombre;
    private float peso;
    private String pieza;

    /**
     * Constructor de la clase
     * @param material
     * @param precio
     * @param nombre
     * @param peso
     */
    public Molde(String material, float precio, String nombre, float peso, String pieza){
        this.id = UUID.randomUUID();
        this.material = material;
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.pieza = pieza;
    }



    /**
     * Geters
     * ***********************************************************************
      * @return
     */
    public UUID getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public String getPieza() { return pieza; }

    /**
     * Setters
     * ***********************************************************************
     * @param id
     */

    public void setId(UUID id) {
        this.id = id;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPieza(String pieza) { this.pieza = pieza; }
}
