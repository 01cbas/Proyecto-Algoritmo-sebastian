package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    protected Connection conexion;
    String dbName="proyecto_algoritmo"; //Nombre de la base de datos
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/"+dbName;
    private final String USER = "root";
    private final String PASS = "";
    public void conectarDB() throws Exception{
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            System.out.println("Se conecto a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    public void desconectarDB() throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()){
                conexion.close();
                System.out.println("Se desconecto de la base de datos");
            }
        }
    }
}