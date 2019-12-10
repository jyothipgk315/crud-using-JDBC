package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	ConnectionManager con =new ConnectionManager();
	
	public void loginData()throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner (System.in); 
		
		System.out.println("Enter the name :");
		String name=s.next();
		System.out.println("enter the roll no");
		int rollno=s.nextInt();
		Statement s1=con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select * from applicationT");
		
		int f=0;
		while(r.next())
		{
			 
			String n=r.getString(1);
			int h=r.getInt(2);
			
			if(n.equals(name)&& h==(rollno))
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
		if(f==1)
		{
			System.out.println("success login");
		}
		else
		{
			System.out.println("login faild");
		}
		
		
		FirstApp first=new FirstApp();
		first.choice();
		
		
	}

}
