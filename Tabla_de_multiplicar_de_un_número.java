/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla_de_multiplicar_de_un_número;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Tabla_de_multiplicar_de_un_número {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Calcular e imprimir la tabla de multiplicar de un número cualquiera. Imprimir el multiplicando, el multiplicador y el
producto*/
    Scanner l = new Scanner(System.in);
    int n, b;
        
        System.out.println("Digite un número");
        n = l.nextInt();
        for (int a = 1; a <= 10; a++) {
            b = n*a;
            System.out.println( + n + "*" + a + "=" + b);
        }
    }
    
}
