/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRPRINCIPLE.noSolid;

/**
 *
 * @author CltControl
 */
public class SingleResponsabilityNoSolid {
    public static void main(String[] args) {
        ProductoNoSolid p=new ProductoNoSolid("p1",0.12,30);
        Double precio=ProductoNoSolid.getPrecioFinal(p);
        System.out.println(precio);
    }
}
