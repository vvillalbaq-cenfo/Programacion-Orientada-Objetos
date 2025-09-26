/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodeclasesabstractasypolimorfismo;

/**
 *
 * @author JUANMURILLOMORERA
 */
class Informatico extends Persona {
    @Override
    void andar() {
        System.out.println("El informático anda lentamente.");
    }
    
    @Override
    void correr() {
        System.out.println("El informático prefiere no correr.");
    }
}
