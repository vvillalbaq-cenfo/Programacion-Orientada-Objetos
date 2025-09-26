/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaExample;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Persona {
    protected String id;
    protected String nombre;
    protected int edad;
    protected float peso; 
    public Persona(){
        this.id = new String();
        this.nombre = new String();
        this.edad = 0;
        this.peso = 0.0f;
    }
    public Persona(String id, String nombre, int edad, float peso){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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
    String ToString(){
      return this.id + this.nombre + this.edad + this.peso;  
    }
}
