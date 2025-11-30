/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Fish {
   private String typeOfFish; 
    private int friendliness; 
   
    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3; 
    }
    public Fish(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    public int getFriendliness() {
        return this.friendliness;
    }

    public String getTypeOfFish() {
        return this.typeOfFish;
    } 
}
