/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class DVD extends Product {
    private int movieLength;
    private String ageRating;
    private String filmStudio;

    public DVD(int itemNumber, String name, int quantity, double price, 
               int movieLength, String ageRating, String filmStudio) {
        
        super(itemNumber, name, quantity, price); 
        
        this.movieLength = movieLength;
        this.ageRating = ageRating;
        this.filmStudio = filmStudio;
    }

     @Override
    public double getStockValue() {
        double baseValue = this.getQuantity() * this.getPrice();
        double returnRate = 1.05; 
        return baseValue * returnRate;
    }
    @Override
    public String toString() {
        return String.format(
            "Item Number  : %d\n" +
            "Name         : %s\n" +
            "Movie Length : %d\n" +
            "Age Rating   : %s\n" +
            "Film Studio  : %s\n" +
            "Quantity in stock: %d\n" +
            "Price        : %.2f\n" +
            "Stock Value  : %.3f\n" +
            "Product Status: %s",
            this.getItemNumber(), 
            this.getName(),       
            this.getMovieLength(), 
            this.getAgeRating(),   
            this.getFilmStudio(),  
            this.getQuantity(),   
            this.getPrice(),      
            this.getStockValue(), 
            this.isActive() ? "Active" : "Inactive"
        );
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }
}