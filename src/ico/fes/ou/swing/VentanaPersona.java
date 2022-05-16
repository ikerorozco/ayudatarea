/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing;

import ico.fes.ou.swing.modelos.ModeloPersonaCombo;
import ico.fes.ou.swing.modelos.Persona;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ikero
 */
public class VentanaPersona extends JFrame{
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEdad;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private ArrayList<Persona> info;

    public VentanaPersona() {
        lblNombre = new JLabel("Nomre: ");
        txtNombre = new JTextField(15);
        lblEdad = new JLabel("Edad: ");
        txtEdad = new JTextField(3);
        btnAgregar = new JButton("Agregar");
        lista = new JComboBox<Persona>();
        modelo = new ModeloPersonaCombo();
        info = new ArrayList();
        info.add(new Persona("jose",22));
        
        modelo = new ModeloPersonaCombo(info,"jose");
        lista.setModel(modelo);
        
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(lblNombre);
        this.getContentPane().add(txtNombre);
        this.getContentPane().add(lblEdad);
        this.getContentPane().add(btnAgregar);
         this.getContentPane().add(lista);
         
        this.setSize(400,300);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter(){
        @Overdrive
        public void windoxClosing(WindowEvent e){
            System.exit(0);
        }
        
        
    });
        
        this.lista.addItemListener(new ItemAdapter() {
        @Overrive
        public void itemStateChanged(ItemAdapter)
        });
        
    }

    public VentanaPersona(JLabel lblNombre, JTextField txtNombre, JLabel lblEdad, JTextField txtEdad, JButton btnAgregar, JComboBox<Persona> lista) {
        this.lblNombre = lblNombre;
        this.txtNombre = txtNombre;
        this.lblEdad = lblEdad;
        this.txtEdad = txtEdad;
        this.btnAgregar = btnAgregar;
        this.lista = lista;
    }


    
    
    
}
