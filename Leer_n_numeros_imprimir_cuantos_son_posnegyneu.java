/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer_n_numeros_imprimir_cuantos_son_posnegyneu;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Leer_n_numeros_imprimir_cuantos_son_posnegyneu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer N números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros
        Scanner l = new Scanner(System.in);
        int num, cpos, cneg, cneu, cnumfin;
        cpos = 0;
        cneg = 0;
        cneu = 0;
        System.out.println("Digite cuantos números quiere calcular");
        cnumfin = l.nextInt();
        for (int contnum = 1; contnum <= cnumfin; contnum++) {
            System.out.println("Digite un número:");
            num = l.nextInt();
            if (num > 0) {
                cpos = cpos + 1;
            } else {
                if (num == 0) {
                    cneu = cneu + 1;
                } else {
                    cneg = cneg + 1;
                }
            }
        }
        System.out.println("Hay:" + cpos + "números positivos," + cneu + "números neutros," + cneg + "números negativos");
    }

}
