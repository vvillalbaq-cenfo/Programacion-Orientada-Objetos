/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examplesweek4;
import HerenciaExample.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JUANMURILLOMORERA
 */
public class ExamplesWeek4 {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        String id= JOptionPane.showInputDialog("Ingrese el id del estudiante:");
        e.setId(id);
        JOptionPane.showMessageDialog(null,"El Id es:"+e.getId());
        






    }
}
