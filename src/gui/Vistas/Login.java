package src.gui.Vistas;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel{

    private JTextField campoUsuario;

    private JPasswordField campoPassword;

    private JCheckBox mostrarPassword;

    private JButton botonLogin;
    private char puntito;

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
        campoPassword = new JPasswordField();
        campoPassword.setColumns(20);
        JLabel etiquetaPassword = new JLabel("Password");
        etiquetaPassword.setLabelFor(campoPassword);

        // puntito
        puntito = campoPassword.getEchoChar();
        panelPassword.add(etiquetaPassword);
        panelPassword.add(Box.createHorizontalStrut(20));
        panelPassword.add(campoPassword);

        //ver contraseña
        Box panelControl = Box.createHorizontalBox();
        mostrarPassword = new JCheckBox("Mostrar password");
        mostrarPassword.addActionListener((e) -> {
            campoPassword.setEchoChar((!mostrarPassword.isSelected() ? puntito : 0));
        });
    }
}
