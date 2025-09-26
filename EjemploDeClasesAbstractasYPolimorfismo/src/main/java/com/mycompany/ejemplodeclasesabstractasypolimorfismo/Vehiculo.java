/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplodeclasesabstractasypolimorfismo;

/**
 *
 * @author JUANMURILLOMORERA
 */
public interface Vehiculo {
    public String matricula = "";
    public float maxVel = 0.0f;
    public void arrancar();
    public void detener();
    default void claxon(){
      System.out.println("Sonando claxon");
   }   
}
