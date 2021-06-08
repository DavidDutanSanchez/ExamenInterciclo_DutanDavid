/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDatosCliente;
import ec.edu.ups.modelo.DatosCliente;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class VistaDatosCliente {
    private ControladorDatosCliente controladorDatosCliente;
    Scanner scanner= new Scanner(System.in);

    public VistaDatosCliente(ControladorDatosCliente controladorDatosCliente) {
        this.controladorDatosCliente = controladorDatosCliente;
    }

    public VistaDatosCliente() {
    }
    public void crearCliente(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println(" el Codigo del cliente");
        int id=scanner.nextInt();
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombre=scanner.next();
        System.out.println("Ingrese la cedula del cliente: ");
        String cedula=scanner.next();
        System.out.println("Ingrese la fialidad de pago del Cliente: ");
        String fialidadPago=scanner.next();
        controladorDatosCliente.crear(id, nombre, cedula, fialidadPago);
        System.out.println("-------Usuario Creado------------");
    }
    
    public VistaDatosCliente buscar(){
         System.out.println("Ingrese la ID del cliente a buscar");
        int id=scanner.nextInt();
        if (controladorDatosCliente.buscar(String.valueOf(id))!=null){
            System.out.println(controladorDatosCliente.buscar(String.valueOf(id)).toString());
        }else{
            System.out.println("usuario no existe");
        } 
        return null;
    }
    public void modificar(){
        System.out.println("Ingrese el codigo del cliente a Modificar");
        int id=scanner.nextInt();
        if(controladorDatosCliente.buscar(String.valueOf(id))!=null){
            System.out.println("----Ingrese los nuevo datos del cliente----");
            System.out.println("Ingrese el nuevo nombre");
            String nombre=scanner.next();
            System.out.println("Ingrese la nueva cedula");
            String cedula=scanner.next();
            System.out.println("Ingrese fialidad de pago");
            String fialidadPago=scanner.next();
            
            controladorDatosCliente.modificar(id, nombre, cedula, fialidadPago);
            System.out.println("Cliente modificado");
        }else{
            System.out.println("usuario no existe");
        }
    }
    
    public  void eliminar(){
        System.out.println("Ingrese el codigo del cliente a eliminar:");
        int id=scanner.nextInt();
       if (controladorDatosCliente.buscar(String.valueOf(id))!=null){
            controladorDatosCliente.eliminar(id);
            System.out.println("Producto eliminado con exito");
        } else {
            System.out.println("Producto no existente");
        }
   }
    
  public void ListarClientes() {
        controladorDatosCliente.findAll().stream().forEach(object-> System.out.println(object));
    }
}
