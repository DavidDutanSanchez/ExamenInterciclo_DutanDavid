/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author surfa
 */
public class VistaFactura {

    ControladorFactura controladorFactura;
    ControladorDatosProducto controladorDatosProducto;
    ControladorDetalleFactura controladorDetalleFactura;
    ControladorDatosCliente controladorDatosCliente;
    public DateFormat formatoFecha;
    List<Integer> datosProductos = new ArrayList<>();
    private double subtotal = 0;

    public VistaFactura(ControladorFactura controladorFactura, ControladorDatosProducto controladorDatosProducto, ControladorDetalleFactura controladorDetalleFactura) {
        this.controladorFactura = controladorFactura;
        this.controladorDatosProducto = controladorDatosProducto;
        this.controladorDetalleFactura = controladorDetalleFactura;
        formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
    }
  

    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion4;

    public void crear() {
        System.out.println("Ingrese los Datos de la Factura: ");
        System.out.println("Ingrese numero de Factura: ");
        int numero=input.nextInt();
        System.out.println("Fecha (dd/mm/yyyy):");
        String fecha = input.next();
        while (!salir) {

            System.out.println(" 1.Agregar producto\n 2.Facturar\n 3.Salir");
            try {
                System.out.println("Elija una opcion");
                opcion4 = input.nextInt();

                switch (opcion4) {

                    case 1:
                        System.out.println("ingrese el codigo del producto para agregar a la factura");
                        int codigoProducto = input.nextInt();
                        if (controladorDatosProducto.buscar(codigoProducto) != null) {
                            datosProductos.add(codigoProducto);
                            subtotal += controladorDatosProducto.buscar(codigoProducto).getPrecioUnitario();
                        } else {
                            System.out.println("codigo de producto no existe");
                        }

                        System.out.println("Producto agregado ala factura");
                        break;

                    case 2:
                        System.out.println("Dijite el numero del Cliente");
                        int id=input.nextInt();
                        if(controladorDatosCliente.buscar(id)!=null){
                        controladorFactura.create(numero, Calendar.getInstance().getTime(),subtotal ,0 ,id);
                        controladorDetalleFactura.aniadirLista(datosProductos);
                        
                        }else{
                            System.out.println("Cliente no existe");
                        }
                        
                                break;
                    case 3:

                        salir = true;
                    default:
                        System.out.println("Solo numeros entre el 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero.");
                input.nextInt();
            }
        }
    }

    public void buscar() {
         System.out.println("Ingrese el numero de Factura a buscar");
       int codigo=input.nextInt();
        if (controladorFactura.buscar(codigo)!=null){
           controladorDatosProducto.buscar(codigo).toString();
        }else{
            System.out.println("la factura no existe");
        } 
    }
    

    public void eliminar() {
          System.out.println("Ingrese el numero de factura a eliminar:");
        int codigo=input.nextInt();
        if(controladorFactura.buscar(codigo)!=null){
            controladorFactura.eliminar(codigo);
            System.out.println("Factura eliminado");
        }else{
            System.out.println("factura no existente");
        }
    }

    public void listarFacturas() {
        controladorFactura.findAll().stream().forEach(object -> System.out.println(object));
    }
}
