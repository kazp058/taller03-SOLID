/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIPrinciple.Solid;

/**
 *
 * @author CltControl
 */
public class Main {
     public static void main(String[] args) {
        // Creamos una instancia de PrintService con una impresora láser
        Printer laserPrinter = new LaserPrinter();
        PrintService printService = new PrintService(laserPrinter);
        printService.printDocument("Documento 1");

        // Cambiamos la impresora a una de inyección de tinta
        Printer inkjetPrinter = new InkjetPrinter();
        printService.setPrinter(inkjetPrinter);
        printService.printDocument("Documento 2");
    }
}
