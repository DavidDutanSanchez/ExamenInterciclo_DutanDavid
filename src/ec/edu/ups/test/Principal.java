/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.modelo.*;
import ec.edu.ups.controlador.*;
import ec.edu.ups.test.*;
import ec.edu.ups.vista.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class Principal {
    public static void main (String []args){
        
        DatosCliente datosCliente= new DatosCliente();
        DatosProducto datosProducto= new DatosProducto();
        DetalleFactura detalleFactura=new DetalleFactura();
        Factura factura= new Factura();
        
        ControladorDatosCliente controladorDatosCliente= new ControladorDatosCliente(datosCliente);
        ControladorDatosProducto controladorDatosProducto=new ControladorDatosProducto(datosProducto);
        ControladorFactura controladorFactura=new ControladorFactura();
        ControladorDetalleFactura controladorDetalleFactura= new ControladorDetalleFactura();
        
        VistaDatosCliente vistaDatosCliente= new VistaDatosCliente(controladorDatosCliente);
        VistaDatosProducto vistaDatosProducto= new VistaDatosProducto(controladorDatosProducto);
        VistaFactura vistaFactura=new VistaFactura(controladorFactura, controladorDatosProducto, controladorDetalleFactura);
        
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        boolean salir3 = false;
        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;

        while (!salir) {
            System.out.println("Bienvenido al sistema de David Dutan ");
            System.out.println(" 1.gestionar Cliente\n 2.gestionar Productos\n 3.crear Factura\n 4.salir");
            try {
                System.out.println("Elija una opcion");
                opcion = input.nextInt();

                switch (opcion) {

                    case 1:
                            while (!salir1) {
                                System.out.println("QUE DESEEA HACER");
                                System.out.println("*******************************");
                                System.out.println(
                                        " 1.Crear Cliente\n "
                                        + "2.Buscar Cliente \n "
                                        + "3.modificar Cliente\n "
                                        + "4.Eliminar Cliente\n "
                                        + "5.Listar clientes\n "
                                        + "6.salir\n " );
                                      
                                try {
                                    System.out.println("Elija una opcion: ");
                                    opcion1 = input.nextInt();
                                    switch (opcion1) {
                                        case 1:
                                          vistaDatosCliente.crearCliente();
                                            System.out.println("Cliente creado");
                                            break;
                                        case 2:
                                           vistaDatosCliente.buscar();
                                            System.out.println("Cliente encontrado");
                                            break;
                                        case 3:
                                            vistaDatosCliente.modificar();
                                            System.out.println("Cliente modificado");
                                            break;
                                        case 4:
                                            vistaDatosCliente.eliminar();
                                            System.out.println("Cliente eliminado");
                                            break;
                                        case 5:
                                          vistaDatosCliente.ListarClientes();
                                            break;
                                        case 6:
                                             salir1 = true;
                                            break;
                                        default:
                                            System.out.println("Solo numeros entre el 1 y 6");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Debes insertar un numero.");
                                    input.nextInt();
                                }
                            }
                        break;
                    case 2:
                            while (!salir2) {
                                System.out.println("QUE DESEEA HACER");
                                System.out.println("*******************************");
                                System.out.println(
                                        " 1.Registrar Producto\n "
                                        + "2.buscar Producto\n "
                                        + "3.modificar Producto\n "
                                        + "4.eliminar producto\n "
                                        + "5.Listar productos\n "
                                        + "6.salir\n " );
                                try {
                                    System.out.println("Elija una opcion");
                                    opcion1 = input.nextInt();
                                    switch (opcion1) {
                                        case 1:
                                            vistaDatosProducto.crear();
                                            System.out.println("Producto creado");
                                            break;
                                        case 2:
                                           vistaDatosProducto.buscar();
                                            System.out.println("Producto encontrado");
                                            break;
                                        case 3:
                                           vistaDatosProducto.modificar();
                                            System.out.println("Producto modificado");
                                            break;
                                        case 4:
                                            vistaDatosProducto.eliminar();
                                            System.out.println("Producto eliminado");
                                            break;
                                        case 5:
                                          vistaDatosProducto.listarProductos();
                                            break;
                                        case 6:
                                           salir2 = true;
                                            break;
                                        default:
                                            System.out.println("Solo numeros entre el 1 y 6");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Debes insertar un numero.");
                                    input.nextInt();
                                }
                            }
                        break;
                    case 3:
                        while (!salir3) {
                                System.out.println("QUE DESEEA HACER");
                                System.out.println("*******************************");
                                System.out.println(
                                        " 1.Registrar Factura\n "
                                        + "2.buscar Factura \n "
                                        + "3.eliminar Factura\n "
                                        + "4.Listar facturas\n "
                                        + "5.salir\n " );
                                try {
                                    System.out.println("Elija una opcion");
                                    opcion1 = input.nextInt();
                                    switch (opcion1) {
                                        case 1:
                                            
                                            break;

                                        case 2:
                                           
                                            System.out.println("Producto eliminado");
                                            break;
                                        case 3:
                                           
                                            System.out.println("Carrito creado");
                                            break;
                                        case 4:
                                             vistaFactura.listarFacturas();
                                            System.out.println("Carrito modificado");
                                            break;
                                        case 5:
                                            salir3 = true;
                                            break;
                                        default:
                                            System.out.println("Solo numeros entre el 1 y 5");
                                    }
                               } catch (InputMismatchException e) {
                                    System.out.println("Debes insertar un numero.");
                                    input.nextInt();
                                }
                            }           
                        break;
                    case 4:
                         salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre el 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero.");
                input.nextInt();
            }
        }
    }
}
