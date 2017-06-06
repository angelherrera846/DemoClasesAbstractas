/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Angel Herrera
 */
public abstract class Empleado {
    private String primerNombre;
    private String primerApellido;
    private String numeroDeSeguroSocial;
    
    public Empleado (String nombre,String apellido,String nss){
        primerNombre=nombre;
        primerApellido=apellido;
        numeroDeSeguroSocial=nss;
    }
    
    public void setPrimerNombre(String nombre){
        primerNombre=nombre;
    }
    
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    public void setPrimerApellido(String apellido){
        primerApellido=apellido;
    }
    
    public String getPrimerapellido(){
        return primerApellido;
    }
    
    public void setNumeroDeSeguroSocial(String nss){
        numeroDeSeguroSocial=nss;
    }
    
    public String getNumeroDeSeguroSocial(){
        return numeroDeSeguroSocial;
    }
    
    public String toString(){
       return String.format("%s %s\nnumero de seguro social: %s",
               this.getPrimerNombre(),this.getPrimerapellido(),this.getNumeroDeSeguroSocial()); 
    }
    
}
