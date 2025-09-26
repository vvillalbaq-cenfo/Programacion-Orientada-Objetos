/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplodeclasesabstractasypolimorfismo;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class Rombo extends FiguraH {

    private float lado;
    private float diagonalSuperior;
    private float diagonalInferior;

    /**
     * @return the lado
     */
    public float getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * @return the diagonalSuperior
     */
    public float getDiagonalSuperior() {
        return diagonalSuperior;
    }

    /**
     * @param diagonalSuperior the diagonalSuperior to set
     */
    public void setDiagonalSuperior(float diagonalSuperior) {
        this.diagonalSuperior = diagonalSuperior;
    }

    /**
     * @return the diagonalInferior
     */
    public float getDiagonalInferior() {
        return diagonalInferior;
    }

    /**
     * @param diagonalInferior the diagonalInferior to set
     */
    public void setDiagonalInferior(float diagonalInferior) {
        this.diagonalInferior = diagonalInferior;
    }

    public float area() {
        return 0.0f;
    }

    public float perimetro() {
        return 0.0f;
    }

    public String str() {
        return "";
    }
}
