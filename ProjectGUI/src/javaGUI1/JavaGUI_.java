
package javaGUI1;

import java.awt.*;
import java.awt.event.*;

public class JavaGUI_ extends Frame implements ActionListener{
	

	//Object Declaration

	Label username,password;
	TextField txtuser, txtpass,txtdisplay;
	Button btnlogin;
	
	public JavaGUI_() {
		
		//Initializing components
		
		username=new Label("User Name");
		password=new Label("Password");
		
		txtuser=new TextField(20);
		txtpass=new TextField(20);
		txtdisplay=new TextField(20);
		
		btnlogin=new Button("Login");
		
		//Add the components in Frame
		
		setLayout(new FlowLayout());
		
		add(username);
		add(txtuser);
		
		add(password);
		add(txtpass);
		txtpass.setEchoChar('*');
		
		add(btnlogin);
		btnlogin.addActionListener(this);
		
		add(txtdisplay);
		
		setVisible(true);
		setSize(300,300);
		
		
	}

	public static void main(String[] args) {
		
		new JavaGUI_();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = "abcde";
		String pass = "12345";
		
		  // Get input values
        String enteredname = txtuser.getText();
        String enteredPass = txtpass.getText();
        
        // Check if login is successful
        if (enteredname.equals(name) && enteredPass.equals(pass)) {
            txtdisplay.setText("Login Successful!");
        } else {
            txtdisplay.setText("Login Failed. Try Again.");
        }
		
		
		
	}
}
