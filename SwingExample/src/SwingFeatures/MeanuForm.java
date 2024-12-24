package SwingFeatures;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MeanuForm extends JFrame implements ActionListener{
	
	JMenuBar mb;
	JMenu mnuro, mnure,mnuhelp;
	JMenuItem miadd, miedit,midel;
	JMenuItem miall, miindv;
	JMenuItem miabt;
	JToolBar jtb;
	
	JButton btn1;
	
	JDesktopPane jdp;
	
	
	public MeanuForm() {
		
		jtb=new JToolBar();
		
		mb=new JMenuBar();
		
		jdp=new JDesktopPane();
		
	    java.net.URL url = MeanuForm.class.getResource("images/fb.png");
	
		mnuro=new JMenu("Record Operation");
		mnure=new JMenu("Report");
		mnuhelp=new JMenu("Help");
		
		//btn1=new JButton("Add",new ImageIcon(url));
		btn1=new JButton("Add");
		jtb.add(btn1);
		add(jtb,BorderLayout.NORTH);
		//For Menu
		mnuro.setMnemonic(KeyEvent.VK_R);
		mnure.setMnemonic(KeyEvent.VK_K);
		mnuhelp.setMnemonic(KeyEvent.VK_H);
		
		mnuro.addActionListener(this);
		
		
		
		//miadd=new JMenuItem("Add New Record", new ImageIcon(url));
		miadd=new JMenuItem("Add New Record");
		miedit=new JMenuItem("Modify Record");
		
		//For MenuItem
		
		miedit.setMnemonic(KeyEvent.VK_E);
        miedit.setAccelerator(KeyStroke.getKeyStroke(
                            KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		midel=new JMenuItem("Delete Record");
		
		
		miindv=new JMenuItem("Individual");
		miall=new JMenuItem("All");
		
		miabt=new JMenuItem("About us");
		
		
		setJMenuBar(mb);
		
		mb.add(mnuro);
		mb.add(mnure);
		mb.add(mnuhelp);
		
		mnuro.add(miadd);
		mnuro.add(miedit);
		mnuro.add(midel);
		
		mnure.add(miindv);
		mnure.add(miall);
		
		mnuhelp.add(miabt);
		
		add(jdp);
		miedit.addActionListener(this);
		miall.addActionListener(this);
		setVisible(true);
		setSize(800,600);
	}

	public static void main(String args[]) {
		new MeanuForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==miedit) {
			jdp.add(new ModifyRecord());
			
		}
		
		if(e.getSource()==miall) {
			jdp.add(new TablePanelExample());
		}
	}
	
	
}
