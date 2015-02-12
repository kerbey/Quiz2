import java.util.Scanner;

import javax.swing.JOptionPane;
public class AuthentificationClass 
{
	public static void main(String[]args)
	{
		String userName="kerbey", password="chev";
		String newUserName=authentification(userName, password);
		System.out.println(" end ");
		//System.out.println("thankyou "+newUserName);block if wrong newUserName or wrong newPassword
	}

	public static String authentification(String userName, String password)
	{
		//blocked code used for AuthentificationMethod class. JOptionpane codes belong to JOptionpane class
		//Scanner input=new Scanner(System.in);
		//System.out.println("enter in your username");
		String newUserName=JOptionPane.showInputDialog("enter username");
		// String newUserName=input.next();	
		if (newUserName.contains(userName))
		{
			String newPassword = JOptionPane.showInputDialog("enter password");
			//System.out.println("enter in your password");
			//String newPassword=input.next();
			if (newPassword.contains(password))
			{
				JOptionPane.showMessageDialog(null, "welcome "+newUserName);
				//System.out.println("welcome "+newUserName);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"wrong password");
				//System.out.println("wrong password");
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"wrong userName");
			//System.out.println("wrong userName");
		}
		return newUserName;
	}
}
