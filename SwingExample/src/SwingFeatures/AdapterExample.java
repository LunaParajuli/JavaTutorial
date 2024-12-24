package SwingFeatures;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AdapterExample extends MouseAdapter{
	
	JFrame frame;
	JLabel lbltest;
	
	public AdapterExample() {
		
		frame=new JFrame("Adapter Frame");
		lbltest=new JLabel("Test");
		
		frame.setLayout(new FlowLayout());
		
		frame.add(lbltest);
		lbltest.addMouseListener(this);
		
		frame.setVisible(true);
		frame.setSize(500,500);
	}
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lbltest) {
			JOptionPane.showMessageDialog(null,"Clicked");
		}
	}
	public static void main(String args[]) {
		new AdapterExample();
	}

}
