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
public class FiveThree {
	private String color;
	private String engineSize;
	private double horsePower;
	
	public FiveThree(String color, String engineSize, double horsePower){
		this.color=color;
		this.engineSize=engineSize;
		this.horsePower=horsePower;
	}

	public FiveThree(){
		this.color="Blank";
		this.engineSize="Size";
		this.horsePower=0;
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String getEngineSize(){
		return this.engineSize;
	}

	public void setEngineSize(String engineSize){
		this.engineSize=engineSize;
	}

	public double getHorsePower(){
		return this.horsePower;
	}

	public void setHorsePower(double horsePower){
		this.horsePower=horsePower;
	}
	public String toString() {
		return "Color: " + this.color +"  Engine Size:"+this.engineSize+"  HorsePower:"+this.horsePower;
	}
}
