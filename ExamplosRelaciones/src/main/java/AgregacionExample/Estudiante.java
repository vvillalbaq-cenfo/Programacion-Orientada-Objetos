/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaExample;

import AgregacionExample.Curso;
import java.util.ArrayList;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Estudiante{

    /**
     * @return the ListaCursos
     */
    public ArrayList<Curso> getListaCursos() {
        return ListaCursos;
    }

    /**
     * @param ListaCursos the ListaCursos to set
     */
    public void setListaCursos(ArrayList<Curso> ListaCursos) {
        this.ListaCursos = ListaCursos;
    }
    private String id;
    private String nombre;
    private int edad;
    private float peso;
    private float horasEstudio;
    private ArrayList<Curso> ListaCursos; //= new ArrayList<Curso>(); // Create an ArrayList object;
    public Estudiante(){
      this.id = "";
      this.nombre = "";
      this.edad = 0;
      this.peso = 0.0f;  
      this.horasEstudio = 0.0f;
      this.ListaCursos = null;
    }
    public Estudiante(String id, String nombre, int edad, float peso, float horasEstudio, ArrayList<Curso> ListaCursos){
      this.id = id;
      this.nombre = nombre;
      this.edad = edad;
      this.peso = peso;
      this.horasEstudio = horasEstudio;
      this.ListaCursos = ListaCursos;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /**
     * @return the horasEstudio
     */
    public float getHorasEstudio() {
        return horasEstudio;
    }

    /**
     * @param horasEstudio the horasEstudio to set
     */
    public void setHorasEstudio(float horasEstudio) {
        this.horasEstudio = horasEstudio;
    }
    @Override
    public String toString(){
      return  this.id + this.nombre + this.edad + this.peso + this.horasEstudio;  
    }
    
}
