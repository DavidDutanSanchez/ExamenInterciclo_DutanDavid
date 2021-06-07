/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author surfa
 */
public class DatosCliente {

    private int id;
    private String nombre;
    private String cedula;
    private String fialidadPago;

    public DatosCliente(int id, String nombre, String cedula, String fialidadPago) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fialidadPago = fialidadPago;
    }

    public DatosCliente() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFialidadPago() {
        return fialidadPago;
    }

    public void setFialidadPago(String fialidadPago) {
        this.fialidadPago = fialidadPago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatosCliente other = (DatosCliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatosCliente{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fialidadPago=" + fialidadPago + '}';
    }
    
    

}
