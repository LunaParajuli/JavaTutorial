package StudentForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

	JLabel lbluser,lblpass;
	JTextField txtuser;
	JPasswordField txtpass;
	JButton btnlogin,btnreset, newuser;
	
	DBConnection dbc = new DBConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Login() {
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
		btnreset.setBounds(230,100,100,25);
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
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnlogin) {
			
			//JOptionPane.showMessageDialog(null,"You clicked on login button");
			
//			if((txtuser.getText().equals("Ram"))&& (txtpass.getText().equals("Ram123"))) {
//				JOptionPane.showMessageDialog(null,"Login Success");
//				
//				new MainForm();
//			}
//			else {
//				JOptionPane.showMessageDialog(null,"Login Failed");
//			}
			
			try {
				pstmt=dbc.conn.prepareStatement("select * from studentlogin where username=? and password=?");
				pstmt.setString(1,txtuser.getText());
				pstmt.setString(2,txtpass.getText());
				
				rs= pstmt.executeQuery();
				
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"Login Success");
					new MainForm();
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
			//JOptionPane.showMessageDialog(null,"You clicked on reset button");
			
			txtuser.setText("");
			txtpass.setText("");
		}
		
		if(e.getSource()==newuser) {
			new NewUserForm();
			this.dispose();
		}
		
	}
}
