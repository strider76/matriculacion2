/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolegame;

/**
 *
 * @author manolo
 */
public class Rolegame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Troll
        Troll trollDeLasCavernas = new Troll();
        trollDeLasCavernas.setNombre("Maricuchili");
        //Mostramos el objeto Troll en consola por el metodo toString
        System.out.println("Informacion de objeto Troll: " + trollDeLasCavernas);
    }
    
}
