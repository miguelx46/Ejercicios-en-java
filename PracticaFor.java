/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkgfor;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author migue
 */
public class PracticaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 10 números y obtener su cubo y su cuadrado.
        Scanner l = new Scanner(System.in);
        int num, cuad, cub;
        
        for (int cnum = 1; cnum <=10; cnum++) {
            System.out.println("Digite un número");
            num = l.nextInt();
            cuad = (int) Math.pow(num, 2);
            cub = (int) Math.pow(num, 3);
        System.out.println("El cuadrado del número es:" +cuad);
        System.out.println("El cubo del número es:" +cub);
        } 
    }
    
}
