package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DetalleFactura;
import ec.edu.ups.modelo.Factura;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author surfa
 */
public class ControladorDetalleFactura {
     private ArrayList<Integer> diccionario;
     private DetalleFactura detalleFactura;
     private Factura factura;

    public ControladorDetalleFactura(ArrayList<Integer> diccionario, DetalleFactura detalleFactura, Factura factura) {
        this.diccionario = diccionario;
        this.detalleFactura = detalleFactura;
        this.factura = factura;
    }

    public ControladorDetalleFactura() {
    }
    
    
  public void aniadirFactura(Factura factura){
     this.factura= factura;
      
  }
  
  public void aniadirLista(List<Integer>codigoProducto){
      for (int i = 0; i < codigoProducto.size(); i++) {
         diccionario.add(codigoProducto.get(i));
      }
 
  }
  
  public List<Integer> MostrarLista(){
     return diccionario;
  }
}
