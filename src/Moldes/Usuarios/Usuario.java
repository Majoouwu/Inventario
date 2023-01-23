package src.Moldes.Usuarios;

import java.io.Serializable;
import java.util.UUID;
public class Usuario implements Serializable {
    private String password;
    private String telefono;
    private String usuario;
    private String nombre;
    private UUID id;

    public Usuario(String nombre, String telefono, String usuario, String password) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
    }
}
