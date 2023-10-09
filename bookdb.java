package bus;
import java.util.Date;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bookdb {
	
	public int getcount(int no, Date date) throws SQLException
	{
		String query="select count(passenger_name)from booking where busno=? and t_date=?";
		connection c =new  connection();
		Connection con= c.getConnection();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, no);
		java.sql.Date t_date=new java.sql.Date(date.getTime());
		ps.setDate(2, t_date);
		ResultSet rs =ps.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void register(booking b) throws SQLException {
		String query="insert into booking values (?,?,?)";
		connection c =new  connection();
		Connection con= c.getConnection();
		java.sql.Date sqldate= new java.sql.Date(b.date.getTime());
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,b.passenger_name);
		ps.setInt(2,b.busno);
	    ps.setDate(3, sqldate);
	    ps.executeUpdate();		
		
	}
}

