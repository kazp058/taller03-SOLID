/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPrinciple.noSolid;


/**
 *
 * @author USUARIO
 */
public class carroMecanico implements Manejar{



    @Override
    public void darVuelta() {
        System.out.println("Dar vuelta");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciar");
    }

    @Override
    public void breakAssistance() {
        throw new UnsupportedOperationException("No tiene asistencia de frenado"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void embragar() {
        System.out.println("Embraga");
    }
    
}
