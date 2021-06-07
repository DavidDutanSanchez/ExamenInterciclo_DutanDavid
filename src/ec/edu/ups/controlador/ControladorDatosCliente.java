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
    private Map<String, DatosCliente> diccionario;
    
   

    public ControladorDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
        this.diccionario = new HashMap<String,DatosCliente>();
    }

    public ControladorDatosCliente() {
    }
    
    
    
    public void crear(int id, String nombre, String Cedula,String fialidadPago){
        datosCliente= new DatosCliente(id, nombre, Cedula, fialidadPago);
        diccionario.put(Cedula, datosCliente);
                
    }
    public DatosCliente buscar(int id){
         if(datosCliente!=null){
            return datosCliente;
        }else{
            System.out.println("El cliente no existe");
        }
        return null;
    }
    public boolean modificar(int id, String nombre, String Cedula,String fialidadPago){
        if(buscar(id)!= null){
            datosCliente=buscar(id);
            datosCliente.setNombre(nombre);
            datosCliente.setCedula(Cedula);
            datosCliente.setFialidadPago(fialidadPago);
         //datosCliente= new DatosCliente(id, nombre, Cedula, fialidadPago);
         diccionario.put(Cedula, datosCliente);
         return true;
        }  else{
            return false;
        }
    }
    public boolean eliminar(int id){
        if(buscar(id)!=null){
        datosCliente=new DatosCliente(id, null, null, null);
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
