package src.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaAdmin{

    JFrame ventana = new JFrame();
    JPanel contentPane = (JPanel) ventana.getContentPane();
    public VentanaAdmin(){

    }

    public void mostrar(){
        crearVentana();
        ponerEtiquetas();
        ponerBotones();

    }

    private void crearVentana(){
        ventana.setSize(1280,720);
        ventana.setVisible(true);

        contentPane.setSize(1280,720);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void ponerEtiquetas(){
        JLabel label = new JLabel("Inventario: Majo Y Rodrigo S.A. de C.V.");
        contentPane.add(label);
        label.setBounds(0,0,50,20);
        label.setFont(new Font("Sans", Font.PLAIN, 35));

    }

    private void ponerBotones(){
        JButton boton = new JButton();
        contentPane.add(boton);
        boton.setBounds(300,250,100,30);
    }

}
