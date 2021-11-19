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
public class Contra {
    private LogIn L = new LogIn();
    private String Contra;

    public Contra(String Contra) {
        this.Contra = Contra;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    @Override
    public String toString() {
        return "Contra{" + "Contra=" + Contra + '}';
    }
    
}
