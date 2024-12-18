package StudentForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;

public class AddRecord extends JFrame implements ActionListener{
	
	JLabel roll, name,gender,hobby;
	JTextField  txtroll, txtname;
	
	JComboBox cbgender;
	
	JCheckBox  hobby1,hobby2,hobby3;
	
	JButton submt;
	
	DBConnection dbc = new DBConnection();
	PreparedStatement pstmt;
	
	public AddRecord() {
		
		roll = new JLabel("Roll No: ");
		name = new JLabel("Full Name: ");
		gender = new JLabel("Gender:");
		hobby = new JLabel("Hobby:");
		
		txtroll = new JTextField(20);
		txtname = new JTextField(20);
		
		cbgender = new JComboBox();
		
		hobby1 = new JCheckBox("Reading");
		hobby2 = new JCheckBox("Writing");
		hobby3 = new JCheckBox("Coding");
		
		submt = new JButton("Register");
		
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
		
		add(hobby);
		hobby.setBounds(30,130,80,25);
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
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Student Record Form");
	}
	
	public static void main(String args[]) {
		setDefaultLookAndFeelDecorated(true);
		new AddRecord();
	}
	   
       	@Override
       	public void actionPerformed(ActionEvent e) {
       		if(e.getSource()==submt) {
       			
       			try {
       				
       			StringBuilder selectedHobbies = new StringBuilder("");
 	            if (hobby1.isSelected()) {
 	                selectedHobbies.append("Reading ");
 	            }
 	            if (hobby2.isSelected()) {
 	                selectedHobbies.append("Writing ");
 	            }
 	            if (hobby3.isSelected()) {
 	                selectedHobbies.append("Coding ");
 	            }
       				
    				pstmt = dbc.conn.prepareStatement("insert into studentdetail values(?,?,?,?)");
    				
    				 int rollNo = Integer.parseInt(txtroll.getText()); // Convert to integer
    		         pstmt.setInt(1, rollNo); 
    		         
    		         pstmt.setString(2,txtname.getText());
    		         pstmt.setString(3,cbgender.getSelectedItem().toString());
    		         pstmt.setString(4,selectedHobbies.toString().trim());
    				
    				int result=pstmt.executeUpdate();
    				if(result>0) {
    					 JOptionPane.showMessageDialog(null,"New Record Added");
    					 new UpdateForm(
    							 Integer.parseInt(txtroll.getText()), 
    								txtname.getText(), 
    								cbgender.getSelectedItem().toString(),
    								selectedHobbies.toString().trim()
    								
    							 );
    		       		 this.dispose();	 
    				}
    				else {
    					JOptionPane.showMessageDialog(null,"Unable to add record");
    				}
       			}
       			catch(Exception ex) {	
    				ex.printStackTrace();
    			}
       	}
        
       	}
}
