/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSust.noSolid;

/**
 *
 * @author USUARIO
 */
public class Bird {
    protected String tipo;
    protected int numPatas;
    protected int numAlas;

    public Bird(String tipo, int numPatas, int numAlas) {
        this.tipo = tipo;
        this.numPatas = numPatas;
        this.numAlas = numAlas;
        
    }

    public void isVertebadro(){
        System.out.println("es vertebrado");
    }
    public void canFly(){
        System.out.println("Vuela");
    }

  
    
    
}
