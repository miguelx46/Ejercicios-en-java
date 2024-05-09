/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package función.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class FunciónRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int pablo, numrandom, c;
        c = 1; 
        numrandom = random.nextInt(14);
        while(c == 1) {
         switch (numrandom) {
              case 0:System.out.println("Ramon es gay");
              break;
              case 1:System.out.println("Blaking es gay");
              break;
              case 2:System.out.println("Desgold es gay");
              break;
              case 3:System.out.println("Atraxer es gay");
              break;
              case 4:System.out.println("Maximo es gay");
              break;
              case 5:System.out.println("Miguel es gay");
              break;
              case 6:System.out.println("Cebolla es gay");
              break;
              case 7:System.out.println("Naxo es gay");
              break;
              case 8:System.out.println("Tivi es gay");
              break;
              case 9:System.out.println("Thomas es gay");
              break;
              case 10:System.out.println("Anx es gay");
              break;
              case 11:System.out.println("Madre de Anx es gay");
              break;
              case 12:System.out.println("Sushi es gay");
              break;
              case 13:System.out.println("Valery es gay");
              break;
            }   
        }
    }
    
}
