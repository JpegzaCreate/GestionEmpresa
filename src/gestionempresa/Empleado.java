package gestionempresa;

/**
 *
 * @author javip
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private Double sueldo;
    private static int contador;
    
    /*public Empleado(String nombre, int edad,Double sueldo  ) {
        this.idEmpleado=++Empleado.contador;
        this.nombre= nombre;
        this.edad=edad;
        this.sueldo=sueldo; 
    }*/

    public Empleado(  String nombre, String genero, String direccion, int edad,Double sueldo) {
        super(nombre, genero, direccion, edad);
        this.idEmpleado=++Empleado.contador;
        this.sueldo = sueldo;
    }
    
    
    public void mostarEmpleado(){
        System.out.println("El ide es: "+idEmpleado);
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("El sueldo es: "+sueldo);
        System.out.println();
    }
/*
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    */

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
            
}
