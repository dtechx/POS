/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dushantha.eranga
 */
public class DBConnect
{
    public static void main(String[] args)
    {
        createMySQLConnection();
    }
    public static void createConnection()
    {
        try
        {
            String host = "jdbc:derby://localhost:1527/myDB";
            String userName = "Your_Username_Here";
            String password= " Your_Password_Here ";
            Connection con = DriverManager.getConnection(host, userName, password);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void createMySQLConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
            //here sonoo is database name, root is username and password  
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
