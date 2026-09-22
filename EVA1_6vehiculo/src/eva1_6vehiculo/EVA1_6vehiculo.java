/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6vehiculo;

import java.util.Scanner;

/**
 *
 * @author Marcos Rodriguez
 */
public class EVA1_6vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        String marca; //String son letras 
        String modelo;
        int año;      //Números enteros
        String color;
        int kilometraje;
        double precio; //Números fraccionarios
        
        Scanner captu = new Scanner(System.in); //Se recibe informacion del teclado
        
        System.out.println("La Marca Del Carro: ");
        marca = captu.nextLine();
        
        System.out.println("El Modelo Del Carro: ");
        modelo = captu.nextLine();
        
        System.out.println("Color Del Carro: ");
        color = captu.nextLine();
        
        System.out.println("El Año Del Carro: ");
        año = captu.nextInt();
        
        System.out.println("El Kilometraje Del Carro: ");
        kilometraje = captu.nextInt();
        
        System.out.println("Precio Del Carro: ");
        precio = captu.nextDouble();
        
        System.out.println("DATOS CAPTURADOS");
        
        System.out.print("Marca Del Carro: ");
        System.out.println(marca);
        
        System.out.print("Modelo Del Carro: ");
        System.out.println(modelo);
        
        System.out.print("Año Del Carro: ");
        System.out.println(año);
        
        System.out.print("Color Del Carro: ");
        System.out.println(color);
        
        System.out.print("Kilometraje Del Carro: ");
        System.out.println(kilometraje);
        
        System.out.print("Precio Del Carro: ");
        System.out.println(precio);
    }
    
}
