import java.util.Scanner;

public class assignmenttwo {
	static double one,two,three,four,five,sum,av;
		public static void main(String[] args) {
			System.out.println("Type in five numbers using spaces as a delimiter");
			Scanner s = new Scanner(System.in).useDelimiter("\\s|\n");
			one=s.nextDouble();
			two=s.nextDouble();
			three=s.nextDouble();
			four=s.nextDouble();
			five=s.nextDouble();
			s.close(); 
			sum=one+two+three+four+five;
			av=(one+two+three+four+five)/5;
	     
			System.out.println("The sum of the numbers is "+sum+". And the average of the numbers is "+av+".");
		}

}

