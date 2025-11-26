import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9p1 extends JFrame{
	Label l;
	
	Lab9p1(){
		super("Tapped Pane Demo");
		
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		jtp.addTab("Tab1",new Label("Tabbed pane 1"));
		jtp.addTab("Tab2",new Label("Tabbed pane 2"));
		jtp.addTab("Tab3",new Label("Tabbed pane 3"));
		setVisible(true);
		add(jtp);
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new Lab9p1();
	}
}
