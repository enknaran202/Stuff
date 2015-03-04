/*
Implement an authentication program to prompt the user to enter username and password.

The program will prompt the user to enter username and password until the user has entered them correct,

otherwise the program will prompt the user to enter the username and password again.

After the username and password are correct, "Welcome username!" message will display.

3. Implement an authentication program to prompt the user to enter username and password.

This program will only allow the user to enter username and password incorrectly for three times,

otherwise the program will display the message "Please contact your adminstrator to unlock your account!".

After the username and password are correct, "Welcome username!" message will display.

Requirement

1. Use Gitbash to write program using VI and Termainl command 

2. Submit both program on github in the same repository

3. Use While loop for first question.

4. Use For loop for second question.

5. Do not use Eclipse.
*/
/*
Implement an authentication program to prompt the user to enter username and password.

The program will prompt the user to enter username and password until the user has entered them correct,

otherwise the program will prompt the user to enter the username and password again.

After the username and password are correct, "Welcome username!" message will display.

3. Implement an authentication program to prompt the user to enter username and password.

This program will only allow the user to enter username and password incorrectly for three times,

otherwise the program will display the message "Please contact your adminstrator to unlock your account!".

After the username and password are correct, "Welcome username!" message will display.

Requirement

1. Use Gitbash to write program using VI and Termainl command 

2. Submit both program on github in the same repository

3. Use While loop for first question.

4. Use For loop for second question.

5. Do not use Eclipse.
*/
import java.util.Scanner;
class Forfourone {
	public static void main(String [] args){
	String Username, Password, Username1, Password1;
	Scanner k1=new Scanner(System.in);
		System.out.println("This section will use for.");
			for(int i=0; i<4; i++){
				System.out.println("Enter Your Username");
				Username=k1.next();
				System.out.println("Enter Your Password");
				Password=k1.next();
					if (Username.equalsIgnoreCase("EnkNaran") && (Password.equals("MyPassword"))){
							System.out.println("Welcome EnkNaran");
							break;
						}else{
							System.out.println ("Incorrect Username and or Password. Try Again");
					
					}
					if (i==3){ System.out.println("Please Contact your Administrator");
						
					}
				
}
	System.out.println("This section will use while");
		do{	System.out.println("Enter Your Username");
			Username1=k1.next();
			System.out.println("Enter Your Password");
			Password1=k1.next();}
		while(!Username1.equalsIgnoreCase("EnkNaran") && !Password1.equals("MyPassword"));
	System.out.println("Welcome EnkNaran");
k1.close();
}}
