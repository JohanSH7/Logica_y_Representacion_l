package Reto2;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Escuiquirin
 */
public class puntoTres {
 //Johan Sebastian Henao Cañas - David Gomez
    public static void bicicleta() {
        Scanner lector = new Scanner(System.in);
        int platosDelanteros, dientesDelantero1 = 0, dientesDelantero2 = 0, dimensionLlanta = 0, dimUsuario;
        
        System.out.println("Ingrese el numero de platos delanteros: ");
        platosDelanteros = lector.nextInt();

        if (platosDelanteros == 1){
            System.out.println("Ingrese el numero de dientes del plato " + platosDelanteros + " : ");
            dientesDelantero1 = lector.nextInt();
        } else if (platosDelanteros==2){
            System.out.println("Ingrese el numero de dientes del plato 1: ");
                dientesDelantero1 = lector.nextInt();
                System.out.println("Ingrese el numero de dientes del plato 2: ");
                dientesDelantero2 = lector.nextInt();
        } else {
            System.out.println("El valor ingresado no puede ser calculado");
        }
             
        int [] dientesPiniones = new int[12];
        for (int i = 0; i< dientesPiniones.length; i++){
            while(true) {
                System.out.println("Ingrese el número de dientes del pinion trasero " + (i+1));
                dientesPiniones[i] = lector.nextInt();
                if(dientesPiniones[i] != 0) break;
                System.out.println("El valor debe ser diferente de 0");
            }
        }
        
        System.out.println("Ingrese la dimension de la llanta, digite: ");
        System.out.println("1.  29x2.1");
        System.out.println("2.  29x2.2");
        System.out.println("3.  29x2.3");
        dimUsuario = lector.nextInt();
        switch(dimUsuario){
            case 1:
                dimensionLlanta = 2288;
                break;
            case 2:
                dimensionLlanta = 2298;
                break;
            case 3:
                dimensionLlanta = 2326;
                break;
        }
        
        double[] calculoPlato1 = new double[12];
        double[] calculoPlato2 = new double[12];
        
        for (int i = 0; i < dientesPiniones.length; i++) {
            calculoPlato1[i] = (dientesDelantero1/dientesPiniones[i]) * dimensionLlanta;
            calculoPlato2[i] = (dientesDelantero2/dientesPiniones[i]) * dimensionLlanta;
        }
        
        System.out.println("");
        
        for (int i = 0; i < calculoPlato1.length; i++) {
            if(dientesDelantero1 == 0) break;
            System.out.println("Calculo en metros para el plato 1 con el pinion de " + dientesPiniones[i] + " dientes es: " + calculoPlato1[i] + "m");
        }
        
        System.out.println("");
        
        for (int i = 0; i < calculoPlato1.length; i++) {
            if(dientesDelantero2 == 0) break;
            System.out.println("Los desarrollos en metros para el plato 2 con el pinion de " + dientesPiniones[i] + " dientes es: " + calculoPlato2[i] + "mts");
        }
    }    
}