/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class conexionDB {

    private static final String AUTH_TOKEN = "eyJhbGciOiJFZERTQSIsInR5cCI6IkpXVCJ9.eyJhIjoicnciLCJpYXQiOjE3OTMwNzY4NzgsImlkIjoiMDFhMTc2NDktNGUwMS03YTc3LTljNTEtOWJjNjYzMDhkYWNmIiwia2lkIjoiR1NMNjdRbHd3S3RSaF90am9SdGY3MEkwLU1SOGxzUV9LekpFWWVDazE0ZyIsInJpZCI6ImY2OWNiYTcyLTk0NTAtNDFiNi05MjNlLTE3ZWNhNzA1YTdkYSJ9.q3liWSoW8ynSUs8Yc5ReK5WIZzVbtUsaN3-8V93M1IMRaqXZVKHqAlWaJmHL8opXAoFAd3Uo1kIdZ7niNqx0Bg"; 
    private static final String URL = "libsql://opticadb-griselachirinos.aws-us-east-1.turso.io";

    public static Connection obtenerConexion() {
        try {
            Class.forName(
                "com.dbeaver.jdbc.driver.libsql.LibSqlDriver"
            );

            Connection cn = DriverManager.getConnection(
                URL, null, AUTH_TOKEN
            );

            System.out.println("Conexion exitosa con Turso.");
            return cn;

        } catch (ClassNotFoundException e) {
            System.err.println("No se encontro el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error al conectar con Turso.");
            e.printStackTrace();
        }

        return null;
    }
    
}