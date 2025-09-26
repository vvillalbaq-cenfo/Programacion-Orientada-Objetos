/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgregacionExample;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Curso {
    private String id;
   private String nombre;
   public Curso(){
     this.id = "";
     this.nombre = "";
   }
   public Curso(String id, String nombre){
     this.id = id;
     this.nombre = nombre;
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
    @Override
    public String toString(){
      return this.id + this.nombre;
    }
   
}
