/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell
 */
public class Venta {
    private int idVentas;
    private String fecha;
    private double total;
    private int idEmpleados;
    private int idCliente;

    public Venta(int idVentas, String fecha, double total, int idEmpleados, int idCliente) {
        this.idVentas = idVentas;
        this.fecha = fecha;
        this.total = total;
        this.idEmpleados = idEmpleados;
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVentas=" + idVentas + ", fecha=" + fecha + ", total=" + total + ", idEmpleados=" + idEmpleados + ", idCliente=" + idCliente + '}';
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
            
}
