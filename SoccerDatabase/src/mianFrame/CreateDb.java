package mianFrame;
import java.sql.*;
public class CreateDb {
	static String urlserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=test;user=sa;password=sa123";//sqlserver�������        
	static String urlwindows = "jdbc:sqlserver://127.0.0.1:1433;";//windows����ģʽ����    
    public static void main(String args[])
    {             
        // ����JDBC objects.    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
        try 
        {    
            // ��������    
            System.out.println("׼�����ӣ�����");    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(  
                    "jdbc:sqlserver://localhost:1433",  
                    "sa", "ruiwen521");     
            System.out.println("���ӳɹ�������");   
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


