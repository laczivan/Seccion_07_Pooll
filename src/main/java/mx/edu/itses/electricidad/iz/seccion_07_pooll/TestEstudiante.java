/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante maryJones = new Estudiante("Mary Jones", 14,12.6, 46);
        Estudiante johnStiner = new Estudiante("John Stiner", 60, 123.2, 173);
        Estudiante ariSamala = new Estudiante("Ari Samala", 31,56.7, 69);
        
        System.out.println(maryJones);
        System.out.println(johnStiner);
        System.out.println(ariSamala);
  
        int creditosAdicionales = 13;
        int puntosAdicionales = 52;
        
        System.out.println("Modificación de Ari Samala");
        System.out.println("Datos de Ari Samala antes de la modificacion:");
        System.out.println("Créditos: " + ariSamala.getCreditos() + ", Puntos: " + ariSamala.getPuntosDeCalidad());
       
        ariSamala.actualizarDatos(creditosAdicionales, puntosAdicionales);
        
        System.out.println("Datos de Ari Samala despues de la modificacion:");
        System.out.println(ariSamala);
        
       
    }
}
