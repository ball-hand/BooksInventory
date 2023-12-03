/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.DriverManager;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;

/**
 *
 * @author zero
 */
public class koneksi {
    private static Connection connection;
    /**
     * @return the connection
     */
    public static Connection getConnection() {
        if (connection ==null) {
            try {
                String url = "jdbc:mysql : localhost:3306/inventory_app";
                String user = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = (Connection) DriverManager.getConnection(url,user,password);
                
                
            } catch (SQLException e) {
              
            }
        }
        
        return connection;
    }

    
    
    
    
}
