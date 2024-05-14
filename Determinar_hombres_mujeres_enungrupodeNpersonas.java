/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinar_hombres_mujeres_enungrupodenpersonas;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Determinar_hombres_mujeres_enungrupodeNpersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* Determinar cuantos hombres y cuantas mujeres se encuentran en un grupo de n personas, suponiendo que los
   datos son extraídos uno por uno */
   Scanner l = new Scanner(System.in);
        int ch, cm, ctot, N;
        ch = 0;
        cm = 0;
        ctot = 0;
        String op;        
        System.out.println("Digite la cantidad de personas:");
        N = l.nextInt();        
        while (ctot < N) {
            System.out.println("escribe h si eres hombre o m si eres mujer:");
            op = l.next();           
            if (op.equals("h")) {
                System.out.println("Escribiste " + op);
                ch = ch + 1;
            } else {
                if (op.equals("m")) {
                    System.out.println("Escribiste " + op);
                    cm = cm + 1;
                }
            }
            ctot = cm + ch;
        }
        System.out.println("Hay " + ch + " hombres y " + cm + " mujeres");
    }
    
}
