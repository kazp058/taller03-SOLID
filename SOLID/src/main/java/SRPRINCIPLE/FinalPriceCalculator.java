/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRPRINCIPLE;

/**
 *
 * @author USUARIO
 */
public class FinalPriceCalculator {
    public static double getPrecioFinal(Producto p){
        return (p.getPrecioBase()*p.getTax())+p.getPrecioBase();
    }
}
