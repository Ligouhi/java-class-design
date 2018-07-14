package mianFrame;

import java.sql.SQLException;

public class InsertDB extends ConnectDB {
	 ConnectDB conn = new ConnectDB();
	   public Boolean insert(String table,String tiaojian){
		   try {
			stmt = con.createStatement();
			String sql = "insert into "+table+" "+
					     "values "+tiaojian;
			stmt.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
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

