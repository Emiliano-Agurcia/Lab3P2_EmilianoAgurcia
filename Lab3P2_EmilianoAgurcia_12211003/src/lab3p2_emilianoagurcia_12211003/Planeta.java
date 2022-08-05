/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_emilianoagurcia_12211003;

import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Planeta {
    String NombreP; //Nombres de Planeta son Unicos, no compartidos
    double Masa;
    double Radio;
    double TempProm;
    double VelEscape;
    ArrayList <Lunas> Lunas = new ArrayList();

    public Planeta() {
    }

    
    
    public Planeta(String NombreP, double Masa, double Radio, double TempProm, double VelEscape) {
        this.NombreP = NombreP;
        this.Masa = Masa;
        this.Radio = Radio;
        this.TempProm = TempProm;
        this.VelEscape = VelEscape;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getTempProm() {
        return TempProm;
    }

    public void setTempProm(double TempProm) {
        this.TempProm = TempProm;
    }

    public double getVelEscape() {
        return VelEscape;
    }

    public void setVelEscape(double VelEscape) {
        this.VelEscape = VelEscape;
    }

    public ArrayList<Lunas> getLunas() {
        return Lunas;
    }

    public void setLunas(ArrayList<Lunas> Lunas) {
        this.Lunas = Lunas;
    }

    
    
    @Override
    public String toString() {
        return "Nombre=" + NombreP + ", Masa=" + Masa + ", Radio=" + Radio + ", TemperaturaPromedio=" + TempProm + ", VelocidedEscape=" + VelEscape + ", Lunas=" + Lunas + '}';
    }
}
