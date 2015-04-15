
public class SixOne {

	public static void main(String[] args) {
		double [] num= new double [3];
		//num[0]-numb[99]
		num[0]=10.0;
		num[1]=19.0;
		num[2]=21.0;

		System.out.println(SixOneOverload.getAverage(num));
		System.out.println(SixOneOverload.getSum(num));
		System.out.println(SixOneOverload.getProduct(num));
		
	}
	
}
