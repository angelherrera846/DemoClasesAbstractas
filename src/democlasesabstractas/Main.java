/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlasesabstractas;

import Modelo.Empleado;

/**
 *
 * @author Angel Herrera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado empleado= new Empleado ("jorge","lopez","djbdf") {};
       System.out.println(empleado.toString());
    }
    
}
