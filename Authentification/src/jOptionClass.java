import javax.swing.JOptionPane;

public class jOptionClass
{
	static String userName= "Kerbey", password="Chev";
	public static void main(String[]args)
	{
		AuthentificationClass.authentification(userName, password);
		String newUserName=JOptionPane.showInputDialog(" end ");
		JOptionPane.showInputDialog("thank you "+newUserName);
	}
}
