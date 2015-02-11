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