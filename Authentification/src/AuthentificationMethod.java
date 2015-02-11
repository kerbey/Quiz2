import java.util.Scanner;
import javax.swing.JOptionPane;
public class AuthentificationClass 
{
	public static void main(String[]args)
	{
		String userName="kerbey", password="chev";
		String newUserName=authentification(userName, password);
		System.out.println(" end ");
		//System.out.println("thankyou "+newUserName);//this line is used to return the newUserName
	}

	public static String authentification(String userName, String password)
	{
		//blocked code used for AuthentificationMethod class. JOptionpane codes belong to JOptionpane class
		Scanner input=new Scanner(System.in);
		System.out.println("enter in your username");
		//String newUserName=JOptionPane.showInputDialog("enter username");
		 String newUserName=input.next();	
		if (newUserName.contains(userName))
		{
			//String newPassword = JOptionPane.showInputDialog("enter password");
			System.out.println("enter in your password");
			String newPassword=input.next();
			if (newPassword.contains(password))
			{
				//JOptionPane.showInputDialog("welcome "+newUserName);
				System.out.println("welcome "+newUserName);
			}
			else 
			{
				//JOptionPane.showInputDialog("wrong password");
				System.out.println("wrong password");
			}
		}
		else 
		{
			//JOptionPane.showInputDialog("wrong userName");
			System.out.println("wrong userName");
		}
		return newUserName;
	}
}
//the jOptionPaneClass
import javax.swing.JOptionPane;
public class jOptionClass
{
	static String userName= "Kerbey", password="Chev";
	public static void main(String[]args)
	{
	        AuthentificationClass.authentification(userName, password);
		String newUserName=JOptionPane.showInputDialog(" end ");
		//System.out.println("thank you "+newUserName);//this line is used to return the newUserName
	}
}
