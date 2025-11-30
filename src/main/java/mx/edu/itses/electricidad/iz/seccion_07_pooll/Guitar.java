/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Guitar extends StringInstrument{
    private boolean isElectric;
    
    public Guitar(double price, int numInStock, int numStrings, boolean isElectric) {
        super(price, numInStock, numStrings); 
        this.isElectric = isElectric;
    }
    public boolean getIsElectric() {
        return isElectric;
    }
    public static void main(String[] args) {
        Guitar fender = new Guitar(1000.00, 5, 6, true);
      
        System.out.println("Precio Inicial: $" + fender.getPrice()); 
        fender.setOnSale(true);
        double salePrice = fender.getPrice();
        System.out.println("Precio de Venta $" + salePrice); 
        
        double employeePrice = fender.applyEmployeeDiscount();
        System.out.println("Precio Empleado  $" + employeePrice);

        System.out.println("Es eléctrica: " + fender.getIsElectric());
        System.out.println("Numero de cuerdas: " + fender.getNumStrings());
        System.out.println("Stock: " + fender.getNumInStock());
    }
}
