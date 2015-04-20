import java.awt.*;

import javax.swing.*;
public class SixThreeLayout extends JFrame{
	TextField [] tf=new TextField [4];{
	tf[0]=new TextField("1",20);
	tf[1]=new TextField("2",20);
	tf[2]=new TextField("3",20);
	tf[3]=new TextField("4",20);}
	private JPanel Border;
	private JPanel Flow;
	private JPanel Grid;

	public void Border() {
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		add(tf[0],BorderLayout.PAGE_START);
		add(tf[1],BorderLayout.CENTER);
		add(tf[2],BorderLayout.PAGE_END);
		add(tf[3],BorderLayout.LINE_END);
	}
	public void Flow() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		setLayout(new FlowLayout());
		add(tf[0]);
		add(tf[1]);
		add(tf[2]);
		add(tf[3]);
	}
	public void Grid() {
		setLayout(new GridLayout());
		setVisible(true);
		setSize(new Dimension(500,500));
		setLayout(new GridLayout(2,2));
		add(tf[0]);
		add(tf[1]);
		add(tf[2]);
		add(tf[3]);
	}
}
