package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
   /* public Connection getConnection() {
        final String DBNAME = "calc",
                USERNAME = "root",
                PASSWORD = "root",
                TIMEZONE = "America/Mexico_City",
                USESSL = "false",
                PUBLICKEY = "true";
        String dataSource = String.format("jdbc:mysql://localhost:3306/%s?user=%s" +
                        "&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s",
                DBNAME, USERNAME, PASSWORD, TIMEZONE, USESSL, PUBLICKEY);
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(dataSource);
        } catch (SQLException e) {
            System.out.println(this.getClass().getCanonicalName() +
                    "->" + e.getMessage());
        }
        return null;
    } */
    public static Connection getConnection(){

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/calc","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        try {
            Connection conexion = MySQLConnection.getConnection();
            if (conexion != null) {
                System.out.println("Conectado");
                conexion.close();
            }
            else{
                System.out.println("No conectado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
