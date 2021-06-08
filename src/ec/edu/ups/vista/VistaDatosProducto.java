/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDatosProducto;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class VistaDatosProducto {

    ControladorDatosProducto controladorDatosProducto;
    Scanner scanner = new Scanner(System.in);

    public VistaDatosProducto(ControladorDatosProducto controladorDatosProducto) {
        this.controladorDatosProducto = controladorDatosProducto;
    }

    public VistaDatosProducto() {
    }

    public void crear() {
        System.out.println("Ingrese los datos del producto :");
        System.out.println("Ingrese el codigo del producto: ");
        int codigo = scanner.nextInt();
        System.out.println("Ingrese la descripcion del producto:");
        String descripcion = scanner.next();
        System.out.println("Ingrese el precio unitario del producto: ");
        double preciounitario = scanner.nextDouble();
        System.out.println(" Ingrese el stock del producto: ");
        int stock = scanner.nextInt();
        System.out.println("ingrese el iva del producto: ");
        double iva = scanner.nextDouble();

        controladorDatosProducto.crear(codigo, descripcion, preciounitario, stock, iva);
        System.out.println("Producto Creado");
    }

    public VistaDatosProducto buscar() {
        System.out.println("Ingrese el codigo del producto a buscar");
        int codigo = scanner.nextInt();
        if (controladorDatosProducto.buscar(codigo) != null) {
            System.out.println(controladorDatosProducto.buscar(codigo).toString());
        } else {
            System.out.println("El producto no existe");
        }
        return null;
    }

    public void modificar() {
        System.out.println("Ingrese el Codigo de producto a modificar: ");
        int codigo = scanner.nextInt();
        if (controladorDatosProducto.buscar(codigo) != null) {
            System.out.println("-----Ingrese los nuevos datos del producto----");
            System.out.println("Ingrese la nueva descripcion del producto");
            String descripcion = scanner.next();
            System.out.println("Ingrese el nuevo precio");
            double preciounitario = scanner.nextDouble();
            System.out.println("Ingrese el nuevo stokc");
            int stock = scanner.nextInt();
            System.out.println("Ingrese el nuevo iva del producto");
            double iva = scanner.nextDouble();

            controladorDatosProducto.modificar(codigo, descripcion, preciounitario, stock, iva);
            System.out.println("Producto modificado");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void eliminar() {
        System.out.println("Ingrese el codigo del producto a eliminar:");
        int codigo = scanner.nextInt();
        if (controladorDatosProducto.buscar(codigo) != null) {
            controladorDatosProducto.eliminar(codigo);
            System.out.println("Producto eliminado");
        } else {
            System.out.println("Producto no existente");
        }
    }

    public void listarProductos() {
        controladorDatosProducto.findAll().stream().forEach(object -> System.out.println(object));
    }
}
