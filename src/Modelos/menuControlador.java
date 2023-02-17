
package Modelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckVistas.Entrega;
import pckVistas.Equipos;
import pckVistas.Menu;
import pckVistas.Propietarios;
import pckVistas.Reparacion;

public class menuControlador implements ActionListener{

    Menu VistaMenu;
    Entrega VistaEntrega;
    Equipos VistaEquipos;
    Propietarios VistaPropietarios;
    Reparacion VistaReparacion;
    public DefaultTableModel TablaReparacion = new DefaultTableModel();
    
    public menuControlador(Menu VistaMenu, Entrega VistaEntrega, Equipos VistaEquipos, 
            Propietarios VistaPropietarios, Reparacion VistaReparacion){
        this.VistaMenu = VistaMenu;
        this.VistaEntrega = VistaEntrega;
        this.VistaEquipos =VistaEquipos;
        this.VistaPropietarios = VistaPropietarios;
        this.VistaReparacion = VistaReparacion;
        
        //Variable boton
        this.VistaMenu.btnIngresoEquipo.addActionListener(this);
        this.VistaMenu.btnRegistroPropietario.addActionListener(this);
        this.VistaMenu.btnReparacion.addActionListener(this);
        this.VistaMenu.btnEntrega.addActionListener(this);
        
        //Levantar la vista principal
        this.VistaMenu.setExtendedState(Menu.MAXIMIZED_BOTH);
        this.VistaMenu.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Levantar el formulario principal 
    
    
}
