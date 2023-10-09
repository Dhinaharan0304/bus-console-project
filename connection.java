package bus;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	private  String url="jdbc:mysql://localhost:3306/jdbc";
	private  String name="root";
	private  String pass="0304";
	
	public Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url,name,pass);
	}

}
