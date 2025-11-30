/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.seccion_07_pooll;

/**
 *
 * @author zunig
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize; 
        Product[] inventory;
        int menuChoice = -1; 

        maxSize = getNumProducts(sc); 
        
        inventory = new Product[maxSize];
        addCDToInventory(inventory, sc); 
        
        do {
            menuChoice = getMenuOption(sc); 
            executeMenuChoice(menuChoice, inventory, sc);

        } while (menuChoice != 0);

        System.out.println("Gracias por usar el sistema de inventario");
        sc.close();
    }

    public static int getNumProducts(Scanner scanner) {
        int maxSize = -1; 
        
        while (maxSize <= 0) {
            System.out.print("Introduzca el numero maximo de productos a ingresar: ");
            try {
                maxSize = scanner.nextInt();
                if (maxSize <= 0) {
                    System.out.println("Error, dl numero debe ser mayor a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error entrada invalida, introduzca un numero entero.");
                scanner.next(); 
                maxSize = -1; 
            }
        }
        return maxSize;
    }

    public static void addCDToInventory(Product[] products, Scanner scanner) {
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
        String tempArtist;
        int tempSongs;
        String tempLabel;
        
        String tempStudio;
        int tempLength;
        String tempRating;

        int stockChoice = -1;
        
        for (int i = 0; i < products.length; i++) {
            System.out.println("Ingresando Producto " + (i + 1) + " de " + products.length );
            stockChoice = -1;
            while (stockChoice < 1 || stockChoice > 2) {
                System.out.println("Seleccione el tipo de producto:");
                System.out.println("1: CD");
                System.out.println("2: DVD");
                
                try {
                    stockChoice = scanner.nextInt();
                    if (stockChoice < 1 || stockChoice > 2) {
                        System.out.println("Error, solo se permite ingresar el num1 y num2");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error introduzca 1 o 2.");
                    scanner.next(); 
                    stockChoice = -1;
                }
            }
            scanner.nextLine(); 

            tempNumber = i + 1; 
            if (stockChoice == 1) { 
                System.out.println("CD ");
                System.out.print("Ingrese el nombre del cd: ");
                tempName = scanner.nextLine();
                System.out.print("ingrese el artista del cd: ");
                tempArtist = scanner.nextLine();
                System.out.print("ingreese el nombre de la discogarfia: ");
                tempLabel = scanner.nextLine();
                
                System.out.print("ingrese el numero de canciones: ");
                tempSongs = scanner.nextInt();
                System.out.print("ingrese la cantidad disponible ");
                tempQty = scanner.nextInt();
                System.out.print("inrgese el precio del profucto: ");
                tempPrice = scanner.nextDouble();
              
                products[i] = new CD(tempNumber, tempName, tempQty, tempPrice,
                                     tempArtist, tempSongs, tempLabel);
                
            } else { 
                System.out.println("DVD ");
                System.out.print("Ingrese el nombre del DVD: ");
                tempName = scanner.nextLine();
                System.out.print("Ingrese el nombre del estudio: ");
                tempStudio = scanner.nextLine();
                System.out.print("Ingrese la clasificacion por edead: ");
                tempRating = scanner.nextLine();
                
                System.out.print("Ingrese cuantos minutos dura ");
                tempLength = scanner.nextInt();
                System.out.print("ingrese la cantidad disponible: ");
                tempQty = scanner.nextInt();
                System.out.print("Ingrese el precio del producto: ");
                tempPrice = scanner.nextDouble();
                
                products[i] = new DVD(tempNumber, tempName, tempQty, tempPrice,
                                      tempLength, tempRating, tempStudio);
            }
        }
    }

    public static void displayInventory(Product[] products) {
        System.out.println("Inventario");
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
            }
        }
    }

    public static int getMenuOption(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 4) {
            System.out.println("MENU ");
            System.out.println("1. View Inventory");
            System.out.println("2. Add Stock");
            System.out.println("3. Deduct Stock");
            System.out.println("4. Discontinue Product");
            System.out.println("0. Exit");
           

            try {
                choice = scanner.nextInt();
                if (choice < 0 || choice > 4) {
                    System.out.println("Error, opcion invalida. Por favor, introduzca un numero entre 0 y 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error entrada invalida. Por favor, introduzca un numero.");
                scanner.next(); 
                choice = -1; 
            }
        }
        return choice;
    }

    public static int getProductNumber(Product[] products, Scanner scanner) {
        int productChoice = -1; 
        
        while (productChoice < 0 || productChoice >= products.length) {
            System.out.println("SELECCION DE PRODUCTO ");
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    System.out.println(i + ". " + products[i].getName() + 
                                       " (Stock: " + products[i].getQuantity() + ")");
                }
            }
            System.out.print("Seleccione el numero del producto a actualizar (0 a " + (products.length - 1) + "): ");
            
            try {
                productChoice = scanner.nextInt();
                if (productChoice < 0 || productChoice >= products.length) {
                    System.out.println("Error indice fuera de rango. Seleccione un numero de la lista.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error entrada invalida. Introduzca un numero entero.");
                scanner.next();
                productChoice = -1;
            }
        }
        return productChoice;
    }
   
    public static void addInventory(Product[] products, Scanner scanner) {
        int productChoice;
        int updateValue = -1; 
        
        productChoice = getProductNumber(products, scanner);

        while (updateValue <= 0) {
            System.out.print("Cuantos productos quiere agregar? (Debe ser > 0): ");
            try {
                updateValue = scanner.nextInt();
                if (updateValue <= 0) {
                    System.out.println("Erro el valor a agregar debe ser mayor que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error entrada invalida. Introduzca un numero entero.");
                scanner.next();
                updateValue = -1;
            }
        }

        products[productChoice].addToInventory(updateValue);
    }
    public static void deductInventory(Product[] products, Scanner scanner) {
        int productChoice;
        int updateValue = -1;
        
        productChoice = getProductNumber(products, scanner);
        
        int currentStock = products[productChoice].getQuantity();

        while (updateValue < 0 || updateValue > currentStock) {
            System.out.print("Cuantos productos quiere deducir? (Stock actual: " + currentStock + "): ");
            try {
                updateValue = scanner.nextInt();
                if (updateValue < 0) {
                    System.out.println("Erroe el valor a deducir no puede ser negativo.");
                } else if (updateValue > currentStock) {
                    System.out.println("Erroor no se puede deducir mas de " + currentStock + " unidades.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error introduzca un numero entero.");
                scanner.next();
                updateValue = -1;
            }
        }

        products[productChoice].deductFromInventory(updateValue);
    }
    public static void discontinueInventory(Product[] products, Scanner scanner) {
        int productChoice; 

        productChoice = getProductNumber(products, scanner);
        
        products[productChoice].setActive(false);
    }
    public static void executeMenuChoice(int choice, Product[] products, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("View Product List ");
                displayInventory(products); 
                break;
            case 2:
                System.out.println("Add Stock ");
                addInventory(products, scanner); 
                break;
            case 3:
                System.out.println("Deduct Stock");
                deductInventory(products, scanner); 
                break;
            case 4:
                System.out.println("Discontinue Stock");
                discontinueInventory(products, scanner); 
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion de menu no reconocida.");
        }
    }
}