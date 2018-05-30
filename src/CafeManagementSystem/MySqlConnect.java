package CafeManagementSystem;

import java.sql.*;
import javax.swing.*    ;

public class MySqlConnect {
    Connection Conn = null;
    public static Connection ConnectDB(){
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    return Conn;
    }
    
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
}
}