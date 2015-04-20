import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
 

public class SixThreeLayout extends JFrame{
	TextField [] tf=new TextField [4]; {
	tf[0]=new TextField("1",20);
	tf[1]=new TextField("2",20);
	tf[2]=new TextField("3",20);
	tf[3]=new TextField("4",20);
	}
	private JPanel border=new JPanel();
	private JPanel flow=new JPanel();
	private JPanel grid=new JPanel();
	
	public void border(){
		border.setLayout(new BorderLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		border.add(tf[0],BorderLayout.PAGE_START);
		border.add(tf[1],BorderLayout.CENTER);
		border.add(tf[2],BorderLayout.PAGE_END);
		border.add(tf[3],BorderLayout.LINE_END);
		 
		add(border);
	}
	public void flow() {
		flow.setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		flow.add(tf[0]);
		flow.add(tf[1]);
		flow.add(tf[2]);
		flow.add(tf[3]);
		
		add(flow);

	}
	public void grid(){
		grid.setLayout(new GridLayout(2,2));
		setVisible(true);
		setSize(new Dimension(500,500));
		grid.add(tf[0]);
		grid.add(tf[1]);
		grid.add(tf[2]);
		grid.add(tf[3]);
		
		add(grid);
	}
}
