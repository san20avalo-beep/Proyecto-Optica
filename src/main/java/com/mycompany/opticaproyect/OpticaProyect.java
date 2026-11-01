/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.opticaproyect;
import DAO.conexionDB;
import DAO.UsuariosDAO;
import modelo.Usuario;
import java.sql.Connection;

public class OpticaProyect {
// Prueba de conexion y insert de datos a Base de Datos en Turso
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexión e inserción...");
        
        try {
            Connection con = conexionDB.obtenerConexion();
            if (con != null) {
                System.out.println("¡Conexión exitosa a Turso!");
                con.close();
            }

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombre("Carlos Optica");
            nuevoUsuario.setCorreo("carlos@opticaproyect.com");
            nuevoUsuario.setPassword("123456");
            nuevoUsuario.setRol("vendedor");

            UsuariosDAO dao = new UsuariosDAO();
            boolean insertado = dao.insertarUsuario(nuevoUsuario);

            if (insertado) {
                System.out.println("¡El usuario se insertó correctamente en la base de datos!");
            } else {
                System.out.println("No se pudo insertar el usuario.");
            }
            
        } catch (Exception e) {
            System.out.println("Error en el main: " + e.getMessage());
        }
    }
}
