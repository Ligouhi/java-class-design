package mianFrame;

import java.sql.SQLException;

public class Changes extends ConnectDB {
	 static ConnectDB conn = new ConnectDB();
	 public static void main(String args[])
	    {
		 try {
				stmt = con.createStatement();
				String chabiaoming = "select name  from sysobjects where   type='u' ";
				String sql =  "create table Tinfer ("
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
						+ "Jq int not null, "
						+"Point int not null)";
				String sql1 = "drop table Tinfer";
				    stmt.executeUpdate(sql);          
//				rs = stmt.executeQuery(chabiaoming);
//				  while(rs.next()){
//				         //Retrieve by column name
//				       
//				         
//				         String last = rs.getString("name");
//
//				         //Display values
//				         
//				      
//				         System.out.println("Upassword: " + last);
//				      }
				System.out.println("finish");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
