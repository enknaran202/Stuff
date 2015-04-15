import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


public class SixTwo  implements ActionListener  {
	//JFrame: Windows frame
	private JFrame frame;
	//Jpanel: Separate sections inside frame
	private JPanel panel;
	//JTextField: TextField to write inside
	private JTextField textfield1,textfield2;
	//JButton: User can click
	private JButton button;
	//JLabel: text (name of frame)
	private JLabel label,outputlabel;
	public SixTwo(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.BLUE);
		

		label=new JLabel();
		label.setText("Enter Number");
		outputlabel=new JLabel("Answer");
		panel.add(label);
		textfield1=new JTextField(10);
		textfield2=new JTextField(10);
		
		button= new JButton("Calculate");
		button.addActionListener(this);
		
		frame.add(panel);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(button);
		panel.add(outputlabel);

	}
	public void actionPerformed(ActionEvent e){
		//System.out.println(textfield1.getText());
		double num1=Double.parseDouble(textfield1.getText());
		double num2=Double.parseDouble(textfield2.getText());
		double product=num1+num2;
		outputlabel.setText(String.valueOf(product));

	}
}
