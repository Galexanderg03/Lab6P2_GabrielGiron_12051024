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
public class Lab6P2_GabrielGiron_12051024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Usuario 1
        String Usuario = "Darkell";
        String Contra = "11101";
        String Name = "Javier";
        String Apellido = "Su";
        String Fecha = "17/10/2001";
        
        //Usuario 2
        String U2 = "AndroidV";
        String C2 = "AABBCC";
        String N2 = "Valeria";
        String A2 = "Martinez";
        String F2 = "27/10/2004";
        
        //PokeGrupo
        String Nombre = "Citadel";
        
        Usuario User = new Usuario(Usuario, Contra, Name, Apellido, Fecha);
        System.out.println(User.toString());
        Usuario User2 = new Usuario(U2,C2,N2,A2,F2);
        PokeGrupo P = new PokeGrupo(Nombre);
        
        P.Usuarios.add(User);
        P.Usuarios.add(User2);
        InterfazUsuario I = new InterfazUsuario();
        I.pokeGrupos.add(P);
        
        LogIn L = new LogIn();
        L.Usuarios.add(User);
        L.Usuarios.add(User2);
        L.setVisible(true);
    }
    
}
