package StudentForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener{

	JLabel lbluser,lblpass;
	JTextField txtuser;
	JPasswordField txtpass;
	JButton btnlogin,btnreset, newuser;
	
	ConnectDB dbc = new ConnectDB();
	PreparedStatement pstmt;
	ResultSet rs;
	
	public LoginPage() {
		lbluser=new JLabel("User Name");
		lblpass=new JLabel("Password");
		
		txtuser=new JTextField(20);
		txtpass=new JPasswordField(20);
		
		btnlogin=new JButton("Login");
		btnreset=new JButton("Reset");
		newuser=new JButton("New User? Sign up");
		
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
		
		add(btnlogin);
		btnlogin.setBounds(130,100,100,25);
		btnlogin.addActionListener(this);
		
		add(btnreset);
		btnreset.setBounds(240,100,100,25);
		btnreset.addActionListener(this);
		
		add(newuser);
		newuser.setBounds(130,150,200,25);
		newuser.addActionListener(this);
		
		
		setVisible(true);
		setSize(400,250);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Student Login");
	}
	
	public static void main(String args[]) {
//		setDefaultLookAndFeelDecorated(true);
		new LoginPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnlogin) {
			
			try {
				pstmt=dbc.conn.prepareStatement("select * from login where username=? and password=?");
				pstmt.setString(1,txtuser.getText());
				pstmt.setString(2,txtpass.getText());
				
				rs= pstmt.executeQuery();
				
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"Login Success");
					
//					this.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Login Failed");
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
				
		}
		if(e.getSource()==btnreset) {
			txtuser.setText("");
			txtpass.setText("");
		}
		
		if(e.getSource()==newuser) {
			new NewUser();
			this.dispose();
		}
		
	}
}
