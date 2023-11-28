/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mypet;

/**
 *
 * @author Tatiana Diaz y Anibal Montecinos
 */
public class Mypet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Crud_Cliente cliente=new Crud_Cliente();
        new Proyecto(Vista_cliente).setVisible(true);
        // TODO code application logic here
    }
    
}
