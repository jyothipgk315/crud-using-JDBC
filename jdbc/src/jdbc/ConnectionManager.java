package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager {
	private static Connection NULL;
	/*  Steps to connect a java Appliction to Data base
	 1) load and register the Driver
	 2) Create a Connection
	 3) Create a Statement
	 4)	ResultSet or Execute the Query
	 5) Closing the Connection
 */

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// 1) Register the driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null; //connection object
		// 2) create connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Connection","root","");
//object=class .method (API :database:/server name:port number/DB-name,user name,passord)
		
		if(con!=NULL) //connection checking
		{
			System.out.println("Connection sucess");
		}
		else
		{
			System.out.println("re-Check the Connection");
		}
	// 5) closing the connection
		con.close();
	}

}
