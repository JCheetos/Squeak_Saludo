/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludador;

import java.util.Scanner;
import saludador.Formal;
import saludador.Informal;
import saludador.Saludo;
import saludador.Semiformal;


/**
 *
 * @author Estudiantes
 */
public class Saludador {

    /**
     * @param args the command line arguments 
     */
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como desea ser saludado?");
        System.out.println("1. Saludo Formal");
        System.out.println("2. Saludo Semiformal");
        System.out.println("3. Saludo Informal");
        int opcion =sc.nextInt();
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();
        Saludo s=null;
        switch(opcion) {
            case 1:
                s = new Formal();
                break;
            case 2:
                s = new Semiformal();
                break;
            case 3:
                s = new Informal();
                break;
            default: 
                System.out.println("Esa no es una opcion valida.");
                break;
        }
        s.setNombre(nombre);
        s.saludar();
    }
}
