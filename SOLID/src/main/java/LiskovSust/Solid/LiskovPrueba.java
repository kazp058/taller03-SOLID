/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LiskovSust.Solid;

import LiskovSust.Solid.Gallina;
import LiskovSust.Solid.Bird;

/**
 *
 * @author USUARIO
 */
public class LiskovPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird g=new Gallina("ave", 2, 2);
        Bird p=new Paloma("ave", 2, 2);
        
        g.isVertebadro();
       
        g.isVertebadro();
        
    }
    
}
