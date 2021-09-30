/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;



public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado  p1 = new Empleado("Javier","Masculino","C/Holaquetal",21,30000.0);
        Empleado  p2 = new Empleado("Ana","Femenino","C/feantona",57,68000.0);
        
        p1.mostarEmpleado();
        p2.mostarEmpleado();
        
        
    }
    
}
