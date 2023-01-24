package src.gui.Vistas;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import src.gui.principal;

public class Login extends JPanel{

    private JTextField campoUsuario;

    private JPasswordField campoPassword;

    private JCheckBox mostrarPassword;

    private JButton botonLogin;

    private void crearComponentes() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // usuario
        Box panelUsuario = Box.createHorizontalBox();
        campoUsuario = new JTextField();
        campoUsuario.setColumns(20);
        JLabel etiquetaUsuario = new JLabel("Usuario");
        etiquetaUsuario.setLabelFor(campoUsuario);

        panelUsuario.add(etiquetaUsuario);
        panelUsuario.add(Box.createHorizontalStrut(20));
        panelUsuario.add(campoUsuario);

        //contraseña
        Box panelPassword = Box.createHorizontalBox();
    }
}
