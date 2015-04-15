
public class SixOneOverload {
	public static double getProduct(double [] num){
		double prod=num[0];
		for (int i=1; i<num.length; i++){
		prod*=num[i];
		
		}
		return prod;
	}	
	
	public static double getSum(double [] num){
		double sum=0.0;
		for (int i=0; i<num.length; i++){
		sum+=num[i];
		}
		return sum;
	}
	public static double getAverage(double [] num){
		double sum=0.0;
		for (int i=0; i<num.length; i++){
			sum+=num[i];
		}
		
		return(sum/num.length);
	}
	public static double getProduct(double num1,double num2,double num3){
		double prod=num1*num2*num3;
		return prod;
	}	
	
	public static double getSum(double num1,double num2,double num3){
		double sum=num1+num2+num3;
		return sum;
	}
	public static double getAverage(double num1,double num2,double num3){
		double av=(num1+num2+num3)/3;
		return(av);
	}
}
