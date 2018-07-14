package mianFrame;

import java.sql.*;

public class CreateTable {
	 static final String urlserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=db_soccer;user=sa;password=ruiwen521";//sqlserver身份连接        
     static final String urlwindows = "jdbc:sqlserver://127.0.0.1:1433;";//windows集成模式连接                    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	                    urlserver);     
	            System.out.println("连接成功！！！");   
	            System.out.println("Creating table...");
	            stmt = con.createStatement();
	            String sql = "CREATE TABLE Users(UIDs char(20) not null primary key,Upassword char(20) not null)";
	            stmt.executeUpdate(sql);
	             sql = "create table Team"+
                        "(TNO char(20) not null primary key, "+
          		     "Tname char(20) not null,"+
                        "Tgroup char(20) not null,)";
                stmt.executeUpdate(sql);
              sql = "create table Permeter"+
                        "(PNO char(20) not null primary key, "+
          		     "Pname char(20) not null,"+
                        "Pteam char(20) not null,"+
          		     "Pwz char(20) not null,"+
                        "Pdf int not null,"+
          		     "Pgoal int not null)";
                stmt.executeUpdate(sql);
               sql =  "create table Tinfer ("
						+ "TNO char (20) primary key,"
						+"Tname char(20) not null,"+
                        "Tcs int not null,"+
                        "Goals int not null,"+
             		     "Loss_goal int not null,"
						+ "Zg int not null,"
             		    +"Pj int not null,"
						+"Qd int not null,"
             		    +"Fg int not null,"
						+ "Yw int not null,"
						+ "Cq int not null,"
						+ "Kqrate int not null,"
						+ "Yellow int not null,"
						+ "Red int not null,"
						+ "Jq int not null，"
						+"Point int not null)";
                stmt.executeUpdate(sql);
                sql = "create table News"+
                        "(NNO char(20) not null primary key, "+
          		     "CNO char(20) not null,"+
                        "Nlink char(200) not null,"+
          		     "Ndate char(20)) ";
                stmt.executeUpdate(sql);
               sql = "create table Competition"+
                        "(CNO char(20) not null primary key, "+
          		     "Cdate varchar(255) not null,"+
          		   "Cclock char(20) not null,"+
                         
          		     "T1NO char(20) not null foreign key references Team(TNO),"+
                        "T1name char(20) not null,"+
                        "T2NO char(20) not null foreign key references Team(TNO),"+
                        "T2name char(20) not null,"+
                        "Cresult char(20) )";
                stmt.executeUpdate(sql);
	            
	            System.out.println("table created successfully...");
	        
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


