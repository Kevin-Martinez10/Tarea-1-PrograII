/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Cliente   {
    
    
    private String nit;
    public Cliente () {}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public void agregar () {
    System.out.println("Nit: " + getNit() );
    //System.out.println("Nombres: " + getNombres() );
    //System.out.println("Apellidos: " + getApellidos() );
    //System.out.println("Direccion: " + getDireccion() );
    //System.out.println("Telefono: " + getTelefono() );
    //System.out.println("Fecha_nacimiento: " + getFecha_nacimiento() );
    //System.out.println("_____________________________");
    
    
    }

    public void setNombres(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setApellidos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDireccion(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTelefono(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFecha_nacimiento(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
