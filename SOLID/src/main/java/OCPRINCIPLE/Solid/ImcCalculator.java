/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OCPRINCIPLE.Solid;

import OCPRINCIPLE.Solid.IMC;
import OCPRINCIPLE.Solid.Hombre;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ImcCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<IMC> pacientes=new ArrayList(); 
        IMC p1=new Hombre(10, 185);
        IMC p2=new Mujer(40, 184);
        pacientes.add(p1);
        pacientes.add(p2);
        ImprimirImc(pacientes);
       
    }
    public static void ImprimirImc(ArrayList<IMC> personas){
         for (IMC p: personas){
             System.out.println(p.getIMC());
        }
    }
    
}
