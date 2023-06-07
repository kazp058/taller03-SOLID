/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OCPRINCIPLE.noSolid;


import OCPRINCIPLE.noSolid.Hombre;
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
        ArrayList<Persona> pacientes=new ArrayList(); 
        Persona p1=new Hombre(10, 185);
        Persona p2=new Mujer(40, 184);
        pacientes.add(p1);
        pacientes.add(p2);
        
        for (Persona p: pacientes){
            if (p instanceof Mujer){
                System.out.println((p.getEdad()+p.getAltura())*2.00);
            }
            else if(p instanceof Hombre){
                System.out.println((p.getEdad()+p.getAltura())*2.00);
            }
        }
    }
    
}
