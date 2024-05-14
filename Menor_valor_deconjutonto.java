/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menor_valor_deconjutonto;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Menor_valor_deconjutonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Encontrar el menor valor de un conjunto de n números dados.
        int n, cn, vmin, v;
        vmin = 0;
        cn = 1;
        Scanner l = new Scanner(System.in);
        System.out.println("Digite la cantidad de números del conjunto:");
        n = l.nextInt();
        while (cn <= n)  {
            System.out.println("Digite un valor:");
            v = l.nextInt();
            if (cn == 1) {
                vmin = v;
            }           
            if (v < vmin) {
                vmin = v;
            }
            cn = cn + 1;
        }
        System.out.println("El valor menor del conjunto es: " + vmin);
    }
    
}
