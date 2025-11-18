import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GridBagDemo extends JFrame implements ActionListener {
    JTextField tf;
    String operator = " ";
    int n1 = 0, n2 = 0, output = 0;
    GridBagConstraints gc = new GridBagConstraints(); // Declare and initialize GridBagConstraints

    GridBagDemo() {
        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);

        String[] ss = {"7", "8", "9", "+", "4", "5", "6", "-", "3", "2", "1", "*", "0", "/", "=", "C"}; // Added "=" for calculation
        int x = 0;
        int y = 0;

        gc.fill = GridBagConstraints.BOTH; // Corrected 'gc.fill'

        for (String s : ss) {
            JButton b = new JButton(s);
            b.setFont(new Font("Arial", Font.BOLD, 20)); // Corrected 'Font.BOLD'
            b.addActionListener(this);
            gc.ipadx = 15;
            gc.ipady = 15;
            gc.gridx = x;
            gc.gridy = y;
            gc.insets = new Insets(10, 10, 10, 10); // Corrected 'gc.Insets' to 'gc.insets'
            add(b, gc);
            x++;
            if (x == 4) {
                x = 0;
                y++;
            }
        }

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        gc.fill = GridBagConstraints.BOTH;
        gc.ipadx = 15;
        gc.ipady = 15;
        gc.gridx = 0;
        gc.gridy = y;
        gc.gridwidth = 4;
        gc.insets = new Insets(10, 10, 10, 10); // Corrected 'gc.isets' to 'gc.insets'
        add(tf, gc);

        setTitle("Simple Calculator"); // Added a title for the frame
        setSize(400, 500); // Set a size for the frame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected 'setDefaultWindowclosing'
    }

    public void actionPerformed(ActionEvent ae) { // Corrected 'actionperformed' to 'actionPerformed'
        String val = ae.getActionCommand();

        if (val.charAt(0) >= '0' && val.charAt(0) <= '9') { // Corrected 'val.chart' to 'val.charAt'
            tf.setText(tf.getText() + val);
        } else if (val.equals("C")) {
            tf.setText("");
            n1 = 0; // Reset n1 and operator on clear
            n2 = 0;
            operator = " ";
        } else if (val.equals("=")) {
            if (!tf.getText().isEmpty()) { // Check if tf has text before parsing
                n2 = Integer.parseInt(tf.getText());
            } else {
                return; // Do nothing if there's no second number
            }

            switch (operator) { // Corrected 'Switch' to 'switch'
                case "+":
                    output = n1 + n2;
                    break;
                case "-":
                    output = n1 - n2;
                    break;
                case "*":
                    output = n1 * n2;
                    break;
                case "/":
                    if (n2 == 0) {
                        tf.setText("Error: div/zero");
                        operator = " "; // Reset operator after error
                        n1 = 0;
                        n2 = 0;
                        return;
                    } else {
                        output = n1 / n2;
                    }
                    break;
                default:
                    System.out.println("error"); // This case should ideally not be reached if operator is set correctly
            }
            tf.setText(String.valueOf(output)); // Corrected 'String.value of'
            operator = " "; // Reset operator after calculation
            n1 = output; // Set n1 to the result for continuous calculations
        } else { // For operators (+, -, *, /)
            if (!tf.getText().isEmpty()) { // Check if tf has text before parsing
                n1 = Integer.parseInt(tf.getText());
            } else {
                n1 = 0; // If no number is entered, treat it as 0
            }
            operator = ae.getActionCommand();
            tf.setText(""); // Clear the text field after an operator is pressed
        }
    }

    public static void main(String... args) {
        new GridBagDemo();
    }
}