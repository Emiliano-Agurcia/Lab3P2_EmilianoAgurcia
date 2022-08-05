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
public class C_Combustible_Liquido extends Cohete{
    double Gas;//En litros

    public C_Combustible_Liquido() {
        super();
    }

    public C_Combustible_Liquido(double Gas, double PesoSop, String NombreC, String NumSerie, int Potencia, double Velocidad) {
        super(PesoSop, NombreC, NumSerie, Potencia, Velocidad);
        this.Gas = Gas;
    }

    public double getGas() {
        return Gas;
    }
    public void setGas(double Gas) {
        this.Gas = Gas;
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
        return "Nombre=" + NombreC + ", PesoSoportado=" + PesoSop + ", NumeroSerie=" + NumSerie + ", Potencia=" + Potencia + ", Velocidad=" + Velocidad + ", Gas=" + Gas +", Personas= "+Personas+ '}';
    }
    
    
    
}
