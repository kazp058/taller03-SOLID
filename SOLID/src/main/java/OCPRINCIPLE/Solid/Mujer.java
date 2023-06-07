/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPRINCIPLE.Solid;

import OCPRINCIPLE.Solid.IMC;

/**
 *
 * @author USUARIO
 */
public class Mujer  extends Persona implements IMC {
     public  Mujer(int e, double a){
        super(e, a);
        
    }
     @Override
      public double getIMC() {
        return 2.0*(getEdad()+getAltura());
    }

}
