/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class TestVehicle {

    public static void main(String[] args) {
        Vehicles.setMake("Seer"); 
        Vehicles vehicle1 = new Vehicles("Vision"); 
        Vehicles vehicle2 = new Vehicles("Edict");
        
     
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        
        Vehicles outerClassInstance = new Vehicles("Intermediate");  
        Vehicles.Engine vehicle3 = outerClassInstance.new Engine("Fortune"); 
        
        System.out.println("Number of vehicles manufactured: " + Vehicles.numVehicles);
        System.out.println("Vehicle number ch" + vehicle3.getVehicleChassisNo().substring(2) + " is a " + 
                           vehicle3.getVehicleModel() + " model and has an engine capacity of " + 
                           vehicle3.getEngineCapacity() + "cc");
        System.out.println("vehicle1 y vehicle2 NO tienen acceso directo al trabajo interno (clase Engine) ");
        System.out.println("porque la clase interna 'Engine' está anidada dentro de una nueva instancia 'outerClassInstance'.");
    }
}