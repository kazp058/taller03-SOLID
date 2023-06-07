/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSust;

/**
 *
 * @author USUARIO
 */
public class Bird implements canFly {
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

    @Override
    public void vuela() {
        System.out.println("Aletea"); 
    }
    
    
}
