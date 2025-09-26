/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaExample;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Estudiante extends Persona {
    private float horasEstudio;
    public Estudiante(){
      super.id = "";
      super.nombre = "";
      super.edad = 0;
      super.peso = 0.0f;  
      this.horasEstudio = 0.0f;  
    }
    public Estudiante(String id, String nombre, int edad, float peso, float horasEstudio){
      super.id = id;
      super.nombre = nombre;
      super.edad = edad;
      super.peso = peso;
      this.horasEstudio = horasEstudio;
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
    String ToString(){
      return super.ToString() + horasEstudio;  
    }
    
}
