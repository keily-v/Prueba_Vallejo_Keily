
package dominio;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String genero;
    private double [] nota;
    double promedio;
    int estudiantesEncimaPromedio; 
    double porcentaje;

    public Estudiante(String nombre, String genero, double nota[]){
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
        
    }
    
    
    public void setPromedio(){
        double suma=0;
        double promedio=0;
        //Suma de las notas de los 12 estudiantes
        for (int i = 0; i <this.nota.length; i++) {
            //this.notas.length
            suma += this.nota[i];
        }
        this.promedio = suma/this.nota.length;
    }
    
    public void setEstudiantesEncimaPromedio(){
        int estudiantes =0;
        
        //estudiantes se incrementa 1 cada vez que es comparada su nota
        //con el promedio del curso 
        for (int i = 0; i <this.nota.length; i++) {
            if (this.nota[i]>this.promedio){
                estudiantes ++;
            }
        }
        
        this.estudiantesEncimaPromedio= estudiantes;
    }
    public int getnroEstudiantesEncimaPromedio(){
        return this.estudiantesEncimaPromedio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double[] getNota() {
        return nota;
    }

   
    
    @Override
    public String toString(){
        return this.nombre+"   "+this.genero+"   "+this.nota;
              
    }
}
//https://github.com/keily-v/Prueba_Vallejo_Keily.git