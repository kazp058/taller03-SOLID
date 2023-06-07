/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIPrinciple.Solid;

/**
 *
 * @author CltControl
 */
public class PrintService {
    private Printer printer;

    public PrintService(Printer printer) {
        this.printer = printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printDocument(String document) {
        printer.print(document);
    }

}
