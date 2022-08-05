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
public class C_Combustible_Solido extends Cohete{
    double Combustible;//En kilos
    String Material;

    public C_Combustible_Solido() {
    }

    public C_Combustible_Solido(double Combustible, String Material, double PesoSop, String NombreC, String NumSerie, int Potencia, double Velocidad) {
        super(PesoSop, NombreC, NumSerie, Potencia, Velocidad);
        this.Combustible = Combustible;
        this.Material = Material;
    }

    public double getCombustible() {
        return Combustible;
    }
    public void setCombustible(double Combustible) {
        this.Combustible = Combustible;
    }

    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String Material) {
        this.Material = Material;
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

    @Override
    public String toString() {
        return "Nombre=" + NombreC + ", PesoSoportado=" + PesoSop + ", NumeroSerie=" + NumSerie + ", Potencia=" + Potencia + ", Velocidad=" + Velocidad + ", Combustible=" + Combustible + ", Material=" + Material + ", Personas= "+Personas+'}';
    }
}
