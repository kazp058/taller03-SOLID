/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSust.noSolid;


/**
 *
 * @author USUARIO
 */
public class Gallina extends Bird {
    public Gallina (String tipo, int numPatas, int numAlas){
        super(tipo, numPatas, numAlas);
    }
    @Override
    public void canFly(){
         throw new UnsupportedOperationException("No puede volar");
    }
   
    
}
