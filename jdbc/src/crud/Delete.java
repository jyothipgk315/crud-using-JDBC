package crud;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Delete {
	Scanner s=new Scanner (System.in);
	ConnectionManager con =new ConnectionManager();
	public void deleteData() throws ClassNotFoundException, SQLException 
	{
	System.out.println("enter the roll_no to delete");
	int rol=s.nextInt();
	PreparedStatement st=con.getConnection().prepareStatement("DELETE FROM applicationT WHERE RollNo=?");
	st.setInt(1,rol);
	st.execute();
	System.out.println("data deleted");
	
	FirstApp first=new FirstApp();
	first.choice();
	
	}

}
