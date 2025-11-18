import java.awt.*;
import java.awt.event.*;
public class App extends Frame implements ActionListener{
    Button spring;
    Button summer;
    Button monsoon;
    Button autumn;
    Button preWinter;
    Button winter;
    TextField tf;
    App(){
        super("Seasons");
        tf=new TextField(50);
        Panel p=new Panel(new FlowLayout());
        p.add(tf);
        add(p,BorderLayout.NORTH);
        
       
        spring=new Button("Mild/Moderate");
        summer=new Button("Hot/Low");
        monsoon=new Button("Warm/VeryHigh");
        autumn=new Button("MildWarm/Low");
        preWinter=new Button("Cool/Low");
        winter=new Button("Cold/VeryLow");
        Panel pa=new Panel();
        pa.setLayout(new GridLayout(2,3,5,5));
        pa.add(spring);
        pa.add(summer);
        pa.add(monsoon);
        pa.add(autumn);
        pa.add(preWinter);
        pa.add(winter);
        spring.addActionListener(this);
        summer.addActionListener(this);
        monsoon.addActionListener(this);
        autumn.addActionListener(this);
        preWinter.addActionListener(this);
        winter.addActionListener(this);
        add(pa,BorderLayout.CENTER);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        switch(s){
            case "Mild/Moderate":
                tf.setText("Spring");
                break;
            case "Hot/Low":
                tf.setText("Summer");
                break;
            case "Warm/VeryHigh":
                tf.setText("Monsoon");
                break;
            case "MildWarm/Low":
                tf.setText("Autumn");
                break;
            case "Cool/Low":
                tf.setText("PreWinter");
                break;
            case "Cold/VeryLow":
                tf.setText("winter");
                break;
            default:
                System.out.println("bye");
        }
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
