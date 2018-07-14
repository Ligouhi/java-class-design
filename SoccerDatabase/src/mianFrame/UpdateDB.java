package mianFrame;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDB extends ConnectDB {
	 ConnectDB conn = new ConnectDB();
	   public Boolean update(String table,String set,String tiaojian){
		   try {
			stmt = con.createStatement();
			String sql = "update "+table+
					     
					     " set "+ set+
					     " where "+tiaojian;
			System.out.println(sql);
			int num = stmt.executeUpdate(sql);
			if(num==0)
				return false;
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

	

