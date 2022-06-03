/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reto2;

import static Reto2.puntoDos.primos;
import static Reto2.puntoTres.bicicleta;
import static Reto2.puntoUno.impares;
import java.util.Scanner;

/**
 *
 * @author Escuiquirin
 */
public class puntoCuatro {

    /**
     * @param args the command line arguments
     */
    //Johan Sebastian Henao Cañas - David Gomez
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       int opcion = -2;
       while(opcion != 0){
           System.out.println("""
                              BIENVENIDO ESTE ES MI MENU
                              1) SUMA DE CUADRADOS CON IMPARES
                              2) CALCULAR ALGUNOS NUMEROS PRIMOS
                              3) CALCULAR LOS DESARROLLOS DE UNA BICICLETA
                              0) SALIR""");
           opcion = lector.nextInt();
           switch (opcion){
               case 1:
                   impares();
                case 2:
                   primos();
                case 3:
                   bicicleta();
           }
       }
        System.out.println("");
        
    }
    
}
