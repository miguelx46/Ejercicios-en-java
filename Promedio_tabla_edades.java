/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio_tabla_edades;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Promedio_tabla_edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        float cn, cj, ca, cv, n, p, ptotn, ptotj, ptota, ptotv, prompn, ptot, prompj, prompa, prompv, prompntot, prompjtot, prompatot, prompvtot;
        int ed;
        cn = 0;
        cj = 0;
        ca = 0;
        cv = 0;
        ptotn = 0;
        ptotj = 0;
        ptota = 0;
        ptotv = 0;
        for (n = 1; n <= 50; n++) {
            System.out.println("Digite su edad:");
            ed = l.nextInt();
            System.out.println("Digite su peso:");
            p = l.nextFloat();
            if (ed >= 0 & ed <= 12) {
                cn = cn + 1;
              ptotn = ptotn + p;  
            } else {
             if (ed >= 13 & ed <= 29) {
                 cj = cj + 1;
                 ptotj = ptotj + p; 
             } else {
                 if (ed >= 30 & ed <= 59) {
                 ca = ca + 1;
                 ptota = ptota + p; 
             } else {
                     if (ed >= 60) {
                     cv = cv + 1;
                     ptotv = ptotv + p; 
                }
              }
            }
          }
        }
    prompn = ptotn/cn;    
    prompntot = prompn/cn; 
    System.out.println("Promedio de peso en niños:" + prompntot);
    
    prompj = ptotj/cj; 
    prompjtot = prompj/cj; 
    System.out.println("Promedio de peso en jovenes:" + prompjtot);
    
    prompa = ptota/ca; 
    prompatot = prompa/ca; 
    System.out.println("Promedio de peso en adultos:" + prompatot);
    
    prompv = ptotv/cv; 
    prompvtot = prompv/cv; 
    System.out.println("Promedio de peso en viejos:" + prompvtot);
 }
}