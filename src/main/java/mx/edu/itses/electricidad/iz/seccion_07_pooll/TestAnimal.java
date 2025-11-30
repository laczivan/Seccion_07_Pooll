/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal(34, 1, 24.6);
        int peso = 100;
        int altura = 5;
        int velocidad = 10;
        Animal animal2 = new Animal(peso,altura, velocidad);
        System.out.println("El animal 1 tiene una velocidad de: " + animal.getSpeed()+"k/h");
        System.out.println("El animal 2 ttien una velociudad de: " + animal2.getSpeed()+"k/h");
        
    }
}
