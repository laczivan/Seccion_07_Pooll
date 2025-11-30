/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
public class FactorialCalculator {
    public int num; 
    public FactorialCalculator(int num) {
        this.num = num;
    }

    public int getFactorial() {
        if (num < 0) {
            return 0; 
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        
        int factorial = 1;
       
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
        
         sb.append("Factorial: ").append(num).append("! = ");
        
         for (int i = 1; i <= num; i++) {
            sb.append(i);
                    if (i < num) {
                sb.append(" * ");
            }
        } 
        sb.append(" = ").append(getFactorial());
        
        return sb.toString();
    }   
    public static void main(String[] args) {
        FactorialCalculator calc = new FactorialCalculator(10);
        
         System.out.println(calc); 
        
        FactorialCalculator calc5 = new FactorialCalculator(5);
        System.out.println(calc5);
    }
}
