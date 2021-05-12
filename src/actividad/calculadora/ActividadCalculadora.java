/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.calculadora;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class ActividadCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora(15, 2);
        Scanner st = new Scanner (System.in);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Ingrese el numero de la actividad que quiere realizar: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int operación = st.nextInt();
        
        switch (operación) {
            case 1:
                System.out.println("La suma es de: " + miCalculadora.Sumar());
                break;
            case 2:
                System.out.println("La resta es de: " + miCalculadora.Restar());
                break;
            case 3:
                System.out.println("La multiplicacion es de: " + miCalculadora.Multiplicar());
                break;
            case 4:
                System.out.println("La división es de: " + miCalculadora.Dividir());
                break;
            default:
                break;
                
        }
        //int suma = miCalculadora.Sumar();
        
    }
    
}
