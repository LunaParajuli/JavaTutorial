package StudentForm;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class NewUserForm extends JFrame implements ActionListener{

	JLabel lbluser,lblpass;
	JTextField txtuser;
	JPasswordField txtpass;
	JButton btncreate;
	
	PreparedStatement pstmt;
	DBConnection dbc = new DBConnection();
	
	
	public NewUserForm() {
		lbluser=new JLabel("User Name");
		lblpass=new JLabel("Password");
		
		txtuser=new JTextField(20);
		txtpass=new JPasswordField(20);
		
		btncreate=new JButton("Create");
	
		
		//setLayout(new FlowLayout());
		setLayout(null);
		
		add(lbluser);
		lbluser.setBounds(30,20,100,25);
		add(txtuser);
		txtuser.setBounds(130,20,200,25);
		
		add(lblpass);
		lblpass.setBounds(30,60,100,25);
		add(txtpass);
		txtpass.setBounds(130,60,200,25);
		
		add(btncreate);
		btncreate.setBounds(130,100,100,25);
		btncreate.addActionListener(this);
		
		
		setVisible(true);
		setSize(400,250);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("New Form");
	}
	
	public static void main(String args[]) {
		setDefaultLookAndFeelDecorated(true);
		new NewUserForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btncreate) {
			
			try {
				pstmt = dbc.conn.prepareStatement("insert into studentlogin values(?,?)");
				pstmt.setString(1,txtuser.getText());
				//pstmt.setString(2,txtpass.getPassword().toString());
				pstmt.setString(2,txtpass.getText());
				
				int result=pstmt.executeUpdate();
				if(result>0) {
					 JOptionPane.showMessageDialog(null,"New User Created. Click Ok to login");
					 new Login();
					 this.dispose(); 
				}
				else {
					JOptionPane.showMessageDialog(null,"Unable to create user");
				}
			}
			catch(Exception ex) {	
				ex.printStackTrace();
			}	
	}
}
}