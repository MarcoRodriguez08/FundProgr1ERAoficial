/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5captura2;

import java.util.Scanner;

/**
 *
 * @author Marcos Rodriguez
 */
public class EVA1_5Captura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double salario;
                
        Scanner captu = new Scanner (System.in);
        //CAPTURA
        System.out.println("Captura el nombre del usuario:");
        nombre =captu.nextLine(); //LEE EL TEXTO 
        
        System.out.println("Captura la edad" );
        edad = captu.nextInt();
        
        System.out.println("Captura el salario");
        salario = captu.nextDouble();
        
        System.out.println("DATOS CAPRUTRADOS:");
        
        System.out.print("Nombre:");       
        System.out.println(nombre);
        
        System.out.println("Edad:");
        System.out.print(edad);
        
        System.out.print("Salario:");
        System.out.println(salario);
        
    }
    
}
