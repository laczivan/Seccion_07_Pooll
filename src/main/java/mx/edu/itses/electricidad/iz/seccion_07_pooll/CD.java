/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class CD extends Product {
    private String artist;
    private int numSongs;
    private String recordLabel;

    public CD(int itemNumber, String name, int quantity, double price, 
              String artist, int numSongs, String recordLabel) {
        
        super(itemNumber, name, quantity, price); 
        
        this.artist = artist;
        this.numSongs = numSongs;
        this.recordLabel = recordLabel;
    } 
    @Override
    public double getStockValue() {
        return super.getStockValue();
    }
    @Override
    public String toString() {
        return String.format(
            "Item Number  : %d\n" +
            "Name         : %s\n" +
            "Artist       : %s\n" +
            "Songs on Album: %d\n" +
            "Record label : %s\n" +
            "Quantity in stock: %d\n" +
            "Price        : %.2f\n" +
            "Stock Value  : %.3f\n" +
            "Product Status: %s",
            this.getItemNumber(),
            this.getName(),
            this.getArtist(),
            this.getNumSongs(),
            this.getRecordLabel(),
            this.getQuantity(),
            this.getPrice(),
            this.getStockValue(), 
            this.isActive() ? "Active" : "Inactive"
        );
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
}