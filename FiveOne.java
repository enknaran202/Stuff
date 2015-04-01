import java.util.Scanner;

/*
Write two separate java program to find the following math expressions.

h(x) = x10

f(x,y) = x + y

g(x,y,z) = sqrt(x) + absolute(y) + zy
 */
public class FiveOne {
	
	String answer;
	public static void main(String[] args) {
		System.out.println("Enter an X value for the expression h(x) = x^10");
		double x=read();
		System.out.println("Enter an Y value for the expression f(x,y) = x + y");
		double y=read();
		System.out.println("Enter an Z value for the expression g(x,y,z) = sqrt(x) + absolute(y) + z^y");
		double z=read();
		System.out.println("You Chose: x="+x+" , y="+y+" , and z="+z+".");
		System.out.println(h(x));
		System.out.println(f(x,y));
		System.out.println(g(x,y,z));
		
		String answer=read2();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("Enter an X value for the expression h(x) = x^10");
			double x2=read();
			System.out.println("Enter an Y value for the expression f(x,y) = x + y");
			double y2=read();
			System.out.println("Enter an Z value for the expression g(x,y,z) = sqrt(x) + absolute(y) + z^y");
			double z2=read();
			System.out.println("You Chose: x="+x2+" , y="+y2+" , and z="+z2+".");
			System.out.println(hnew(x2,z2));
			System.out.println(fnew(x2,y2));
			System.out.println(gnew(x2,y2,z2));
		}
	}
     public static double hnew(double x2, double z2) {
		 z2=10;
    	 return pownew(x2,z2);
	}
	
	public static double fnew(double x2, double y2){
		return x2+y2;
	}
	
	public static double gnew(double x2, double y2, double z2) {
		return sqrtnew(x2) +absnew(y2) +pownew(z2,y2);
	}

	public static double pownew(double x2,double z2) {
	for (int count=1; count <z2; count++) {
		x2*=x2;
	}
		return x2;
	}
	
	public static double sqrtnew(double x2) {
		double t;
		double root=x2/2;
		
		do {
			t=root;
			root=(t+(x2/t))/2;
		} while ((t- root) !=0);
		
		return root(x2);
	}
	
	private static double root(double x2) {

		return 0;
	}
	public static double absnew(double y2) {
		if(y2<0){
			y2=(y2/-1);
		}
		return y2;
	}
	
	public static double h(double x) {
		double z=10;
		return pow(x,z);
	}
	
	public static double f(double x, double y){
		return x+y;
	}
	
	public static double g(double x, double y, double z) {
		return sqrt(x) +abs(y) +pow(z,y);
	}

	public static double pow(double x,double z) {
		return Math.pow(x,z);
	}
	
	public static double sqrt(double x) {
		return Math.sqrt(x);
	}
	
	public static double abs(double y) {
		return Math.abs(y);
	}
	
	public static String read2() {
		Scanner keyb2=new Scanner (System.in);
		System.out.println("Do you wish to continue to the 2nd part? (y/n)");
		return keyb2.next();
	}
	public static double read() {
		Scanner keyb=new Scanner(System.in);
		System.out.println("Enter a number");
		return keyb.nextDouble();
	}
	
}
