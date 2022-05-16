/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing.modelos;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ikero
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private ArrayList<Persona> data;
    private String selected; 

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList<Persona> data, String selected) {
        this.data = data;
        this.selected = selected;
    }

    public ArrayList<Persona> getData() {
        return data;
    }

    public void setData(ArrayList<Persona> data) {
        this.data = data;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    @Override
    public void setSelectedItem(Object o) {
        selected = ((Persona)o).toString();
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return data.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
