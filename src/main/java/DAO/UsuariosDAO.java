/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class UsuariosDAO {

    // Método para insertar un nuevo usuario
    public boolean insertarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nombre, correo, password, rol) VALUES (?, ?, ?, ?)";
        
        try (Connection con = conexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getRol());
            
            // Cambiamos a execute() por restricciones del driver JDBC de Turso/DBeaver
            ps.execute();
            return true;
            
        } catch (Exception e) {
            System.out.println("Error detallado al insertar usuario: " + e.getClass().getName() + " - " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}