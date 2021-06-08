/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import com.sun.org.apache.bcel.internal.generic.FADD;
import ec.edu.ups.modelo.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author surfa
 */
public class ControladorFactura {

    private DatosCliente datosCliente;
    private DatosProducto datosProducto;
    private DetalleFactura detalleFactura;
    private Factura factura;
    private Map<Integer, Factura> diccionario;
    private ControladorDatosCliente controladorDatosCliente;

    public ControladorFactura(DatosCliente datosCliente, DatosProducto datosProducto, DetalleFactura detalleFactura, Factura factura, ControladorDatosCliente controladorDatosCliente) {
        this.datosCliente = datosCliente;
        this.datosProducto = datosProducto;
        this.detalleFactura = detalleFactura;
        this.factura = factura;
        this.diccionario = new HashMap<>();
        this.controladorDatosCliente = controladorDatosCliente;
    }

    public ControladorFactura() {
    }

    public boolean create(int numero, Date fecha, double total, int cantidad, int datosClientes) {
        if (controladorDatosCliente.buscar(String.valueOf(datosClientes)) != null) {
            factura = new Factura(numero, fecha, total, cantidad);
            // Set<DatosCliente> clientes1 = new HashSet<>();
            //for (DatosCliente cliente : clientes1) {
            //  factura.agregarDatosCliente(datosCliente);
            //clientes1.add(cliente);
            diccionario.put(numero, factura);

            return true;
            // }
        }
        return false;
    }

    public Factura buscar(int codigo) {
        if (factura != null) {
            return factura;
        } else {
            System.out.println("la factura no existe");
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        if (buscar(codigo) != null) {
            factura = new Factura(codigo, null, 00.0, 0);
            diccionario.clear();
            return true;
        } else {
            return false;
        }
    }

    public Collection<Factura> findAll() {
        Collection<Factura> facturas = diccionario.values();
        return facturas;
    }
}
