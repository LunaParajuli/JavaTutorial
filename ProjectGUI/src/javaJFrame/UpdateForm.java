package javaJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateForm extends JFrame {
	
	JLabel roll, name,gender,hobby;
	
	public UpdateForm (){
		
		 roll = new JLabel("Roll No: ");
		 name = new JLabel("Full Name: " );
	     gender = new JLabel("Gender: ");
	     hobby  = new JLabel("Hobby: ");
	     
		setLayout(null);
		
		add(roll);
		roll.setBounds(30,20,100,25);
		
		add(name);
		name.setBounds(30,60,100,25);
		
		add(gender);
		gender.setBounds(30,90,100,25);
		
		add(hobby);
		hobby.setBounds(30,130,100,25);
		
		
		setVisible(true);
		setSize(400,250);
		setTitle("Update Form");
	
}
	

}
