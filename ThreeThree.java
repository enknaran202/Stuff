/*Enk Narantsatsralt
 *The Username is: EnkNaran
 *The Password is: MyPassword
 */
import java.util.Scanner;
public class ThreeThreeAssignment {

	public static void main(String[] args) {
	String Username, Password;

	System.out.println("Please enter your Username");
	Scanner key1 =new Scanner(System.in);
	Username=key1.next();
	System.out.println("Please enter your Password");
	Scanner key2=new Scanner(System.in);
	Password=key2.next();
	
	if (Username.equalsIgnoreCase("EnkNaran"))
		if (Password.equals("MyPassword"))
			System.out.println("Welcome EnkNaran");
		else 
			System.out.println ("Incorrect Username and or Password");
	else
		System.out.println("Incorrect Username and or Password");
	}

}
