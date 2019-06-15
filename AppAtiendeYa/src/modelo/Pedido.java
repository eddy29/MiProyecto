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
public class Pedido {
    private int idpedido;
    private int idusuario;
    private int idmesa;
    private String codigopedido;
    private int estado;
    private String fechapeddio;

    /**
     * @return the idpedido
     */
    public int getIdpedido() {
        return idpedido;
    }

    /**
     * @param idpedido the idpedido to set
     */
    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the idmesa
     */
    public int getIdmesa() {
        return idmesa;
    }

    /**
     * @param idmesa the idmesa to set
     */
    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }

    /**
     * @return the codigopedido
     */
    public String getCodigopedido() {
        return codigopedido;
    }

    /**
     * @param codigopedido the codigopedido to set
     */
    public void setCodigopedido(String codigopedido) {
        this.codigopedido = codigopedido;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the fechapeddio
     */
    public String getFechapeddio() {
        return fechapeddio;
    }

    /**
     * @param fechapeddio the fechapeddio to set
     */
    public void setFechapeddio(String fechapeddio) {
        this.fechapeddio = fechapeddio;
    }
    
}
