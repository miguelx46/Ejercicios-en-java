/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularelpromediodeunalumno_que_tiene_n_calificaciones_en_la_materia_dediseño_estructurado_de_algoritmos;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Calcularelpromediodeunalumno_que_tiene_n_calificaciones_en_la_materia_deDiseño_Estructurado_de_Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Calcular el promedio de un alumno que tiene n calificaciones en la materia de Diseño Estructurado de Algoritmos
    Scanner l = new Scanner(System.in);
    
    float not, promestu, sumnot, cantcal;
    sumnot = 0;
        System.out.println("Digite la cantidad de calificaciones:");
        cantcal = l.nextInt(); 
     for(int ccal = 1; ccal <= cantcal; ccal++) {
         System.out.println("Digite la nota de la calificación");
         not = l.nextFloat();
         sumnot = sumnot + not;
     }
     promestu = sumnot/cantcal;
        System.out.println("El promedio del estudiante es:" +promestu);
    }
    
}
