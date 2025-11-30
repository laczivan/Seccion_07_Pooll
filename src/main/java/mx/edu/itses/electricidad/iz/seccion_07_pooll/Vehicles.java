/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Vehicles {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;
    
    public String chassisNo;
    public String model;
    
       public class Engine extends Vehicles { 

        private String model;
        public Engine(String model) {
            super(model);
        }

        public String getVehicleModel() {           
            return this.model; 
        }

        public String getVehicleChassisNo() {
            return this.chassisNo; 
        }

        public String getEngineMake() {
            return "Predictor"; 
        }

        public int getEngineCapacity() {
            return 1600; 
        }
    }
   
    public Vehicles(String model) {
        numVehicles++; 
        this.chassisNo = "ch" + numVehicles; 
        this.model = model; 
        System.out.println("Vehicle manufactured");
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }

    public static void setMake(String newMake) {
        MAKE = newMake;
    }
}