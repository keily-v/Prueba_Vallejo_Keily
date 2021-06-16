
package dominio;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String genero;
    private double [] nota;

    public Estudiante(String nombre, String genero, double nota[]){
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }
    
    public void setPromedio(){
        double suma=0;
        //Suma de las notas de los 12 estudiantes
        for (int i = 0; i <12; i++) {
            //this.notas.length
            suma += this.nota[i];
        }
        this.promedio = suma/12;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }
    
    @Override
    public String toString(){
        return this.nombre+"   "+this.genero+"   "+this.nota;
              
    }
}
//https://github.com/keily-v/Prueba_Vallejo_Keily.git