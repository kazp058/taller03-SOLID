/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIPrinciple.Solid;

/**
 *
 * @author CltControl
 */
class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("Imprimiendo en una impresora de inyección de tinta: " + document);
    }
}