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
public class C_De_Fases extends Cohete{
    int cFases;//Cantidad de Fases
    int cMotores;
    double Altura;

    public C_De_Fases() {
    }

    public C_De_Fases(int cFases, int cMotores, double Altura, double PesoSop, String NombreC, String NumSerie, int Potencia, double Velocidad) {
        super(PesoSop, NombreC, NumSerie, Potencia, Velocidad);
        this.cFases = cFases;
        this.cMotores = cMotores;
        this.Altura = Altura;
    }
    
    

    public int getcFases() {
        return cFases;
    }
    public void setcFases(int cFases) {
        this.cFases = cFases;
    }

    public int getcMotores() {
        return cMotores;
    }
    public void setcMotores(int cMotores) {
        this.cMotores = cMotores;
    }

    public double getAltura() {
        return Altura;
    }
    public void setAltura(double Altura) {
        this.Altura = Altura;
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

    public ArrayList<lab3p2_emilianoagurcia_12211003.Personas> getPersonas() {
        return Personas;
    }
    public void setPersonas(ArrayList<lab3p2_emilianoagurcia_12211003.Personas> Personas) {
        this.Personas = Personas;
    }
    
    @Override
    public String toString() {
        return "Nombre=" + NombreC + ", PesoSoportado=" + PesoSop + ", NumeroSerie=" + NumSerie + ", Potencia=" + Potencia + ", Velocidad=" + Velocidad + ", CantidadFases=" + cFases + ", CantidadMotores=" + cMotores + ", Altura=" + Altura +", Personas= "+Personas+ '}';
    }
}
