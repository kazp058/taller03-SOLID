/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRPRINCIPLE.noSolid;

/**
 *
 * @author CltControl
 */
public class ProductoNoSolid {
     private String nombre;
    private double tax;
    private double precioBase;

    public ProductoNoSolid(String nombre, double tax, double precioBase) {
        this.nombre = nombre;
        this.tax = tax;
        this.precioBase = precioBase;
    }

    public double getTax() {
        return tax;
    }


    public double getPrecioBase() {
        return precioBase;
    }
    public static double getPrecioFinal(ProductoNoSolid p){
        return (p.getPrecioBase()*p.getTax())+p.getPrecioBase();
    }

}
