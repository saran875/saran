package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class qwertyui {

	public static void main(String[] args) {
      String databaseURL = "jdbc:ucanaccess://db.accdb";
      
      try {
		Connection connection  = DriverManager.getConnection(databaseURL);
		System.out.println("Connected to access");
		
		String sql = "INSERT INTO db (contact, number , phone , mail) VALUES" + "('ravi' , '04573383' , '85758474784' , 'ravi@gmail.com')";
		
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(sql);
		if (rows > 0 )
		{
			System.out.println("inserted");
		}
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
