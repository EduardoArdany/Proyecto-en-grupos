
import Modelos.usuariosControlador;
import pckModelos.ModelAgregar;
import pckVistas.Equipos;
import java.awt.Menu;
import pckModelos.EquiposModel;


public class main {

    public static void main(String[] args) {
     
        Menu VistaMenu = new Menu();
        ModelAgregar ModeloUsuarios = new ModelAgregar();
        Equipos VistaEquipos = new Equipos();
        EquiposModel Equipos = new EquiposModel();
        
        usuariosControlador UsuariosController = new usuariosControlador(VistaMenu, VistaEquipos, ModeloUsuarios, Equipos);
    }
}
