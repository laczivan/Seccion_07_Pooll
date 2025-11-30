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
        Vehicles vehicle2 = new Vehicles("Edit");
        
     
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        
        Vehicles outerClassInstance = new Vehicles("Intermediario");  
        Vehicles.Engine vehicle3 = outerClassInstance.new Engine("Fortuna"); 
        
        System.out.println("Numero de vehiculos: " + Vehicles.numVehicles);
        System.out.println("Numero de vehiculo" + vehicle3.getVehicleChassisNo().substring(2) + " is a " + 
                           vehicle3.getVehicleModel() + " modelo ha sido modificado su capacidad de " + 
                           vehicle3.getEngineCapacity() + "cc");
    }
}
