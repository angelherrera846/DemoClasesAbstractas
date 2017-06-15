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
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss,
            double ventas, double tarifa,double salario){
        super(nombre,apellido,nss,ventas,tarifa);
        setSalarioBase(salario);
    }
    
    public void setSalarioBase(double salario){
        if (salario >= 0){
            salarioBase=salario;
        }else{
            throw new IllegalArgumentException(
            "El salario base debe ser >= 0");
        }
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    @Override 
    public double ingresos(){
        return this.getSalarioBase() + super.ingresos();
    }
    
    @Override   
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "con salario base",super.toString(),
                "salario base", this.getSalarioBase());
    }
}
