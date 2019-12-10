package crud;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Insert {
ConnectionManager con =new ConnectionManager();
	
	public void insertData() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner (System.in);
		//name
		String regex1 ="[A-Z][a-z]*";
		Pattern pattern1 = Pattern.compile(regex1);
		
		//department
		String regex3 ="[A-Z][a-z]*";
		Pattern pattern3 = Pattern.compile(regex3);
		
		//address
		String regex5 ="[A-Z][a-z]*";
		Pattern pattern5 = Pattern.compile(regex5);
		
		System.out.println("Enter the first Name");
		String name=s.next();
		Matcher nam=pattern1.matcher(name);
		if(nam.matches())
		{
		System.out.println("Enter the roll number");
		int roll=s.nextInt();
		
		System.out.println("Enter the department");
		String dept=s.next();
		Matcher dp=pattern5.matcher(dept);
		if(dp.matches())
		{
		System.out.println("Enter the year");
		int yr=s.nextInt();
		System.out.println("Enter the Address");
		String add=s.next();
		Matcher ad=pattern5.matcher(add);
		if(ad.matches())
		{
		// 3) create statement
					PreparedStatement st=con.getConnection().prepareStatement("insert into applicationT(Name,RollNo,Department,Year,Address) values(?,?,?,?,?);");
					st.setString(1,name);
					st.setInt(2, roll);
					st.setString(3, dept);
					st.setInt(4,yr);
					st.setString(5,add);
					st.executeUpdate();
					System.out.println("sucess");
		}
		else
		{
			System.out.println("invalid address");
		}
		}
		else
		{
		System.out.println("invalid department");	
		}
		}
		else
		{
			System.out.println("invalid name");
		}
					FirstApp first=new FirstApp();
					first.choice();
					
					
		
	}

}
