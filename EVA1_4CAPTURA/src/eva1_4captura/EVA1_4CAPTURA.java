/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USA 
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA 
        //TIPO_DATO NOMBRE_INDENTIFICADOR;
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR QUE SE USA 
        String nombre;//declaracion de la variable
        System.out.println("Captura el nombre:");
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner captu = new Scanner(System.in);//OTRA VARIABLE --> captu de tipo scanner 
        //CAPTURAR DEL TECLADO Y PONERLO EN LA VARIABLE NOMBRE 
        //ESCRIBIR EN LA VARIABLE (PONER VALOR ) ASIGNACION
        
        nombre = captu.nextLine();
        System.out.println(nombre); //USO DE LA VARIABLE -->LECTURA 
    }
    
}
