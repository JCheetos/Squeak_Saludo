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
public class Formal extends Saludo{
    
    @Override
    public void saludar(){
        System.out.println("Buenos dias "+nombre);
    }
}