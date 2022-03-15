/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

public class Alumno extends Persona{
    private String grupo;
    private String numeroCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String grupo, String numeroCuenta, String carrera) {
        this.grupo = grupo;
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "grupo=" + grupo + ", numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + '}';
    }

    
    
}
    
    
    





