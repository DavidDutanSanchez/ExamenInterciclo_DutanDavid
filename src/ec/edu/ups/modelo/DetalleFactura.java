/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author surfa
 */
public class DetalleFactura {
    private List<DatosProducto> datosProductos;

    public DetalleFactura(List<DatosProducto> datosProductos) {
        this.datosProductos = datosProductos;
    }

    public DetalleFactura() {
        datosProductos = new ArrayList<>();
    }
    
     public void agregarDatosProductos(DatosProducto datosProducto) {
        datosProductos.add(datosProducto);

    }
 public List<DatosProducto> imprimirDatosPoductos() {
        return datosProductos;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "datosProductos=" + datosProductos + '}';
    }
    
 
}
