/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

/**
 *
 * @author joshu
 */
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTestMySQL {
     public static void main(String[] args) {
        Connection conn = ConnectionMySQL.getConnection();
        
        if (conn != null) {
            System.out.println("Connected to MySQL successfully!");
        } else {
            System.out.println("Failed to connect to MySQL.");
        }
    }
}
