package mianFrame;
import java.sql.*;
public class CreateDb {
	static String urlserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=test;user=sa;password=sa123";//sqlserver身份连接        
	static String urlwindows = "jdbc:sqlserver://127.0.0.1:1433;";//windows集成模式连接    
    public static void main(String args[])
    {             
        // 声明JDBC objects.    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
        try 
        {    
            // 建立连接    
            System.out.println("准备连接！！！");    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(  
                    "jdbc:sqlserver://localhost:1433",  
                    "sa", "ruiwen521");     
            System.out.println("连接成功！！！");   
            System.out.println("Creating database...");
            stmt = con.createStatement();
            String sql = "CREATE DATABASE db_soccer";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        
        }    
        catch (Exception e) 
        {    
            e.printStackTrace();    
        }     

        finally 
        {    
            if (rs != null)    
                try 
                {    
                    rs.close();    
                }
                catch (Exception e)
                {    
                }    
            if (stmt != null)    
                try 
                {    
                    stmt.close();    
                }
                catch (Exception e) 
                {    
                }    
            if (con != null)    
                try
                {    
                    con.close();    
                } 
                catch (Exception e)
                {    
                }    
        }    
    }    
} 


