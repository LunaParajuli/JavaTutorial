package StudentForm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StdRegistration  extends JFrame implements ActionListener {
	
	JLabel std, roll, name, gender,hobby;
	JTextField  txtroll, txtname;
	
	JComboBox cbgender;
	
	JCheckBox  hobby1,hobby2,hobby3;
	
	JButton adds,update,delete,clear;
	
	JTable table;
	DefaultTableModel model;
	
	ConnectDB dbc = new ConnectDB();
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	StdRegistration(){
		
		std = new JLabel("Student Registration Form");
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
		
		adds = new JButton("Add");
		update = new JButton("Update");
		delete = new JButton("Delete");
		clear = new JButton("Clear");
		
        setLayout(null);
        
        add(std);
        std.setBounds(250,20,400,35);
        std.setFont(new Font("Arial", Font.BOLD, 24));
        std.setForeground(Color.BLUE);
		
		add(roll);
		roll.setBounds(30,70,100,25);
		add(txtroll);
		txtroll.setBounds(100,70,200,25);
		
		add(name);
		name.setBounds(30,100,100,25);
		add(txtname);
		txtname.setBounds(100,110,200,25);
		
		add(gender);
		gender.setBounds(30,150,100,25);
		
		cbgender.addItem("Male");
		cbgender.addItem("Female");
		cbgender.addItem("Other");
		add(cbgender);
		cbgender.setBounds(100,150,200,25);
		
		add(hobby);
		hobby.setBounds(30,190,80,25);
		add(hobby1);
		hobby1.setBounds(100,190,80,25);
		add(hobby2);
		hobby2.setBounds(180,190,80,25);
		add(hobby3);
		hobby3.setBounds(260,190,80,25);

		add(adds);
		adds.setBounds(60,240,100,25);
		adds.addActionListener(this);
		
		add(update);
		update.setBounds(190,240,100,25);
		update.addActionListener(this);
		
		add(delete);
	    delete.setBounds(60,280,100,25);
	    delete.addActionListener(this);
		
		add(clear);
		clear.setBounds(190,280,100,25);
		clear.addActionListener(this);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		model.addColumn("Roll no");
		model.addColumn("Fullname");
		model.addColumn("Gender");
		model.addColumn("Hobby");
		
		try {
			stmt = dbc.conn.createStatement();
			rs= stmt.executeQuery("select * from studentRecord");
			
			while(rs.next()) {
				model.addRow(new Object[]{
					rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
				});
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scrollpane = new JScrollPane(table,v,h);
		
//		add(scrollpane);
		
		// Create a bordered panel to hold the table
		JPanel tableBorder = new JPanel();
		tableBorder.setLayout(new BorderLayout());
		tableBorder.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 2), "Student Records"));
		tableBorder.add(scrollpane, BorderLayout.CENTER);

		// Set bounds for the table panel
		tableBorder.setBounds(350, 70, 400, 300); // Adjust dimensions and placement
		add(tableBorder);
		
		setVisible(true);
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Student Record Form");	
	}
	
	public static void main(String args[]) {
		new StdRegistration();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==adds) {
			
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
       				
    				pstmt = dbc.conn.prepareStatement("insert into studentRecord values(?,?,?,?)");
    				
    				 int rollNo = Integer.parseInt(txtroll.getText()); // Convert to integer
    		         pstmt.setInt(1, rollNo); 
    		         
    		         pstmt.setString(2,txtname.getText());
    		         pstmt.setString(3,cbgender.getSelectedItem().toString());
    		         pstmt.setString(4,selectedHobbies.toString().trim());
    				
    				int result=pstmt.executeUpdate();
    				if(result>0) {
    					 JOptionPane.showMessageDialog(null,"New Record Added");
    		       		 	 
    				}
    				else {
    					JOptionPane.showMessageDialog(null,"Unable to add record");
    				}
				
			}
			catch(Exception ex) {	
				ex.printStackTrace();
			}
			
		}
		
		if(e.getSource()==update) {
			
		}
		
		if(e.getSource()==delete) {
			
		}
		
		if(e.getSource()==clear) {
			
		}
		
	}
	

}
