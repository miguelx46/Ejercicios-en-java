/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer_250000_votos;


import java.util.Random;

/**
 *
 * @author migue
 */
public class Leer_250000_votos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Leer los 250,000 votos otorgados a los 3 candidatos a gobernador e imprimir el número del candidato ganador y su
cantidad de votos.
        */
      Random r = new Random();
      int c1, c2, c3, v, cv;
      cv = 0;
      c1 = 0;
      c2 = 0;
      c3 = 0;
      do {
        v = r.nextInt(3);
        cv = cv + 1;
          
        switch (v) {
            case 0:
             c1 = c1 + 1;
               break;            
            case 1:
             c2 = c2 + 1;
               break;
            case 2:
             c3 = c3 + 1;
               break;          
        }
        
      } while (cv <= 250000);
      if (c1 > c2 & c1 > c3) {
        System.out.println("El candidato ganador es el candidato 1!");  
      } else {
        if (c2 > c1 & c2 > c3) {
            System.out.println("El candidato ganador es el candidato 2!");
        } else {
            if (c3 > c1 & c3 > c2) {
                System.out.println("El candidato ganador es el candidato 3!");
            }
        } 
      }
        
    }
    
}
