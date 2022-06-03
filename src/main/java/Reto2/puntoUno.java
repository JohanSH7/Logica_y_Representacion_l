/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reto2;
import java.util.Scanner;

/**
 *
 * @author Escuiquirin
 */
    /** Construir un procedimiento que calcule el cuadrado de los N primeros enteros, haciéndolo 
     mediante sumas de números impares
    */
public class puntoUno {
 //Johan Sebastian Henao Cañas - David Gomez
    public static void impares() {
        Scanner lector = new Scanner(System.in);
        int numero, impar, cuadrado;
        
        System.out.println("Ingrese un numero para calcular su cuadrado");
        numero = lector.nextInt();  
        
        impar = 1;
        cuadrado = 0;
        
        for (int i = 1; i <= numero; i++){
            cuadrado = cuadrado + impar;
            impar = impar + 2;
            System.out.println(i + " = " + cuadrado);
        }
    }
    
}
