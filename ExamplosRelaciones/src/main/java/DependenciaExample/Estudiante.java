/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaExample;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Estudiante{
    private String id;
    private String nombre;
    private int edad;
    private float peso;
    private float horasEstudio;
    private Libro l;
    public Estudiante(){
      this.id = "";
      this.nombre = "";
      this.edad = 0;
      this.peso = 0.0f;  
      this.horasEstudio = 0.0f;
      this.l = null;
    }
    public Estudiante(String id, String nombre, int edad, float peso, float horasEstudio, Libro l){
      this.id = id;
      this.nombre = nombre;
      this.edad = edad;
      this.peso = peso;
      this.horasEstudio = horasEstudio;
      this.l = l;
    }
    /**
     * @return the l
     */
    public Libro getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Libro l) {
        this.l = l;
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
