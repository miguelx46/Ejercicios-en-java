/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m.n;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class MN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, p, cn;
        Scanner l = new Scanner(System.in);
        p = 1;
        System.out.println("Ingrese la base:");
        m = l.nextInt();
        System.out.println("Ingrese el exponente:");
        n = l.nextInt();
        for (cn = 1; cn <= n; cn++) {
          p = p*m;  
        }
        System.out.println("El resultado es: " + p);
    }

}
