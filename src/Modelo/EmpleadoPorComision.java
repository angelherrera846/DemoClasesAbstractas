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
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaPorComision;
    
    public EmpleadoPorComision (String nombre, String apellido, String nss,
            double ventas, double tarifa){
        super(nombre,apellido,nss);
        setVentasBrutas(ventas);
        setTarifaPorComision(tarifa);
    }
    
    public void setVentasBrutas(double ventas){
        if (ventasBrutas>=0){
            ventasBrutas=ventas;
        }else{
            throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0");
        }
    }
    
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    public void setTarifaPorComision(double tarifa){
        if(tarifa>=0 && tarifa<=1){
            tarifaPorComision = tarifa;
        }
    }
    
    public double getTarifaPorComision(){
        return tarifaPorComision;
    }
    
    @Override 
    public double ingresos(){
        return this.getTarifaPorComision()* this.getVentasBrutas();
    }
    @Override 
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f;%s: %.2f",
                "Empleado por comision",super.toString(),
                "ventas brutas",this.getVentasBrutas(),
                "tarifa por comision", this.getTarifaPorComision());
    }
    
}
