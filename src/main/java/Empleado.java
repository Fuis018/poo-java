/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCV-PIURA
 */
public class Empleado {
    private String Apellidos;
    private String Nombres;
    private int Horas;
    private double CostoHoras;

    public Empleado(String Apellidos, String Nombres, int Horas, double CostoHoras) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Horas = Horas;
        this.CostoHoras = CostoHoras;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String APellidos) {
        this.Apellidos = APellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public double getCostoHoras() {
        return CostoHoras;
    }

    public void setCostoHoras(double CostoHoras) {
        this.CostoHoras = CostoHoras;
    }

    public double calcularSueldo() {
        return Horas * CostoHoras;
    }
}
