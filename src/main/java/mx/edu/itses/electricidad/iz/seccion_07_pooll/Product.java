/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class Product {
    private int itemNumber;
    private String name;
    private int quantity;
    private double price;
    private boolean active;

    public Product(int itemNumber, String name, int quantity, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.active = true;
    }

    // 3. Metodos de Inventario
    public void addToInventory(int quantity) {
        if (this.active) {
            this.quantity += quantity;
            System.out.println("Inventario de " + this.name + " actualizado. Stock: " + this.quantity);
        } else {
            // Requisito 8: No permitir agregar existencias a producto descatalogado.
            System.out.println("ERROR: No se puede agregar existencias a un producto descatalogado: " + this.name);
        }
    }

    public void deductFromInventory(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("Inventario de " + this.name + " actualizado. Stock: " + this.quantity);
        } else {
            System.out.println("ERROR: No se puede deducir " + quantity + " de " + this.quantity + " en stock.");
        }
    }

    // Metodo getStockValue base
    public double getStockValue() {
        return this.quantity * this.price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        System.out.println(this.name + (active ? " ha sido reactivado." : " ha sido descatalogado."));
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Cantidad: %d | Precio: $%.2f | Activo: %b",
                itemNumber, name, quantity, price, active);
    }
}