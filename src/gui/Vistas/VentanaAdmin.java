package src.gui.Vistas;

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
        ventana.setResizable(false);

        contentPane.setSize(1280,720);
        contentPane.setLayout(null);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

private void ponerEtiquetas(){
        JLabel etiqueta = new JLabel();
        contentPane.add(etiqueta);
        etiqueta.setText("Inventario: Majo Y Rodrigo S.A. de C.V.");
        etiqueta.setBounds(50, 50, 150, 20);
        etiqueta.setFont(new Font("Sans", Font.PLAIN,35));


        }

private void ponerBotones(){
        JButton boton = new JButton();
        contentPane.add(boton);
        boton.setBounds(20,50,100,30);
        JButton boton2 = new JButton();
        contentPane.add(boton2);
        boton2.setBounds(0,150,100,30);
        JButton boton3 = new JButton();
        contentPane.add(boton3);
        boton3.setBounds(0,250,100,30);
        }
}
