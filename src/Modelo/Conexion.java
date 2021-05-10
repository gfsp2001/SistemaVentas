package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conectar;

    public Connection getConnection() {
        try {
            //String access = "jdbc:ucanaccess://D:/ventas.accdb";
           conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/venta","root","");
           return conectar;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
