/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPrinciple.noSolid;



/**
 *
 * @author USUARIO
 */
public class carroAutomatico implements Manejar{

    

    @Override
    public void darVuelta() {
        System.out.println("Da vuelta");
    }

    @Override
    public void frenar() {
        System.out.println("frenar");
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciar");
    }

    @Override
    public void breakAssistance() {
        System.out.println("Tiene break Assitance");
    }

    @Override
    public void embragar() {
        throw new UnsupportedOperationException("No puede embragar"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
