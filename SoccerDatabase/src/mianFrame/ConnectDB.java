package mianFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {
	 static final String urlserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=db_soccer;user=sa;password=ruiwen521";//sqlserver�������        
     static final String urlwindows = "jdbc:sqlserver://127.0.0.1:1433;databaseName=db_soccer";//windows����ģʽ����                    
     static Connection con = null;    
     static Statement stmt = null;    
     static ResultSet rs = null; 
     ConnectDB(){
    	    
         try 
         {    
             // ��������    
        	 System.out.println("start connect....");
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
             con = DriverManager.getConnection(  
            		 urlserver);     
    
             System.out.println("connect successfully...");
         
         }    
         catch (Exception e) 
         {    
             e.printStackTrace();    
         }     
     }    
     }

