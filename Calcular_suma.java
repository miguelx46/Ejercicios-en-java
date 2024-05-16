/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular_suma;

/**
 *
 * @author migue
 */
public class Calcular_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int suma, num;
       suma = 0;
       num = 100;
       do {
           
         suma = suma + num;
         num = num - 2;
       } while (num >= 0);
        System.out.println("La suma total es: " + suma);
    }
    
}
