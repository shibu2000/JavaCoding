package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("***Maid Starts***");
//		1 Load & Register The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		2. Establish The Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root",
				"root");
		System.out.println(connection);

//		3. Create Statement
		Statement createStatement = connection.createStatement();

//		4. Execute the Statement
		boolean execute = createStatement.execute("INSERT INTO student values(3,'Shibu',27200.00)");
		if (execute) {
			System.out.println("Failed");
		} else {
			System.out.println("Success");
		}

//		5. Process the result
		String fetch = "SELECT * FROM student";

//		Close the connection
		connection.close();
		System.out.println("***Maid Ends***");
	}
}
