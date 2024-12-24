package SwingFeatures;

import java.awt.event.*;


import javax.swing.*;
import javax.swing.tree.*;

public class TreeExample extends JFrame {
	
	JTree tree;
	
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode parent1;
	DefaultMutableTreeNode parent2;
	DefaultMutableTreeNode child1;
	DefaultMutableTreeNode child2;
	DefaultMutableTreeNode child3;
	DefaultMutableTreeNode child4;
	
	public TreeExample() {
		
		
		
		root=new DefaultMutableTreeNode("Root");
		
		parent1=new DefaultMutableTreeNode("parent1");
		parent2=new DefaultMutableTreeNode("parent2");
		
		child1=new DefaultMutableTreeNode("Child1");
	   
		 
		
		child2=new DefaultMutableTreeNode("Child2");
		child3=new DefaultMutableTreeNode("Child3");
		child4=new DefaultMutableTreeNode("Child4");
		
		root.add(parent1);
		root.add(parent2);
		
		parent1.add(child1);
		parent1.add(child2);
		
		parent2.add(child3);
		parent2.add(child4);
		
		tree=new JTree(root);
		
		add(tree);
		
		
		
		setVisible(true);
		setSize(600,600);
		
	}
	public static void main(String args[]) {
		new TreeExample();
	}
}
		
	
		
	
	

