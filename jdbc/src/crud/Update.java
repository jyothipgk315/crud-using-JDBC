package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	ConnectionManager con =new ConnectionManager();
	public void updateData()  throws ClassNotFoundException, SQLException{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the roll no to be updated");
		int rol=s.nextInt();
		
		System.out.println("Enter the  Name");
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
		
		PreparedStatement st=con.getConnection().prepareStatement("update applicationT set Name=?,RollNo=?,Department=?,Year=?,Address=? where RollNo=?");
		st.setString(1,name);
		st.setInt(2, roll);
		st.setString(3, dept);
		st.setInt(4,yr);
		st.setString(5,add);
		st.setInt(6,rol);
		st.executeUpdate();
		System.out.println("updated");
		
		FirstApp first=new FirstApp();
		first.choice();
		
	}

}
