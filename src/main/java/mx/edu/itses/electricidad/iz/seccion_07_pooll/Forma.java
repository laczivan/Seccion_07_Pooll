/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Forma {
    private int sides;
    private boolean regular;

   public Forma() {
        this.sides = 0;
        this.regular = false;
        System.out.println("Se ha creado una figura nueva");
    }

  
    public Forma(int numSides, boolean regular) {
        this.sides = numSides;
        this.regular = regular;
        System.out.println("Se ha creado una forma 2D con " + numSides + " lados.");
    }

    public int getNumSides() {
        return sides;
    }

    public boolean isRegular() {
        return regular;
    }
    public void setNumSides(int numSides) {
        this.sides = numSides;
    }
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}