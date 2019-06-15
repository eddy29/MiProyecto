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
public class Usuario {
   private int idUsuario;
   private String nombre;
   private String clave;
   private TipoUsuario tipousuario;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the tipousuario
     */
    public TipoUsuario getTipousuario() {
        return tipousuario;
    }

    /**
     * @param tipousuario the tipousuario to set
     */
    public void setTipousuario(TipoUsuario tipousuario) {
        this.tipousuario = tipousuario;
    }
   
    
}
