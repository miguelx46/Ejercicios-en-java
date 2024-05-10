/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificación_media_masbaja;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Calificación_media_masbaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Suponga que se tiene un conjunto de calificaciones de un grupo de N alumnos. Realizar un algoritmo para calcular
  la calificación media y la calificación más baja de todo el grupo*/
        Scanner l = new Scanner(System.in);
        int nalum, ncal;
        int cal, calsuma, calmed, calmin;
        calsuma = 0;
        calmin = 0;
        System.out.println("Digite la cantidad de alumnos:");
        nalum = l.nextInt();
        ncal = nalum;
        for (int calum = 1, ccal = 1; calum <= nalum & ccal <= ncal; calum++, ccal++) {
            System.out.println("Digite una nota:");
            cal = l.nextInt();
             if (calum == 1 & ccal == 1) {
                 calmin = cal;
            } else {
                 if (cal < calmin) {
                     calmin = cal;
                 }
             }
            calsuma = calsuma + cal;
            
        }
        calmed = calsuma/nalum;
        System.out.println("La calificación mas baja es:" + calmin + "y, la calificación media es de:" + calmed);

    }

}
