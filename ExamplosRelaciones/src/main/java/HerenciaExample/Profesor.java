/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaExample;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Profesor extends Persona {
    private String categoriaSalarial;
    public Profesor(){
      super.id = "";
      super.nombre = "";
      super.edad = 0;
      super.peso = 0.0f;  
      this.categoriaSalarial = "";  
    }
    public Profesor(String id, String nombre, int edad, float peso, String categoriaSalarial){
      super.id = id;
      super.nombre = nombre;
      super.edad = edad;
      super.peso = peso;
      this.categoriaSalarial = categoriaSalarial;
    }
    /**
     * @return the horasEstudio
     */
    public String getCategoriaSalarial() {
        return categoriaSalarial;
    }

    /**
     * @param horasEstudio the horasEstudio to set
     */
    public void setCategoriaSalarial(String categoriaSalarial) {
        this.categoriaSalarial = categoriaSalarial;
    }
    @Override
    String ToString(){
      return super.ToString() + categoriaSalarial;  
    }
}
