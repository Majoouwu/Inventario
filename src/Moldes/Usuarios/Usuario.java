package src.Moldes.Usuarios;

import java.io.Serializable;
import java.util.UUID;
public class Usuario implements Serializable {
    private String password;
    private String telefono;
    private String usuario;
    private String nombre;
    private UUID id;

    /**
     * Constructor de la clase
     *
     * @param nombre          el nombre del usuario
     * @param telefono        el teléfono del usaurio
     * @param usuario         el 'nombre de usuario' con el que ingresará al sistema
     * @param password        la contraseña con la que ingresará al sistema
     */
    public Usuario(String nombre, String telefono, String usuario, String password) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean esAdmin() {
        return (this instanceof Administrador);
    }
    /**
     * Dado un usuario y password, verifica si coinciden con los almacenados
     * en this
     *
     * @param usuario  el 'nombre de usuario' a verificar
     * @param password el 'password' a verificar
     * @return true en caso de que se haya verificado exitosamente, false de lo
     *         contrario.
     */
    public boolean verificarCredenciales(String usuario, String password) {
        return this.usuario.equals(usuario) && this.password.equals(password);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario usuario = (Usuario) obj;
            return usuario.getId().equals(getId());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
