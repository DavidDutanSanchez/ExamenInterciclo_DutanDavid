/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.DatosCliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorDatosCliente {
    private DatosCliente datosCliente;
     private Map<Integer, DatosCliente> diccionario;
    
   

    public ControladorDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
        this.diccionario = new HashMap<Integer ,DatosCliente>();
    }

    public ControladorDatosCliente() {
    }
    
    
    
    public void crear(int id, String nombre, String Cedula,String fialidadPago){
        datosCliente= new DatosCliente(id, nombre, Cedula, fialidadPago);
        diccionario.put(id, datosCliente);
                
    }
    public DatosCliente buscar(String id){
         if(datosCliente!=null){
            return datosCliente;
        }else{
            System.out.println("El cliente no existe");
            return null;
        }
    }
    public boolean modificar(int id, String nombre, String Cedula,String fialidadPago){
        if(datosCliente!= null){
           // datosCliente=buscar(id);
            datosCliente.setNombre(nombre);
            datosCliente.setCedula(Cedula);
            datosCliente.setFialidadPago(fialidadPago);
         diccionario.replace(id, datosCliente);
         return true;
        }  else{
            return false;
        }
    }
  
    public boolean eliminar(int id) {
        if(buscar(String.valueOf(id))!= null){
        datosCliente = new DatosCliente(id,null,null,null);
        diccionario.remove(id);
        return true;
    }else{
    return false;
}
    }
    public Collection<DatosCliente> findAll() {
        Collection<DatosCliente> datosClientes = diccionario.values();
        return datosClientes;
    }
}
