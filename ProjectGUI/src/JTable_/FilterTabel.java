package JTable_;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.*;

public class FilterTabel extends JFrame {

	JTable table;
	DefaultTableModel model;
	TableRowSorter<DefaultTableModel> sorter;
	
	Statement stmt;
	ResultSet rs;
	DbConnection dbc = new DbConnection();
	
	public FilterTabel() {
		
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
		
		
		 // Add a TableRowSorter for filtering
        sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        // Add a filter for Gender = "Female"
        JPanel filterPanel = new JPanel(new FlowLayout());
        JButton filterButton = new JButton("Filter: Male");
        filterButton.addActionListener(e -> {
            sorter.setRowFilter(RowFilter.regexFilter("^Male$", 2)); // Column index 2 is "Gender"
        });

        JButton resetButton = new JButton("Reset Filter");
        resetButton.addActionListener(e -> {
            sorter.setRowFilter(null); // Reset filter
        });

        filterPanel.add(filterButton);
        filterPanel.add(resetButton);
		
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scrollpane = new JScrollPane(table,v,h);
//		
		add(filterPanel, BorderLayout.NORTH);
        add(scrollpane, BorderLayout.CENTER);

		add(scrollpane);
		
		
		
		setVisible(true);
		setSize(600,600);
		
	}
	public static void main(String args[]) {
		new FilterTabel();
	}
}

