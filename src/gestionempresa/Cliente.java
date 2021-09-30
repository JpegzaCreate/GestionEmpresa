/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

import java.util.Date;

/**
 *
 * @author javip
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fecha;
    private boolean vip;
    private static int contador;

    public Cliente(int idCliente,String nombre, String genero, String direccion, int edad, Date fecha, boolean vip) {
        super(nombre, genero, direccion, edad);
        this.idCliente = ++Cliente.contador;
        this.fecha = fecha;
        this.vip = vip;
    }

    
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    
    
}
