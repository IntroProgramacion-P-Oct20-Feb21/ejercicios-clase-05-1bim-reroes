/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2.  porcentaje1, d[0,n] <-- 10
        double porcentaje1 = 10;
        // 3.  porcentaje2, d[0,n] <-- 15
        double porcentaje2 = 15;
        // 4.  porcentaje3, d[0,n] <-- 20
        double porcentaje3 = 20;
        // 5.  numeroDias, i[0,n]
        int numeroDias;
        // 6.  precioHabitacion, d[0,n]
        double precioHabitacion;
        // 7.  subtotal, d[0,n]
        double subtotal;
        // 8.  descuento, d[0, n]
        double descuento;
        // 9.  valorTotal, d[0,n]
        double valorTotal;
        
        // 11.  Escribir "Ingrese el número de días que se hospedará"
        System.out.println("Ingrese el número de días que se hospedará");
        // 12.  Lea numeroDias
        numeroDias = entrada.nextInt();
        
        // 13.  Escribir "Ingrese el valor diario de la habitación"
        System.out.println("Ingrese el valor diario de la habitación");
        // 13.  Lea precioHabitacion
        precioHabitacion = entrada.nextDouble();

        // 14.  Si numeroDias > 5 and numeroDias <= 10 entonces
        if (numeroDias > 5 && numeroDias <= 10) {
            // 15.     subtotal <-- numeroDias * precioHabitacion
            subtotal = numeroDias * precioHabitacion;
            // 16.     descuento <-- (porcentaje1 * subtotal)/100
            descuento = (porcentaje1 * subtotal)/100;
            // 17.     valorTotal <-- valorTotal - descuento
            valorTotal = subtotal - descuento;

        } else {
            // 19.     Si numeroDias > 10 and numeroDias <= 15 entonces
            if (numeroDias > 10 && numeroDias <= 15) {
                // 20.         subtotal <-- numeroDias * precioHabitacion
                subtotal = numeroDias * precioHabitacion;
                // 21.         descuento <-- (porcentaje2 * subtotal)/100
                descuento = (porcentaje2 * subtotal)/100;
                // 22.         valorTotal <-- subtotal - descuento
                valorTotal = subtotal - descuento;

            } else {
                // 24.         Si numeroDias > 15 
                if (numeroDias > 15) {
                    // 25. subtotal <-- numeroDias * precioHabitacion
                    subtotal = numeroDias * precioHabitacion;
                    // 26. descuento <-- (porcentaje3 * subtotal)/100
                    descuento = (porcentaje3 * subtotal)/100;
                    // 27. valorTotal <-- subtotal - descuento
                    valorTotal = subtotal - descuento;

                } else {
                    // 29. subtotal <-- numeroDias * precioHabitacion
                    subtotal = numeroDias * precioHabitacion;
                    // 30. descuento <-- 0 
                    descuento = 0;
                    // 31. valorTotal <-- subtotal - descuento
                    valorTotal = subtotal - descuento;

                } 
            }
        }
        // 35. Escribir "El valor subtotal es: " + subtotal
        // 36. Escribir "El descuento es: " + descuento
        // 37. Escribir "El valor total a pagar es: " + valorTotal
        System.out.printf("El valor subtotal es: %.2f\n"
                + "El descuento es: %.2f\n"
                + "El valor total a pagar es: %.2f\n",
                subtotal,
                descuento,
                valorTotal);

    }
    
}
