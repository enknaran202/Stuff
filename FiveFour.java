
public class FiveFour {
		private String color;
		private String engineSize;
		private double horsePower;
		private static int count;
		
		
		public FiveFour(String color, String engineSize, double horsePower){
			this.color=color;
			this.engineSize=engineSize;
			this.horsePower=horsePower;
			this.count++;
		}

		public FiveFour(){
			this.color="Blank";
			this.engineSize="Size";
			this.horsePower=0;
			this.count++;
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
		public static int getCount(){
			return count;
		}
		public boolean equals(FiveFour othercar) {
			return (this.color==othercar.color)&&(this.engineSize==othercar.engineSize)&&(this.horsePower==othercar.horsePower);
			
		}
		
		


}
