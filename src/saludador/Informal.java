/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludador;

/**
 *
 * @author Estudiantes
 */
public class Informal extends Saludo{
    
    @Override
    public void saludar(){
        System.out.println("Que mas "+nombre+"?");
    }
}
