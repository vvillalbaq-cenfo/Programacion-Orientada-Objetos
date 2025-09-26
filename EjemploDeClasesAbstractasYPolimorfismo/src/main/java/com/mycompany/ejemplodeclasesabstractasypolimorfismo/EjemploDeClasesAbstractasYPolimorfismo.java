/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplodeclasesabstractasypolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class EjemploDeClasesAbstractasYPolimorfismo {

    public static void main(String[] args) {
        ArrayList<FiguraH> ListaFiguras = new ArrayList<FiguraH>();
        ListaFiguras.add(new Rombo()); //Up Casting
        ListaFiguras.add(new Rectangulo());
        for (FiguraH laFigura:ListaFiguras){
           System.out.println(laFigura.area());
           if (laFigura instanceof Rombo){
             Rombo r = (Rombo)laFigura; //Down Casting   
           }
           if (laFigura instanceof Rectangulo){
             Rectangulo r = (Rectangulo)laFigura; //Down Casting   
           }
           
        }
        
        //r.area()
        
        
        
        
        ArrayList<Persona> ListaPersonas = new ArrayList<Persona>();
        ListaPersonas.add(new Deportista());
        ListaPersonas.add(new Informatico());
        ListaPersonas.add(new Deportista());
        ListaPersonas.add(new Informatico());
        ListaPersonas.add(new Deportista());
        ListaPersonas.add(new Informatico());
        System.out.print("Valor"+ListaPersonas.size());
       for(Persona p : ListaPersonas){
          System.out.print("Valor"+ListaPersonas.size());
          p.andar();    // Output: El deportista anda rápido.
          p.correr();   // Output: El deportista corre a gran velocidad.
       } 
       
    }
}

