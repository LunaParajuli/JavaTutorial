package ApplicationForm;

import javax.swing.*;

import java.awt.event.*;

public class NextForm extends JFrame {
	
	JLabel roll, name,gender,hobby;
	
	public NextForm (String rollNo, String fullName, String genderValue,String hobbyValue){
		
		 roll = new JLabel("Roll No: "+rollNo);
		 name = new JLabel("Full Name: " + fullName);
	     gender = new JLabel("Gender: " + genderValue);
	     hobby  = new JLabel("Hobby: " + hobbyValue);
		
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
		setTitle("Student's Detail");
		
		
	}
}
	
