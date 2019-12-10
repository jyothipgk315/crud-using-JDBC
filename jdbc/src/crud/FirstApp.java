package crud;

import java.sql.SQLException;
import java.util.Scanner;

public class FirstApp {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		FirstApp first=new FirstApp();
		first.choice();
		
	}

	void choice() throws ClassNotFoundException, SQLException {
		Scanner s= new Scanner (System.in);
		System.out.println("1.insert\n2.view\n3.update\n4.delete\n5.login\n6.exit");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Insert insert=new Insert();
			insert.insertData();
			break;
		case 2:
			View view=new View();
			view.veiwData();
			break;
		case 3:
			Update update=new Update();
			update.updateData();
		case 4:
			Delete delete=new Delete();
			delete.deleteData();
		case 5:
			Login login=new Login();
			login.loginData();
		case 6:
			System.exit(0);
			
			default: System.out.println("invalid selection");
		
		}
				
		
	}
	

}
