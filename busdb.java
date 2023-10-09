package bus;

import java.sql.*;

public class busdb {
	
	public void display() throws SQLException {
		String query="select * from bus";
		connection c =new  connection();
		Connection con= c.getConnection();
		Statement st =con.createStatement();
		ResultSet rs= st.executeQuery(query);
		 while(rs.next()) {
			 System.out.println("busno:"+rs.getInt(1));
			 if(rs.getBoolean(2)==true) 
			 System.out.println("AC bus");
			 else
				 System.out.println("No AC"); 
			 System.out.println("capcity:"+rs.getInt(3));
		 }
	}
	public int getcapacity(int no) throws SQLException {
		// TODO Auto-generated method stub
		      String query ="select capacity from bus where id="+no;
			connection c =new  connection();
			Connection con= c.getConnection();
			Statement st =con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			return rs.getByte(1);
			
		
	}

}
