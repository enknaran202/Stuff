import javax.swing.JOptionPane;
public class Assignment3 {

    public static void main(String[] args) {
    String userU,passU="WRONG",userC="EnkNaran",passC="Password",input; 		//variables
    int wrong=0;																//variables cont.
    
   	userU=JOptionPane.showInputDialog(null, "Enter Your Username");				//saves input into userU	
   		 if(!userU.equals(userC))
   		 {
   			 wrong++;
   		 }
   		 while (!userU.equals(userC)) 											//while loop when userU does not equal userC
		 {
   			 userU=JOptionPane.showInputDialog(null, "Wrong, Please Try Again");//tells user of wrong input
   			 if (!userU.equals(userC)) 
   			 {
   				 wrong++;														//increases count of wrong
   			 }								
   			 if (wrong==3)														//if statement stops loop and ends program
			 {
   				 JOptionPane.showMessageDialog(null,"Please Contact Your Administrator"); 
   				 break;															//breaks loop
   			 }	
   		 }
   		 if(wrong<3)
   		 {	
   			 passU=JOptionPane.showInputDialog(null,"Enter Your Password");		//saves input into passU
   			 if(!passU.equals(passC))
   			 {
   				 wrong++;
   			 }
   			 if (wrong==3)
   			 {
   				JOptionPane.showMessageDialog(null,"Please Contact Your Administrator");
   			 }
   		 		while (wrong<3)													//while loop when passc does not equal userC
   		 		{	
   		 			passU=JOptionPane.showInputDialog(null, "Wrong, Please Try Again");	//see above
   		 			if (!passU.equals(passC))
   		 			{
   		 				wrong++;												//increases count of wrong (added to previous wrong tries)
   		 			}
   		 			if (wrong==3)												//see above
   		 			{
   		 				JOptionPane.showMessageDialog(null,"Please Contact Your Administrator");
   		 				break;
   		 			}
   		 		}
   		 }
   		 if (userU.equals(userC)&&passU.equals(passC))
   		 if (wrong<3)															//makes sure the program will not continue with more than three mistakes
   		 {
	
   			String[] profile = { "Admin", "Student", "Staff"};				
   			input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,profile,profile[1]);
   	 	
   	 		switch (input)
   	 		{
				case "Admin":	
				case "Student":
				case "Staff":		

			System.out.println(input);
   	 		}
   		 }
    }
}




