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
public class Planeta_Gaseoso extends Planeta{
    double Presion;
    int cAnillos;//Cantidad de Anillos

    public Planeta_Gaseoso() {
    }

    public Planeta_Gaseoso(double Presion, int cAnillos, String NombreP, double Masa, double Radio, double TempProm, double VelEscape) {
        super(NombreP, Masa, Radio, TempProm, VelEscape);
        this.Presion = Presion;
        this.cAnillos = cAnillos;
    }

    public double getPresion() {
        return Presion;
    }
    public void setPresion(double Presion) {
        this.Presion = Presion;
    }

    public int getcAnillos() {
        return cAnillos;
    }
    public void setcAnillos(int cAnillos) {
        this.cAnillos = cAnillos;
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

    public ArrayList<lab3p2_emilianoagurcia_12211003.Lunas> getLunas() {
        return Lunas;
    }
    public void setLunas(ArrayList<lab3p2_emilianoagurcia_12211003.Lunas> Lunas) {
        this.Lunas = Lunas;
    }

    @Override
    public String toString() {
        return "Nombre=" + NombreP + ", Masa=" + Masa + ", Radio=" + Radio + ", TemperaturaPromedio=" + TempProm + ", VelocidedEscape=" + VelEscape + ", Lunas=" + Lunas + "Presion=" + Presion + ", CantidadAnillos=" + cAnillos +  '}';
    }
}
