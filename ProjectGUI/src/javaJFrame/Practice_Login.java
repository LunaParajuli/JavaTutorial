package javaJFrame;


import javax.swing.*;
 import java.awt.*;

public class Practice_Login extends JFrame {
	
	JLabel  jluser, jlpass;
	JTextField  jltext;
	JPasswordField  jpass;
	JButton lgnbtn,resetbtn;
	
	
	public Practice_Login(){
		
		jluser = new JLabel("Username:");
		jltext = new JTextField(20);
		
		jlpass = new JLabel("Password");
		jpass = new JPasswordField(20);
		
		lgnbtn = new JButton("Login");
		resetbtn = new JButton("Reset");
		
		
		setLayout(null);
		
		
		add(jluser);
		setBounds(30,20,100,25);
		add(jltext);
		setBounds(130,20,200,25);
		
		
		add(jlpass);
		setBounds(30,60,100,25);
		add(jpass);
		setBounds(130,60,200,25);
		
		
		setVisible(true);
		setSize(400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		
	}

}
