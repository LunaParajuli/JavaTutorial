package javaJFrame;

import javax.swing.*;

public class MainForm extends JFrame{
	
	JMenuBar mb;
	JMenu mnuro, mnure,mnuhlp;
	JMenuItem miadd, miedit, midel,miexit;
	JMenuItem miall, miindv;
	JMenuItem miabt;
	
	public MainForm() {
		
		
		mb=new JMenuBar();
		
		mnuro=new JMenu("Record Operation");
		mnure=new JMenu("Report");
		mnuhlp=new JMenu("help");
		
		miadd=new JMenuItem("Add Record");
		miedit=new JMenuItem("Modify Record");
		midel=new JMenuItem("Delete Record");
		miexit=new JMenuItem("Exit");
		
		miall=new JMenuItem("All Record");
		miindv=new JMenuItem("Individual Report");
		
		miabt=new JMenuItem("About Us");
		
		setJMenuBar(mb);
		
		mb.add(mnuro);
		mb.add(mnure);
		mb.add(mnuhlp);
		
		mnuro.add(miadd);
		mnuro.add(miedit);
		mnuro.add(midel);
		mnuro.add(miexit);
		
		mnure.add(miall);
		mnure.add(miindv);
		
		mnuhlp.add(miabt);

		setVisible(true);
		setSize(800,600);
	}
	
}
