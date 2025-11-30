/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Seccion_07_Pooll {

    public static void main(String[] args) {
       Forma triangle = new Forma(3, false);
        Forma square = new Forma(4, true);

        System.out.println("Triangulo: Lados = " + triangle.getNumSides() + ", Regular = " + triangle.isRegular());
        
        square.setNumSides(5);
        System.out.println("Cuadrado (ahora Pentágono): Lados = " + square.getNumSides() + ", Regular = " + square.isRegular());
    }
}
