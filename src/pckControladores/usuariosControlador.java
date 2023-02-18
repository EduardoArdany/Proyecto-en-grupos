
package pckControladores;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.ModelAgregar;
import pckModelos.EquiposModel;
import pckVistas.Equipos;


public class usuariosControlador implements ActionListener{

    Menu VistaMenu;
    Equipos VistaEquipos;
    EquiposModel equipos;
    ModelAgregar ModelAgregar;
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
    public usuariosControlador(Menu VistaMenu, Equipos VistaEquipos,  ModelAgregar ModelAgregar, EquiposModel equipos){
        
      this.VistaMenu = VistaMenu;
      this.equipos = equipos;
      this.ModelAgregar = ModelAgregar;
      
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
    if(e.getSource() ==this.VistaEquipos.btnIngresar){
        this.ModelAgregar.IngresarEquipos(this.VistaEquipos.txtMarca.getText(), this.VistaEquipos.txtModelo.getText(),
                this.VistaEquipos.txtProblema.getText(), this.VistaEquipos.txtTipo.getText());
        
        this.TablaUsuarios.addRow(new Object[]{this.ModelAgregar.ListaEquipos.get(0).getMarca(),
           this.ModelAgregar.ListaEquipos.get(0).getModelo(), 
           this.ModelAgregar.ListaEquipos.get(0).getProblema(), this.ModelAgregar.ListaEquipos.get(0).getTipo()});
    }
    }
    
}
