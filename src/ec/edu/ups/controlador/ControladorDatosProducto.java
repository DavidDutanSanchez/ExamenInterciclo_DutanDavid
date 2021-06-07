/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DatosProducto;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorDatosProducto {

    private DatosProducto datosProducto;
    private Map<Integer, DatosProducto> diccionario;

    public ControladorDatosProducto(DatosProducto datosProducto) {
        this.datosProducto = datosProducto;
        this.diccionario = new HashMap<Integer, DatosProducto>();
    }

    public ControladorDatosProducto() {
    }

    
    public void crear(int codigo, String descripcion, double precioUnitario, int stock, double iva) {
        
        datosProducto = new DatosProducto(codigo, descripcion, precioUnitario, stock, iva);
        diccionario.put(codigo, datosProducto);

    }

    public DatosProducto buscar(int codigo) {
        if (datosProducto != null) {
            return datosProducto;
        } else {
            System.out.println("El Producto no existe");
        }
        return null;
    }

    public boolean modificar(int codigo, String descripcion, double precioUnitario, int stock, double iva) {
        if (buscar(codigo) != null) {
            datosProducto=buscar(codigo);
            datosProducto.setDescripcion(descripcion);
            datosProducto.setPrecioUnitario(precioUnitario);
            datosProducto.setStock(stock);
            datosProducto.setIva(iva);
            //datosProducto = new DatosProducto(codigo, descripcion, precioUnitario, stock, iva);
            diccionario.put(codigo, datosProducto);
            return true;
        } else {
            return false;
        }

    }

    public boolean eliminar(int codigo) {
        if(buscar(codigo)!= null){
        datosProducto = new DatosProducto(codigo, null, 0.00, 0, 0.00);
        diccionario.remove(codigo);
        return true;
    }else{
    return false;
}
    }
     public Collection<DatosProducto> findAll() {
        Collection<DatosProducto> datosProductos = diccionario.values();
        return datosProductos;
    }
}
