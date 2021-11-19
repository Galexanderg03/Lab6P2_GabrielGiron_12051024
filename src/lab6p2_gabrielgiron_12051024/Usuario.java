/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Usuario {
    private String Usuario;
    private String Contra;
    private String Nombre;
    private String Apellido;
    private String Fecha;

    public Usuario(String Usuario, String Contra, String Nombre, String Apellido, String Fecha) {
        this.Usuario = Usuario;
        this.Contra = Contra;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha = Fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Usuario=" + Usuario + ", Contra=" + Contra + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Fecha=" + Fecha + '}';
    }



}
