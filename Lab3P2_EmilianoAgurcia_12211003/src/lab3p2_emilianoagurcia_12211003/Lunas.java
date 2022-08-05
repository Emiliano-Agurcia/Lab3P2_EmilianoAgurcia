/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_emilianoagurcia_12211003;

/**
 *
 * @author emili
 */
public class Lunas {
    String NombreL;//Nombre Unico de Lunas
    int cCrateres;//Cantidad de crateres

    public Lunas() {
    }

    public Lunas(String NombreL, int cCrateres) {
        this.NombreL = NombreL;
        this.cCrateres = cCrateres;
    }

    public String getNombreL() {
        return NombreL;
    }

    public void setNombreL(String NombreL) {
        this.NombreL = NombreL;
    }

    public int getcCrateres() {
        return cCrateres;
    }

    public void setcCrateres(int cCrateres) {
        this.cCrateres = cCrateres;
    }

    @Override
    public String toString() {
        return "\nLuna{" + "Nombre=" + NombreL + ", CantidadCrateres=" + cCrateres + '}';
    }
    
}
