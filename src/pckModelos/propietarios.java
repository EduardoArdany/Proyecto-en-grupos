/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

/**
 *
 * @author umg
 */
public class propietarios {
    String apellidosP;
    String nombreP;
    String telefono;
    
    public propietarios(String apellidosP, String nombreP, String telefono) {
        this.apellidosP = apellidosP;
        this.nombreP = nombreP;
        this.telefono = telefono;
        
    }
    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
