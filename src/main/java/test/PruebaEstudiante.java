package test;

import dominio.Estudiante;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

public class PruebaEstudiante {

    Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el numero de estudiantes:");
        Scanner datos = new Scanner(System.in);
        int nstudiante = datos.nextInt();
        Estudiante[] estudiantes;
        estudiantes = new Estudiante[nstudiante];
        llenaDatos(estudiantes);

        System.out.println("Estudiantes pertenecientes al curso");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + "   "
                    + estudiantes[i].getGenero() + "   " + estudiantes[i].getNota());

        }

       

    }

    public static void llenaDatos(Estudiante est[]) {
        Scanner datos = new Scanner(System.in);

        String nombre;
        String genero;
        double nota[] = new double[3];

        for (int i = 0; i < est.length; i++) {

            System.out.println("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Gènero: ");
            genero = datos.nextLine();

            for (int j = 0; j < 1; j++) {
                System.out.println("Nota: ");
                nota[i] = datos.nextDouble();
                est[i] = new Estudiante(nombre, genero, nota);
            }

            datos.nextLine();
        }
    }
}
