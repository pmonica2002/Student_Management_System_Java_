package Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import Connection.Connection_sql;

public class CreateOperation {
	public static Connection gettable() {
		Connection con1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb", "root", "8220556887");
			return con1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return con1;
	}

	public static void createoperation() {
		Statement stmt;
		Statement stmt1;
		try {
			stmt = Connection_sql.createConnection().createStatement();
			String sql = "CREATE DATABASE IF NOT EXISTS collegedb";
			stmt.executeUpdate(sql);
			stmt1 = CreateOperation.gettable().createStatement();
			String tabl = "CREATE TABLE Students(id int,fname varchar(20),age int , grade varchar(20))";
			stmt1.executeUpdate(tabl);
			System.out.println("Database created successfully.");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
