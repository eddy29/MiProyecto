/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ACER
 */
public class DetallePedido {
    private int idpeddio;
    private String descripcion;
    private int cantidad;
    private Double precio;
    private Double Subtotal;

    /**
     * @return the idpeddio
     */
    public int getIdpeddio() {
        return idpeddio;
    }

    /**
     * @param idpeddio the idpeddio to set
     */
    public void setIdpeddio(int idpeddio) {
        this.idpeddio = idpeddio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the Subtotal
     */
    public Double getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }
    
    
}
