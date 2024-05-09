/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer15númerosnegativosyconvertirlosapositivoseimprimirdichosnúmeros;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Leer15númerosnegativosyconvertirlosapositivoseimprimirdichosnúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 15 números negativos y convertirlos a positivos e imprimir dichos números
        Scanner l = new Scanner(System.in);
       int numconv, num;
       for (int cnum = 1; cnum <= 15; cnum++) {
           System.out.println("Digite un número negativo");
           num = l.nextInt();
           numconv = num * -1;
           System.out.println("El número convertido es:" +numconv);
           numconv = 0;
       }
    }
    
}
