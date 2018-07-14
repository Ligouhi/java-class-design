package mianFrame;


import java.sql.ResultSet;
import java.sql.SQLException;


public class Selectdb extends ConnectDB{
   ConnectDB conn = new ConnectDB();
   public ResultSet select(String table,String column,String tiaojian){
	   String re = null;
	   try {
		stmt = con.createStatement();
		String sql = "select "+column+
				     " from  "+table+
				     " where "+tiaojian+";";
		 rs = stmt.executeQuery(sql);
		return rs;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;}
	}
	   public ResultSet select(String tiaojian){
		   String re = null;
		   try {
			stmt = con.createStatement();
			String sql = tiaojian;
			 rs = stmt.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	   
//	   finally 
//       {    
//           if (rs != null)    
//               try 
//               {    
//                   rs.close();    
//               }
//               catch (Exception e)
//               {    
//               }    
//           if (stmt != null)    
//               try 
//               {    
//                   stmt.close();    
//               }
//               catch (Exception e) 
//               {    
//               }    
//           if (con != null)    
//               try
//               {    
//              	 con.close();    
//               } 
//               catch (Exception e)
//               {    
//               }    
//       }    
	    }
   }


