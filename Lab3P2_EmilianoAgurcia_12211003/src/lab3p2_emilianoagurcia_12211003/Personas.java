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
public class Personas {
    String NombrePers;
    int Edad;
    double Peso;

    public Personas() {
    }

    public Personas(String NombrePers, int Edad, double Peso) {
        this.NombrePers = NombrePers;
        this.Edad = Edad;
        this.Peso = Peso;
    }

    public String getNombrePers() {
        return NombrePers;
    }
    public void setNombrePers(String NombrePers) {
        this.NombrePers = NombrePers;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "\nPersona{Nombre=" + NombrePers + ", Edad=" + Edad + ", Peso=" + Peso + '}';
    }
}
