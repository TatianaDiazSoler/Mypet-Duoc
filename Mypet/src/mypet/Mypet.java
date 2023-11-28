/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mypet;

import mypet.Vista.Vista_cliente;

/**
 *
 * @author Tatiana Diaz y Anibal Montecinos
 */
public class Mypet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_cliente().setVisible(true);
            }
        });
    }
    
}
