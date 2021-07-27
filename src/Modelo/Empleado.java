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
public class Empleado extends Persona {
    
    private String nit;
    public Empleado() {}

    public Empleado(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String puesto, String codigo_empleado) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento, puesto, codigo_empleado);
        this.nit = nit;
    }

    
    @Override
    public void agregar () {
    
    System.out.println("Nit: " + getNit() );
    System.out.println("Nombres: " + getNombres() );
    System.out.println("Apellidos: " + getApellidos() );
    System.out.println("Direccion: " + getDireccion() );
    System.out.println("Telefono: " + getTelefono() );
    System.out.println("Fecha_nacimiento: " + getFecha_nacimiento() );
    System.out.println("Codigo_empleado: " + getCodigo_empleado() );
    System.out.println("Puesto: " + getPuesto() );
    System.out.println("_____________________________");
    
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
}
