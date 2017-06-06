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
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String nombre,String apellido,String nss,
            double sueldoPorHoras,double horasTrabajadas){
        super(nombre,apellido,nss);
        setSueldo(sueldoPorHoras);
        setHoras(horasTrabajadas);
    }
    
    public void setSueldo (double sueldoPorHoras){
        if (sueldoPorHoras>=0){
            sueldo=sueldoPorHoras;
        }else{
            throw new IllegalArgumentException(
            "El sueldo por horas debe ser >=0");
        }
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setHoras(double horasTrabajadas){
        if((horasTrabajadas>=0)&(horasTrabajadas<=168)){
            horas=horasTrabajadas;
        }else{
            throw new IllegalArgumentException(
            "Las horas trabajadas deben ser >= 0 y <= 168");
        }
    }
    
    public double getHoras (){
        return horas;
    }
    
    @Override
    public double ingresos (){
        if (this.getHoras()<=40){
            return this.getSueldo()*this.getHoras();
        }else{
            return 40*this.getSueldo()+(this.getHoras()-40)*this.getSueldo()*1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s \n%s: $%,.2f; %s: %,.2f",
                super.toString(),"sueldo por hora", this.getSueldo(),
                "horas trabajadas",this.getHoras());
    }
}
