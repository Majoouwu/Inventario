package src.gui;

import javax.swing.*;

public class VentanaAdmin{

    JFrame ventana = new JFrame();
    public VentanaAdmin(){

    }

    public void mostrar(){
        ventana.setSize(400,500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
