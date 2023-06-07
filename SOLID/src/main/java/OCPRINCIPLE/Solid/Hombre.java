/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPRINCIPLE.Solid;

/**
 *
 * @author USUARIO
 */
public class Hombre extends Persona implements IMC  {
 
    public  Hombre(int e, double a){
        super(e, a);
        
    }

    @Override
    public double getIMC() {
        return 1.8*(getEdad()+getAltura());
    }
        

  
    
}
