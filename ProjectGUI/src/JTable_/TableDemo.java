package JTable_;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.sql.*;

public class TableDemo extends JFrame {

	JTable table;
	DefaultTableModel model;
	
	Statement stmt;
	ResultSet rs;
	DbConnection dbc = new DbConnection();
	
	public TableDemo() {
		model = new DefaultTableModel();
		table = new JTable(model);
		
		model.addColumn("Roll no");
		model.addColumn("Fullname");
		model.addColumn("Gender");
		model.addColumn("Hobby");
		
		
		try {
			stmt = dbc.conn.createStatement();
			rs= stmt.executeQuery("select * from studentdetail");
			
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
		
		add(scrollpane);
		
		setVisible(true);
		setSize(600,600);
		
	}
	public static void main(String args[]) {
		new TableDemo();
	}
}

