package SwingFeatures;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;

public class TablePanelExample extends JInternalFrame{
	
	JTable table;
	DefaultTableModel model;
	
	JLabel lblfaculty;
	JComboBox cbfaculty;
	
	JPanel compPanel, tablePanel;
	 
	
	Statement stmt;
	ResultSet rs;
	
	DBConnection dbc;
	
	public TablePanelExample() {
		
		setLayout(new FlowLayout());
		
		model=new DefaultTableModel();
		
		dbc=new DBConnection();
		
		table=new JTable(model);
		
		lblfaculty=new JLabel("Faculty");
		cbfaculty=new JComboBox();
		
		compPanel=new JPanel();
		tablePanel=new JPanel();
		
		compPanel.add(lblfaculty);
		compPanel.add(cbfaculty);
		add(compPanel);
		
			try {
			
			stmt=dbc.conn.createStatement();
			rs=stmt.executeQuery("select DISTINCT faculty from student");
			while(rs.next()) {
				cbfaculty.addItem(rs.getString("faculty"));
			}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
		
		
		model.addColumn("Rollno");
		model.addColumn("Full Name");
		model.addColumn("Faculty");
		
		try {
			
			stmt=dbc.conn.createStatement();
			rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				
				model.addRow(new Object[] {
						
						rs.getInt(1),rs.getString(2),rs.getString(3)
				}); 
			}
			
			
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	
			JScrollPane jsp=new JScrollPane(table,v,h);
			
			tablePanel.add(jsp);
			add(tablePanel);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		setVisible(true);
		setSize(800,800);
		setClosable(true);
	
		
	}
}
