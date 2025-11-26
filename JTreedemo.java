import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class JTreedemo extends JFrame{
	JTreedemo(){
		super("Tree Demo");
		JTree jt=new JTree();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Fruits");
		DefaultMutableTreeNode apples=new DefaultMutableTreeNode("Apples");
		root.add(apples);
		apples.add(new DefaultMutableTreeNode("GreenApple"));
		apples.add(new DefaultMutableTreeNode("RedApple"));
		root.add(new DefaultMutableTreeNode("SoftDrinks"));
		add(jt);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new JTreedemo();
	}
}
