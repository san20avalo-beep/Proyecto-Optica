/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell
 */
public class DetalleVenta {
    private int idDellate;
    private int idVenta;
    private int idProcto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public DetalleVenta(int idDellate, int idVenta, int idProcto, int cantidad, double precioUnitario, double subtotal) {
        this.idDellate = idDellate;
        this.idVenta = idVenta;
        this.idProcto = idProcto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDellate=" + idDellate + ", idVenta=" + idVenta + ", idProcto=" + idProcto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + '}';
    }

    public int getIdDellate() {
        return idDellate;
    }

    public void setIdDellate(int idDellate) {
        this.idDellate = idDellate;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProcto() {
        return idProcto;
    }

    public void setIdProcto(int idProcto) {
        this.idProcto = idProcto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
