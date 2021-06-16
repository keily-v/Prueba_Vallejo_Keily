
package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {
    
    Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese el numero de estudiantes:");
        int nstudiante = datos.nextInt();
        
        double[] notas = new double[nstudiante];
        
        Estudiante estudianteA = new Estudiante();
        
        Estudiante[] estudiantes;
        estudiantes = new Estudiante[nstudiante];
        llenaDatos(estudiantes);
        
        System.out.println("Estudiantes pertenecientes al curso");
        for(int i=0; i< estudiantes.length;i++){
            System.out.println(estudiantes[i].getNombre()+ "   " +
                    estudiantes[i].getGenero()+"   "+ estudiantes[i].getNota());
        }
        System.out.println("Notas generadas");
        
        
        
    }
    
    public static void llenaDatos(Estudiante est[]) {
        Scanner datos = new Scanner(System.in);
        String nombre;
        String genero;
        double nota;
        
        for(int i=0; i< est.length;i++){
            System.out.println("Nombre: ");
            nombre= datos.nextLine();
            System.out.println("Gènero: ");
            genero= datos.nextLine();
            System.out.println("Nota: ");
            nota= datos.nextDouble();
            est[i]= new Estudiante(nombre,genero,nota);
            datos.nextLine();
        }
    }
}
