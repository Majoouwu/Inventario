package src.gui;

import javax.swing.*;

public class VentanaAdmin{

    JFrame ventana = new JFrame();
    JPanel contentPane = (JPanel) ventana.getContentPane();
    public VentanaAdmin(){

    }

    public void mostrar(){
        crearVentana();
        ponerBotones();
        ponerEtiquetas();
    }

    private void crearVentana(){
        ventana.setSize(1280,720);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void ponerEtiquetas(){
        JLabel label = new JLabel("Etiqueta");
        contentPane.add(label);

    }

    private void ponerBotones(){

    }

}
