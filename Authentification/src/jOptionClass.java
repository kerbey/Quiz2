import javax.swing.JOptionPane;

public class jOptionClass
{
	static String userName= "Kerbey", password="Chev";
	public static void main(String[]args)
	{
		AuthentificationClass.authentification(userName, password);
		JOptionPane.showMessageDialog(null," end ");
		//JOptionPane.showMessageDialog(null,"thank you "+userName);//block this line if newUserName or newPassword
		//is wrong
	}
}
