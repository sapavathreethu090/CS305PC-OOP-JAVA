import java.awt.event.*;
import java.awt.*;
class Lab7p2 implements ActionListener{
	final int[] c={1};
	Frame f=new Frame();
	TextField  tf=new TextField(100);
	Label l1=new Label();
	Label l2=new Label();
	Button b=new Button("click");
	Lab7p2(){
		f.setLayout(new FlowLayout());
			l1.setPreferredSize(new Dimension(100,100));
			l1.setText("Event Handling");
			l2.setPreferredSize(new Dimension(100,100));
		
			b.addActionListener(this);
			f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
				f.dispose();
				}                   
			});
			b.setSize(100,100);
			f.add(l1);
			f.add(b);
			f.add(tf);
			f.add(l2);
			f.setSize(500,500);
			f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
				System.out.println("hi"+c[0]);
				l2.setText(tf.getText());
				c[0]++;
	}
	public static void main(String...args){
		Lab7p2 lab=new Lab7p2();
	}
}




