/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Conexion;
import modelo.Usuario;
/**
 *
 * @author ACER
 */
public class UsuarioControlador {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion c = new Conexion();
    Connection cn ;
    
    public Usuario login(String nom,String clave){
        Usuario u = new Usuario();
        String sql = "select * from usuario where nombre = ? and clave = ?";
        try {
            cn = c.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, clave);
            rs=ps.executeQuery();
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        return u;
        
    }
   
    
    
}
