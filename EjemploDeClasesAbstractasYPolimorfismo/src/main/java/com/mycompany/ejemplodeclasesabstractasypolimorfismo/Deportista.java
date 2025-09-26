/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodeclasesabstractasypolimorfismo;

/**
 *
 * @author JUANMURILLOMORERA
 */
class Deportista extends Persona {
    @Override
    void andar() {
        System.out.println("El deportista anda rápido.");
    }
    
    @Override
    void correr() {
        System.out.println("El deportista corre a gran velocidad.");
    }
}
