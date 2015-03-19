/*
Switch Case Class Exercise
Write an application to prompt the user to enter his/her role from the following choices.

1. Administrator
2. Faculty
3. Staff
4. Student
5. Guest

After the user entered his/her role, the program will display:

Welcome <USER ROLE>! (The word USER ROLE will be replaced with the user input.)

Requirements

Using Switch case
Submit on Github.com
Use Gitbash
Use vi
 */
package assignmenttwo;
import java.util.Scanner;
public class ThreeFive {
	static String role;
	public static void main(String[] args) {
		System.out.println("Enter your role");
		Scanner k1=new Scanner(System.in);
		role=k1.next();

		switch(role) {
		case "Administrator":
			System.out.println("Welcome "+role);
		switch(role) {
		case "Faculty":
			System.out.println("Welcome "+role);
		switch(role) {
		case "Staff":
			System.out.println("Welcome "+role);
		switch(role) {
		case "Student":
			System.out.println("Welcome "+role);
		switch(role) {
		case "Guest":
			System.out.println("Welcome "+role);
		}}}}}
	}

}
