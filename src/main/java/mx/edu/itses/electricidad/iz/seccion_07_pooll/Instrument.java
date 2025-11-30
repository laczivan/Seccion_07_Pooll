/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Instrument {
    private boolean onSale;
    private double price; 
    private int numInStock;
    
    public Instrument(double price, int numInStock) {
        this.onSale = false;
        this.price = price;
        this.numInStock = numInStock;
    }

      public double getPrice() {
        if (onSale) {
           return price * 0.85; 
        }
        return price;
    }

    public double applyEmployeeDiscount() {
        return price * 0.75;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}
