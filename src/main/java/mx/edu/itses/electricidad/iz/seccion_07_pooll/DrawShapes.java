/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.applet.*;

/**
 *
 * @author zunig
 */
public class DrawShapes extends Applet{
    Font font;     
    Color negro;     
    Color blanco;     
    private Color grisClaro;
    private Color grisOscuro;
 
    public void init() { 
        font = new Font("Arial",Font.ITALIC,18); 
        negro = Color.BLACK; 
        blanco = Color.WHITE; 
        grisClaro = new Color(200, 200, 200);
        grisOscuro = Color.DARK_GRAY;
        setBackground(grisClaro); 
    } 
    
    public void stop() { 
    }     
 
    public void paint(Graphics graph) { 
        
        graph.setFont(font); 
        graph.setColor(negro); 
        graph.drawString("Draw Shapes",90,20); 
        graph.setColor(grisOscuro); 
        graph.drawRect(120,120,120,120); 
        graph.setColor(blanco);
        graph.fillRect(115,115,90,90); 
        graph.setColor(negro); 
        graph.fillArc(110,110,50,50,0,360);
        graph.setColor(grisOscuro); 
        graph.drawRect(50,50,50,50); 
        graph.setColor(blanco);
        graph.fillRect(50,50,60,60); 
    } 

}

