
import pckControladores.usuariosControlador;
import pckModelos.ModelAgregar;
import pckVistas.Equipos;
import pckVistas.Entrega;
import pckModelos.EquiposModel;
import pckVistas.Interfaz;


public class main {

    public static void main(String[] args) {
     
        Interfaz VistaMenu = new Interfaz();
        Equipos VistaEquipos = new Equipos();
        //ModelAgregar ModeloUsuarios = new ModelAgregar();
        //ModelAgregar EquiposModel = new ModelAgregar();
        ModelAgregar EquiposModel = new ModelAgregar();
        
        usuariosControlador controladorU = new usuariosControlador(VistaMenu,VistaEquipos, EquiposModel);
 
    }
}
