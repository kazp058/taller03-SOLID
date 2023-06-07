/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPrinciple;

/**
 *
 * @author USUARIO
 */
public class carroMecanico implements Mechanical {

    @Override
    public void Embragar() {
        System.out.println("Embragar");
    }

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
    
}
