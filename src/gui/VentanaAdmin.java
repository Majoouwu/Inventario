package src.gui;

import javax.swing.*;

public class VentanaAdmin {
    /**
     * para mostrar/ocultar las ventanas en la intefaz gráfica
     */
    private JTabbedPane panel;

    /**
     * muestra el nombre del usuario que utiliza la aplicación
     */
    private JLabel nombreUsuario;

    public VentanaAdmin(){

    }

    public void mostrar(){
        panel = new JTabbedPane();
    }

}
