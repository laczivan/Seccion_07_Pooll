/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Estudiante {
    private String nombre;
    private int creditos;
    private double gpa;
    private int puntosDeCalidad;

    public Estudiante(String nombre, int creditos, double gpa, int puntosDeCalidad) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.gpa = gpa;
        this.puntosDeCalidad = puntosDeCalidad;
    }
    
    public double calcularGPA(){
        if (creditos ==0){
            return 0.0;
        }
        return(double)puntosDeCalidad/creditos;
    }
    public void actualizarDatos( int nuevosCreditos, int nuevosPuntos){
        this.creditos+= nuevosCreditos;
        this.puntosDeCalidad+= puntosDeCalidad;
        this.gpa=calcularGPA();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getGpa() {
        return gpa;
    }

    public int getPuntosDeCalidad() {
        return puntosDeCalidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", creditos=" + creditos + ", gpa=" + gpa + ", puntosDeCalidad=" + puntosDeCalidad + '}';
    }
    
    
}
