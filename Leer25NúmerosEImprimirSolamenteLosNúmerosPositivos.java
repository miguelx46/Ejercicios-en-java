/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer.pkg25.números.e.imprimir.solamente.los.números.positivos;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Leer25NúmerosEImprimirSolamenteLosNúmerosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 25 números e imprimir solamente los números positivos
        Scanner l = new Scanner(System.in);
        int num;
        for (int cnum = 1; cnum <= 25; cnum++) {
            System.out.println("Digite un número");
            num = l.nextInt();
            if (num>0) {
                System.out.println("El número positivo es " +num);
            }
        }
    }

}
