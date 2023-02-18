
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.ModelAgregar;
import pckModelos.EquiposModel;
import pckVistas.Equipos;
import pckVistas.Interfaz;


public class usuariosControlador implements ActionListener{

    Interfaz VistaMenu;
    Equipos VistaEquipos;
    EquiposModel equipos;
    ModelAgregar ModeloAgregar;
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
    public usuariosControlador(Interfaz VistaMenu, Equipos VistaEquipos,  ModelAgregar ModeloAgregar){
        
      this.VistaMenu = VistaMenu;
      this.VistaEquipos = VistaEquipos;
      this.ModeloAgregar= ModeloAgregar;
      
      //this.VistaMenu.btnIngresoEquipo.addActionListener(this);
      
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
        this.ModeloAgregar.IngresarEquipos(this.VistaEquipos.txtMarca.getText(), this.VistaEquipos.txtModelo.getText(),
                this.VistaEquipos.txtProblema.getText(), this.VistaEquipos.txtTipo.getText());
        
        this.TablaUsuarios.addRow(new Object[]{this.ModeloAgregar.ListaEquipos.get(0).getMarca(),
           this.ModeloAgregar.ListaEquipos.get(0).getModelo(), 
           this.ModeloAgregar.ListaEquipos.get(0).getProblema(), this.ModeloAgregar.ListaEquipos.get(0).getTipo()});
    }
    }
    
}
