import java.util.Scanner;

public class assignmenttwo {
	static double one,two,three,four,five,sum,av;
		public static void main(String[] args) {
			System.out.println("1%2 equals "+1%2);
			System.out.println("1.0/2 equals "+1.0/2);
			System.out.println("5+7/2 equals "+5+7/2);
			System.out.println("\"Beat\" + '' + \"Army\" results in an error");
			System.out.print("6+13/5-35%3 equals ");
			System.out.println(+ 6 + 13 / 5 - 35 % 3);
			System.out.println("3.5*(5/4) equals "+3.5*(5/4));
			System.out.println("(3.5*5)/4 equals "+(3.5*5)/4);
			
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
