/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas_sumatorias;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Practicas_sumatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sumatoria un solo for
        Scanner l = new Scanner(System.in);
        int n, k, s;
        System.out.println("Digite un número: ");
        n = l.nextInt();
        s = 0;
        for (k = 1; k <= n; k++) {
            s = s + 6 * k - 5;
        }
        System.out.println("La suma es: " + s);
    }

}
