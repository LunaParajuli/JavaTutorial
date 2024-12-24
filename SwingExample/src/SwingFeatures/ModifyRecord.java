package SwingFeatures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ModifyRecord extends JInternalFrame implements ActionListener{

	
	JLabel lblroll, lblfname,lblfaculty;
	JComboBox cbroll,cbfaculty;
	JTextField txtfname;
	
	DBConnection dbc;
	
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	JButton btnUpdate;
	
	public ModifyRecord() {
		
		setLayout(new FlowLayout());
		
		dbc=new DBConnection();
		
		lblroll=new JLabel("Select Roll Number");
		lblfname=new JLabel("Full Name");
		lblfaculty=new JLabel("Faculty");
		btnUpdate=new JButton("Update");
		
		cbroll=new JComboBox();
		
		
		cbfaculty=new JComboBox();
		cbfaculty.addItem("Management");
		cbfaculty.addItem("Science and Tech");
		
		txtfname=new JTextField(20);
		
		//Add rollno in combo box
		
		try {
			
			stmt=dbc.conn.createStatement();
			rs=stmt.executeQuery("select rollno from student");
			while(rs.next()) {
				cbroll.addItem(rs.getInt(1));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		add(lblroll);
		add(cbroll);
		add(lblfname);
		add(txtfname);
		add(lblfaculty);
		add(cbfaculty);
		add(btnUpdate);
		
		cbroll.addActionListener(this);
		btnUpdate.addActionListener(this);
		
		
		setVisible(true);
		setSize(500,500);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==cbroll) {
			
			try {
				pstmt=dbc.conn.prepareStatement("select * from student where rollno=?");
				pstmt.setString(1, cbroll.getSelectedItem().toString());
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					txtfname.setText(rs.getString(2));
					cbfaculty.setSelectedItem(rs.getString(3));
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		if(e.getSource()==btnUpdate) {
			
			try {
			pstmt=dbc.conn.prepareStatement("update student set fullname=?, faculty=? where rollno=?");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
	
	}
}
