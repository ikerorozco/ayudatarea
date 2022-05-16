/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ikero
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola clic de raton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Boton precionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Cursor entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("El cursor salio del componente");
    }
    
    
}