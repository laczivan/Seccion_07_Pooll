/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
// Clase de prueba para los ejercicios 6 a 9
public class TestFish {

    public static void main(String[] args) {
        
        Fish amber = new Fish("AngelFish", 5); 
        Fish james = new Fish("Guppy", 3);
        
        System.out.println("Peces creados");
        System.out.println("Amber : Amistad = " + amber.getFriendliness());
        System.out.println("James : Amistad = " + james.getFriendliness());
        
        Fish nicestOfTwo = nicestFish(amber, james);
        System.out.println("El pez mas lindo es el pez tipo: " + nicestOfTwo.getTypeOfFish());
       
        Fish bob = new Fish("Clownfish", 2);
        Fish charlie = new Fish("Shark", 1); 
        Fish david = new Fish("Tetra", 4);   

        System.out.println("8.");
        Fish leastFriendly = nicestFish(amber, james, bob, charlie, david); 
        System.out.println("El pez más amigable de la lista tiene el tipo: " + leastFriendly.getTypeOfFish());
        
        System.out.println("9.");
        System.out.println("Se devuelve el pescado tipo: " + leastFriendly.getTypeOfFish());
      
    }
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() < fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
       
    }
    public static Fish nicestFish(Fish... fishes) {
        if (fishes.length == 0) {
            return null; 
        }
       
        Fish temp = fishes[0];
        
        for (Fish currentFish : fishes) {
            if (currentFish.getFriendliness() < temp.getFriendliness()) {
                temp = currentFish;
            }
        }
        
        return temp; 
    }
}
