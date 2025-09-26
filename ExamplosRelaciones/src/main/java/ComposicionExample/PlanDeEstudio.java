/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComposicionExample;

import AgregacionExample.Curso;
import java.util.ArrayList;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class PlanDeEstudio {
     private String id;
    private String nombre;
    private ArrayList<Curso> ListaCursos; 
    public PlanDeEstudio(){
        this.id = "123";
        this.nombre = "BachiEnIngSoft";
        ListaCursos= new ArrayList<Curso>(); // Create an ArrayList object;
        ListaCursos.add(new Curso());
        ListaCursos.add(new Curso());
        ListaCursos.add(new Curso());
        ListaCursos.add(new Curso());
        ListaCursos.add(new Curso());
        ListaCursos.add(new Curso());
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
}
