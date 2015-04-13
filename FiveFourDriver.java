import javax.swing.*;
public class FiveFourDriver {

	public static void main(String[] args) {
		int horsePowerInt;
			FiveFour fordCar=new FiveFour();

				JTextField color = new JTextField(5);
				JTextField engineSize = new JTextField(5);
				JTextField horsePowerString = new JTextField(5);

					JPanel myPanel = new JPanel();
					myPanel.add(new JLabel("Enter your desired color"));
					myPanel.add(color);
					myPanel.add(Box.createHorizontalStrut(5));
					myPanel.add(new JLabel("Enter your desired engine size"));
					myPanel.add(engineSize);
					myPanel.add(Box.createHorizontalStrut(5));
					myPanel.add(new JLabel("Enter your desired horse power"));
					myPanel.add(horsePowerString);
				
					JOptionPane.showConfirmDialog(null, myPanel, "Your Perfect Ford Car", JOptionPane.OK_CANCEL_OPTION);
					horsePowerInt = Integer.parseInt(horsePowerString.getText());
					
					fordCar.setColor(color.getText());
					fordCar.setEngineSize(engineSize.getText());
					fordCar.setHorsePower(horsePowerInt);
					
					
					JOptionPane.showMessageDialog(null, fordCar);
		
			FiveFour cryslerCar=new FiveFour();
			JTextField color2 = new JTextField(5);
			JTextField engineSize2 = new JTextField(5);
			JTextField horsePowerString2 = new JTextField(5);

				JPanel myPanel2 = new JPanel();
				myPanel2.add(new JLabel("Enter your desired color"));
				myPanel2.add(color2);
				myPanel2.add(Box.createHorizontalStrut(5));
				myPanel2.add(new JLabel("Enter your desired engine size"));
				myPanel2.add(engineSize2);
				myPanel2.add(Box.createHorizontalStrut(5));
				myPanel2.add(new JLabel("Enter your desired horse power"));
				myPanel2.add(horsePowerString2);
				

				JOptionPane.showConfirmDialog(null, myPanel, "Your Perfect Chrysler Car", JOptionPane.OK_CANCEL_OPTION);
				horsePowerInt = Integer.parseInt(horsePowerString.getText());
				
				cryslerCar.setColor(color.getText());
				cryslerCar.setEngineSize(engineSize.getText());
				cryslerCar.setHorsePower(horsePowerInt);
	
				JOptionPane.showMessageDialog(null, cryslerCar);
				
			FiveFour nissanCar=new FiveFour();
			JTextField color3 = new JTextField(5);
			JTextField engineSize3 = new JTextField(5);
			JTextField horsePowerString3 = new JTextField(5);

				JPanel myPanel3 = new JPanel();
				myPanel3.add(new JLabel("Enter your desired color"));
				myPanel3.add(color3);
				myPanel3.add(Box.createHorizontalStrut(5));
				myPanel3.add(new JLabel("Enter your desired engine size"));
				myPanel3.add(engineSize3);
				myPanel3.add(Box.createHorizontalStrut(5));
				myPanel3.add(new JLabel("Enter your desired horse power"));
				myPanel3.add(horsePowerString3);


				JOptionPane.showConfirmDialog(null, myPanel, "Your Perfect Nissan Car", JOptionPane.OK_CANCEL_OPTION);
				horsePowerInt = Integer.parseInt(horsePowerString.getText());
				
				nissanCar.setColor(color.getText());
				nissanCar.setEngineSize(engineSize.getText());
				nissanCar.setHorsePower(horsePowerInt);
			
				JOptionPane.showMessageDialog(null, nissanCar);
				
			FiveFour sameCar=new FiveFour();
				sameCar.setColor(nissanCar.getColor());
				sameCar.setEngineSize(nissanCar.getEngineSize());
				sameCar.setHorsePower(nissanCar.getHorsePower());
				
			JOptionPane.showMessageDialog(null, "Are they the same? "+sameCar.equals(nissanCar));
			
			JOptionPane.showMessageDialog(null, "How many cars were made? " + FiveFour.getCount());
		}

	}
