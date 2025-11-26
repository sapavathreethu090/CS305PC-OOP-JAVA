import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;
	
	TableDemo(){
		super("TableDemo Demo");
		String heading = {"Name","course","Roll.No"};
		
		String[][] data = {
		
				{"DELL","CSE","23451"},
				{"CELL","CSM","23455"},
				{"BELL","CSD","23453"},
				{"GELL","CSC","23459"},
					
			};
		JTable jt = new JTable(data,heading);
		JScrollPane sp = new JScrollPane(jt);
		
		setVisible(true);
		add(sp);
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new TableDemo();
	}
}

























