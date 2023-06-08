/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSust.Solid;

import LiskovSust.Solid.Bird;

/**
 *
 * @author USUARIO
 */
public class Paloma extends Bird implements canFly{
    public Paloma(String tipo, int numPatas, int numAlas){
        super(tipo, numPatas, numAlas);
    }
    @Override
    public void vuela() {
        System.out.println("Vuela");
    }
    
}
