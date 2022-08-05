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
public class Cohete {
    double PesoSop;//Peso Soportable
    String NombreC;
    String NumSerie;//Numero de Serie Unico
    int Potencia;
    double Velocidad;//Km/h
    ArrayList <Personas> Personas = new ArrayList();

    public Cohete() {
    }

    public Cohete(double PesoSop, String NombreC, String NumSerie, int Potencia, double Velocidad) {
        this.PesoSop = PesoSop;
        this.NombreC = NombreC;
        this.NumSerie = NumSerie;
        this.Potencia = Potencia;
        this.Velocidad = Velocidad;
    }

    public double getPesoSop() {
        return PesoSop;
    }

    public void setPesoSop(double PesoSop) {
        this.PesoSop = PesoSop;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public ArrayList<Personas> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Personas> Personas) {
        this.Personas = Personas;
    }

    
    
    @Override
    public String toString() {
        return "Cohetes{" + "PesoSop=" + PesoSop + ", NombreC=" + NombreC + ", NumSerie=" + NumSerie + ", Potencia=" + Potencia + ", Velocidad=" + Velocidad + ", Personas= "+Personas+'}';
    }
}
