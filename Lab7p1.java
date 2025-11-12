import java.awt.event.*;
import java.awt.*;
class Lab7p1{
	public static void main(String...args){
		final int[] c={1};
		Frame f=new Frame();
		TextField tf=new TextField(60);
		Label l1=new Label();
		Label l2=new Label();
		Button b=new Button("click");
			f.setLayout(new FlowLayout());
			l1.setPreferredSize(new Dimension(95,95));
			l1.setText("Event Handling");
			l2.setPreferredSize(new Dimension(100,100));
		
		
		b.setSize(150,150);
		f.add(l1);
		f.add(tf);
		f.add(b);
		
		f.add(l2);
		f.setSize(600,600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
		
			public void windowClosing(WindowEvent we){
			f.dispose();
		}
		});
		b.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent ae){
			System.out.println("sowmya"+c[0]);
			l2.setText(tf.getText());
			c[0]++;	
		}
		});
	}	
}
