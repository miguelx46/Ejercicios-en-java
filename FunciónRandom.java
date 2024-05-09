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
              case 0:System.out.println("Ramon");
              break;
              case 1:System.out.println("Blaking");
              break;
              case 2:System.out.println("Desgold");
              break;
              case 3:System.out.println("Atraxer");
              break;
              case 4:System.out.println("Maximo");
              break;
              case 5:System.out.println("Miguel");
              break;
              case 6:System.out.println("Cebolla");
              break;
              case 7:System.out.println("Naxo");
              break;
              case 8:System.out.println("Tivi");
              break;
              case 9:System.out.println("Thomas");
              break;
              case 10:System.out.println("Anx");
              break;
              case 11:System.out.println("Madre de Anx");
              break;
              case 12:System.out.println("Sushi");
              break;
              case 13:System.out.println("Valery");
              break;
            }   
        }
    }
    
}
