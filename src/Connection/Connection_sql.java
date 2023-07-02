package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_sql {
	public static Connection createConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","8220556887");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			
		}return con;
	}

}
