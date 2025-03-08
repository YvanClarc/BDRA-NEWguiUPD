/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class dbConnector {
    
    private Connection connect;
    
    public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testapp", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
        //Function to save data
        public boolean insertData(String sql, String... params) {
    try {
        PreparedStatement pst = connect.prepareStatement(sql);
        
        // Bind parameters
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }
        
        int rowsAffected = pst.executeUpdate();
        System.out.println("Inserted Successfully! Rows affected: " + rowsAffected);
        pst.close();
        return rowsAffected > 0; // Return true if at least one row was affected
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
        return false;
    }
}
}
