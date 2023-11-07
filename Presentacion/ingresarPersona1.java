package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ingresarPersona1 extends JFrame {
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblIdioma;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JPanel pnlPrincipal;
    private JButton btnGuardar;
    private JComboBox cmbIdioma;
    private JCheckBox chbTerminos;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JLabel lblGenero;
    private JRadioButton rbtPrefieroNoDecirlo;

    public ingresarPersona1(){
        this.setTitle("ventana Ingresar Persona");
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);
        this.setVisible(true);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()== true)?"Si" : "No";
                String mensaje = " Tus datos son : \n" +
                                "Codigo: " + codigo + "\n" +
                                "Nombre: " + nombre + "\n" +
                                "Apellido: " + apellido "\n":

                String genero = (rbtMasculino.isSelected()) ? "Masculino":
                        (rbtFemenino.isSelected()) ? "Femenino": (rbtOtro.isSelected()) ? "Otro": (rbtPrefieroNoDecirlo.isSelected()) ? "Prefiero No Decirlo": "";

                JOptionPane.showConfirmDialog(btnGuardar, mensaje);

            }
        });
    }
}
