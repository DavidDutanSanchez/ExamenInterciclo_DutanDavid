/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author surfa
 */
public class Factura {

    private int numero;
    private Date fecha;
    private double total;
    private int cantidad;
    private List<DatosCliente> datosClientes;

    public Factura(int id, Date fecha, double total, int cantidad) {
        this.numero = id;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
    }

    public Factura() {
        datosClientes = new ArrayList<>();

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int id) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarDatosCliente(DatosCliente datosCliente) {
        datosClientes.add(datosCliente);

    }

    public List<DatosCliente> imprimirDatosClientes() {
        return datosClientes;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", fecha=" + fecha + ", total=" + total + ", cantidad=" + cantidad + '}';
    }

    public void borrador() {

    }

}
