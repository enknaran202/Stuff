/**
December – February: Do you want to build a snow man?

March – May: Happy Spring days!

June – August: It’s a summer time.

September – November: Welcome to the foliage season!
 */
import javax.swing.JOptionPane;
public class ThreeSix {

	public enum Month {
    	January, February, March, April, May, June, July, August, September, October, November, December
	}
 
	public static void main(String[] args){
   	  	 Month[] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December };
   	 	Month select=(Month)JOptionPane.showInputDialog(null,"What Month Is It?", "Expected Weather",JOptionPane.QUESTION_MESSAGE,null, choices,choices);
   	 while (select!=null){
     	 
        	switch (select) {
        	case December:
        	case January:
        	case February:
            	JOptionPane.showMessageDialog(null, "Do You Want to Build a Snowman?");
            	break;
        	case March:
        	case April:
        	case May:
            	JOptionPane.showMessageDialog(null, "Happy Spring Days!");
            	break;
        	case June:
        	case July:
        	case August:
            	JOptionPane.showMessageDialog(null, "It's Summer Time.");
            	break;
        	case September:
        	case October:
        	case November:
            	JOptionPane.showMessageDialog(null, "Welcome to the Foliage Season!");
            	break;
        	}
       	 
        	select=(Month)JOptionPane.showInputDialog(null,"What Month Is It?", "Expected Weather",JOptionPane.QUESTION_MESSAGE,null, choices,choices);
       	 
    	}
	}
}



