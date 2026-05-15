package vallegrande.edu.pe.platos.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL =
            "jdbc:mysql://127.0.0.1:3308/restaurante_db?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";

    private static final String PASSWORD = "123456";

    public static Connection conectar() {

        try {

            Connection con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Conexión exitosa a MySQL");

            return con;

        } catch (Exception e) {

            System.out.println("Error al conectar con MySQL:");
            e.printStackTrace();

            return null;
        }
    }
}