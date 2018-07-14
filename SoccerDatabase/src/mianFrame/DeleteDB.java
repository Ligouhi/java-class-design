package mianFrame;

import java.sql.SQLException;

public class DeleteDB extends ConnectDB {
	ConnectDB conn = new ConnectDB();
	   public Boolean delete(String table,String tiaojian){
		   try {
			stmt = con.createStatement();
			String sql = "delete from "+table+					    
					     " where "+tiaojian;
			System.out.println(sql);
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
