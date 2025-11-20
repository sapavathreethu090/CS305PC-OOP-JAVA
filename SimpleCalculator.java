import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends Frame implements ActionListener {
   TextField display;
   Button[] numberButtons = new Button[10];
Button add, sub, mul, div, mod, equal, clear;

String operator = " ";
double num1=0,num2=0;

public SimpleCalculator() {
 setTitle("Simple Calculator");
 setLayout(new BorderLayout());
 setSize(300,400);

display = new TextField();
display.setEditable(false);
add(display, BorderLayout.NORTH);

Panel buttonPanel = new Panel();
buttonPanel.setLayout(new GridLayout(5,4,5,5));

for(int i=0;i<10;i++){
 numberButtons[i] = new Button(String.valueOf(i));
 numberButtons[i].addActionListener(this);
}

add = new Button("+");
sub = new Button("-");
mul = new Button("*");
div = new Button("/");
mod = new Button("%");
equal = new Button("=");
clear = new Button("C");

add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
equal.addActionListener(this);
clear.addActionListener(this);

buttonPanel.add(numberButtons[7]);
buttonPanel.add(numberButtons[8]);
buttonPanel.add(numberButtons[9]);
buttonPanel.add(add);

buttonPanel.add(numberButtons[4]);
buttonPanel.add(numberButtons[5]);
buttonPanel.add(numberButtons[6]);
buttonPanel.add(sub);

buttonPanel.add(numberButtons[1]);
buttonPanel.add(numberButtons[2]);
buttonPanel.add(numberButtons[3]);
buttonPanel.add(mul);

buttonPanel.add(numberButtons[0]);
buttonPanel.add(mod);
buttonPanel.add(div);
buttonPanel.add(equal);

buttonPanel.add(clear);
buttonPanel.add(new Label(""));
buttonPanel.add(new Label(""));
buttonPanel.add(new Label(""));

add(buttonPanel, BorderLayout.CENTER);

addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent e)
  {  
    System.exit(0);
  }
 });
    setVisible(true);
}

public void actionPerformed(ActionEvent e){
 String cmd = e.getActionCommand();
 try{
  if(cmd.charAt(0) > '0' && cmd.charAt(0) <= '9')
  {
    display.setText(display.getText() + cmd);
  }
  else if(cmd.equals("C")){
   display.setText("");
   num1 = num2 = 0;
    operator="";
   }
  else if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/") || cmd.equals("%")){
     num1 = Double.parseDouble(display.getText());
      operator = cmd;
       display.setText("");
   }
  else if(cmd.equals("=")){
    num2 = Double.parseDouble(display.getText());
     double result = 0;
  switch(operator){
   case "+": result = num1 + num2;
              break;
   case "-": result = num1 - num2;
              break;
   case "*": result = num1 * num2;
              break;
   case "/": 
              if(num2 == 0){
                display.setText("Error: /0");
                 return;
                }
             result = num1 / num2;
              break;
   case "%":
           if(num2 == 0){
                display.setText("Error: /0");
                 return;
                }
         result = num1 % num2;
              break;
}
display.setText(String.valueOf(result));
}
}
catch(Exception ex){
 display.setText("Invalid");
}
}
public static void main(String[] args) {
 new SimpleCalculator();
}
}