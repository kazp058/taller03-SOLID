/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SRPRINCIPLE;

/**
 *
 * @author USUARIO
 */
public class SingleResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p=new Producto("p1",0.12,30);
        Double precio=FinalPriceCalculator.getPrecioFinal(p);
        System.out.println(precio);
    }
    
}
