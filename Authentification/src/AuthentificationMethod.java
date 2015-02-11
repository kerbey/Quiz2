import java.util.Scanner;

import javax.swing.JOptionPane;
public class AuthentificationMethod 
{
	public static void main(String[]args)
	{
		String userName="kerbey", password="chev";
		String newUserName=authentification(userName, password);
		System.out.println("Welcome "+newUserName);
	}

	public static String authentification(String userName, String password)
	{
//blocked code used for AuthentificationMethod class. JOptionpane codes belong to JOptionpane class
//which is down below
		//Scanner input=new Scanner(System.in);
		//System.out.println("enter in your username");
		 String newUserName=JOptionPane.showInputDialog("enter username");
		// String newUserName=input.next();	
		if (userName.contains(newUserName))
		{
			String newPassword = JOptionPane.showInputDialog("enter password");
			//System.out.println("enter in your password");
			//String newPassword=input.next();
			if (password.contains(newPassword))
			{
				//return newUserName;
			}
			else 
			{
				JOptionPane.showInputDialog("wrong password");
				//System.out.println("wrong password");
			}
		}
		else
		{
			JOptionPane.showInputDialog("wrong userName");
			//System.out.println("wrong userName");
		}
		return newUserName;
	}
}
// the joptionpane class 
import javax.swing.JOptionPane;

public class jOptionClass
{
	static String userName= "Kerbey", password="Chev";
	public static void main(String[]args)
	{
		AuthentificationMethod.authentification(userName, password);
		JOptionPane.showInputDialog("welcome "+userName);
	}
}
