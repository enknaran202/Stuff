/*
Create a Car Class with color, horse power, engine size,
and make as instance variable

Including getter and setter methods, toString, 
costructor with no parameter and with parameters 
(all local varibles that matching instance variables)

Create another class named CarDriver that instantiate 
three car objects from Car class and call all the 
methods from car class.
 */

public class FiveThreeDriver {

	public static void main(String[] args) {

		FiveThree fordCar=new FiveThree("Red", "Large", 100);
		System.out.println(fordCar);
		
		FiveThree cryslerCar=new FiveThree();
		System.out.println(cryslerCar);
		
		
		fordCar.setColor("Orange");
		System.out.println("\n"+"The new color is:"+fordCar.getColor());
		
		fordCar.setEngineSize("Medium");
		System.out.println("The new engine size is:"+fordCar.getEngineSize());
		
		fordCar.setHorsePower(50);
		System.out.println("The new engine size is "+fordCar.getHorsePower());
	
		
	}

}
