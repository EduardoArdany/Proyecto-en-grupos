
package Modelos;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.ModelAgregar;
import pckModelos.equipos;
import pckVistas.Entrega;
import pckVistas.Equipos;


public class usuariosControlador implements ActionListener{

    Menu VistaMenu;
    Equipos VistaEquipos;
    equipos equipos;
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
    public usuariosControlador(Entrega VistaEntrega, equipos equipos, Equipos VistaEquipos, Menu VistaMenu){
        
      this.VistaMenu = VistaMenu;
      this.equipos = equipos;
      this.VistaEquipos.btnIngresar.addActionListener(this);
      
      this.TablaUsuarios.addColumn("Marca");
      this.TablaUsuarios.addColumn("Modelo");
      this.TablaUsuarios.addColumn("Tipo");
      this.TablaUsuarios.addColumn("Problema");
        
      this.VistaEquipos.tblEquipos.setModel(TablaUsuarios);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() ==this.VistaEquipos.btnIngresar){
        this.VistaEquipos.btnIngresar.addActionListener(this);
        
        this.VistaEquipos.setLocationRelativeTo(null);
        this.VistaEquipos.setVisible(true);
        }  
    if(e.getSource()==this.VistaEquipos.btnIngresar){
        
    }
    }
    
}
