package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class StudentDetails {

	private static Connection NULL;
		public static void main(String[] args) throws ClassNotFoundException,SQLException {
			// 1) Register the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=null; //connection object
			// 2) create connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	//object=class .method (API :database:/server name:port number/DB-name,user name,passord)
			
			if(con!=NULL) //connection checking
			{
				System.out.println("Connection sucess");
			}
			else
			{
				System.out.println("re-Check the Connection");
			}
			Scanner s=new Scanner (System.in);
			System.out.println("Enter the option\n1) insert \n2)display");
			int n=s.nextInt();
			switch(n)
			{
			case 1:
			System.out.println("Enter the first Name");
			String name=s.next();
			System.out.println("Enter the roll number");
			int roll=s.nextInt();
			System.out.println("Enter the department");
			String dept=s.next();
			System.out.println("Enter the year");
			int yr=s.nextInt();
			System.out.println("Enter the Address");
			String add=s.next();
			// 3) create statement
			PreparedStatement st=con.prepareStatement("insert into student(Name,RollNo,Department,Year,Address) values(?,?,?,?,?);");
			st.setString(1,name);
			st.setInt(2, roll);
			st.setString(3, dept);
			st.setInt(4,yr);
			st.setString(5,add);
			st.executeUpdate();
			System.out.println("sucess");
			break;
			case 2:
				Statement s1=con.createStatement();
				ResultSet r=s1.executeQuery("select*from student");
				while(r.next())
				{
					System.out.println(r.getString(1)+"  "+r.getInt(2)+"  "+r.getString(3)+"   "+r.getInt(4)+"   "+r.getString(5));
				}
			}
			// 5) closing the connection
			
			con.close();
		}

	}