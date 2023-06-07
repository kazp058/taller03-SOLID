/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRPRINCIPLE;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private String nombre;
    private double tax;
    private double precioBase;

    public Producto(String nombre, double tax, double precioBase) {
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

}
