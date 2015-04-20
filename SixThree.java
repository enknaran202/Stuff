//Create a Java GUI using JFrame, JPanel, JTextFields to use Flow Layout, Border Layout, and Grid Layout.
/*
This application must have 4 JTextFields
Use Array to create JTextFields
Use Flow Layout
Use Grid Layout with 2 rows and 2 columns
Use Border Layout
 */
public class SixThree {

	public static void main(String[] args) {
		SixThreeLayout border=new SixThreeLayout();
		SixThreeLayout flow=new SixThreeLayout();
		SixThreeLayout grid=new SixThreeLayout();
		
		border.Border();
		flow.Flow();
		grid.Grid();
		
		
	}

}
