/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPrinciple;

/**
 *
 * @author USUARIO
 */
public class carroAutomatico implements Automatic {

    @Override
    public void breakAssistance() {
        System.out.println("Asistencia Frenado");
    }

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
    
}
