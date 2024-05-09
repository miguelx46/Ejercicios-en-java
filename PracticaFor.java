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
        int num, cuad, cub,sumnum;
        sumnum = 0;
        for (int cnum = 1; cnum <=10; cnum++) {
            System.out.println("Digite un número");
            num = l.nextInt();
            sumnum = sumnum + num;
        } 
        cuad = (int) Math.pow(sumnum, 2);
        cub = (int) Math.pow(sumnum, 3);
        System.out.println("El cuadrado de la suma de todos los números es:" +cuad);
        System.out.println("El cubo de la suma de todos los números es:" +cub);
    }
    
}
