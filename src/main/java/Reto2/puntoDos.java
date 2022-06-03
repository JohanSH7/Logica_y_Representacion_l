/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reto2;
import java.util.Scanner;

/** Escriba un programa que, en primer lugar, pida un número entero N, y luego, muestre en 
pantalla los primeros N números primos para, finalmente, mostrar la suma de estos
*/

/**
 *
 * @author Escuiquirin
 */
public class puntoDos {
 //Johan Sebastian Henao Cañas - David Gomez
    public static void primos() {
        Scanner lector = new Scanner(System.in);
        int contador, suma, x, primo , n;
        
        System.out.println("Ingrese un numero entero: ");
        n = lector.nextInt();
        primo = 0;
        suma = 0;
        while (n>0) {
            primo = primo + 1;
            x = 1;
            contador = 0;
            while (x<= primo) {
                if (primo % x == 0) {
                    contador = contador + 1;
                }
                x = x + 1;
            }
            if (contador == 2) {
                System.out.println("El numero " + primo + " es primo");
                n = n - 1;
                suma = suma + primo;
            }
            
        }
        System.out.println("Suma de los anteriores numeros primos: " + suma);
    }
    
}
