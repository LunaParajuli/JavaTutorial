package ApplicationForm;

import javax.swing.*;
import java.awt.event.*;

public class AplicationForm  extends JFrame implements ActionListener{
	
	JLabel roll, name,gender,hobbie;
	JTextField  txtroll, txtname;
	
	JComboBox cbgender;
	
	JCheckBox  hobby1,hobby2,hobby3;
	
	JButton submt;
	
	public AplicationForm  () {
		
		roll = new JLabel("Roll No: ");
		name = new JLabel("Full Name: ");
		gender = new JLabel("Gender:");
		hobbie = new JLabel("Hobby:");
		
		txtroll = new JTextField(20);
		txtname = new JTextField(20);
		
		cbgender = new JComboBox();
		
		hobby1 = new JCheckBox("Reading");
		hobby2 = new JCheckBox("Writing");
		hobby3 = new JCheckBox("Coding");
		
		submt = new JButton("Submit");
		
		setLayout(null);
		
		add(roll);
		roll.setBounds(30,20,100,25);
		add(txtroll);
		txtroll.setBounds(100,20,200,25);
		
		add(name);
		name.setBounds(30,60,100,25);
		add(txtname);
		txtname.setBounds(100,60,200,25);
		
		add(gender);
		gender.setBounds(30,90,100,25);
		
		cbgender.addItem("Male");
		cbgender.addItem("Female");
		add(cbgender);
		cbgender.setBounds(100,90,200,25);
		
		add(hobbie);
		hobbie.setBounds(30,130,80,25);
		add(hobby1);
		hobby1.setBounds(100,130,80,25);
		add(hobby2);
		hobby2.setBounds(180,130,80,25);
		add(hobby3);
		hobby3.setBounds(260,130,80,25);

		add(submt);
		submt.setBounds(230,170,100,25);
		submt.addActionListener(this);
		
		setVisible(true);
		setSize(400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Student Applicaton Form");
	}
	public static void main(String args[]) {
		setDefaultLookAndFeelDecorated(true);
		new AplicationForm ();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==submt) {
			new NextForm(
					txtroll.getText(), 
					txtname.getText(), 
					cbgender.getSelectedItem().toString()
			             );
            
		}
	}
}
