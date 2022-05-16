/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ikero
 */
public class MiVentana extends Frame implements MouseListener{
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadrotexto;
    private Label etiqueta;
    
 
            
    public MiVentana() throws HeadlessException {
        setTitle("Mi ventana");
        setSize(300, 200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadrotexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
        this.boton1.addMouseListener(this);
        
          
        this.add(cuadrotexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic");
        System.out.println( cuadrotexto.getText()); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Precionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entro");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Salio");
    }
    
}