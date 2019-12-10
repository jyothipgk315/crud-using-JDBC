package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {
	ConnectionManager con =new ConnectionManager();
	

	public void veiwData() throws ClassNotFoundException, SQLException {
		Statement s1=con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select*from applicationT");
		while(r.next())
		{
			System.out.println(r.getString(1)+"  "+r.getInt(2)+"  "+r.getString(3)+"   "+r.getInt(4)+"   "+r.getString(5));
		}
		
		FirstApp first=new FirstApp();
		first.choice();
		
	}

}
