import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator extends JFrame implements ActionListener{
    private JTextField tf;
    private String expression = "";
    private JButton[] buttons = new JButton[16];

    public Calculator(){
        this.setLayout(new BorderLayout());

        Border tfBorder = BorderFactory.createLineBorder(Color.BLACK,1);
        Border pBorder = BorderFactory.createEmptyBorder(2,2,2,2);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBorder(pBorder);
        tf = new JTextField(20);
        tf.setBorder(tfBorder);
        panel1.add(tf, BorderLayout.CENTER);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4,4,3,3));

        String[] buttonLabels = {
            "7","8","9","/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        
        Border btnBorder = BorderFactory.createLineBorder(Color.BLACK,1);
        for(int i = 0; i < buttonLabels.length; i++){
            buttons[i] = new JButton();
            buttons[i].setBorder(btnBorder);
            buttons[i].setText(buttonLabels[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            panel2.add(buttons[i]);
        }

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.setTitle("Calculator");
        this.setSize(250,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < buttons.length; i++) {

            if (e.getSource() == buttons[i]) {

                String text = buttons[i].getText();

                if (text.equals("=")) {
                    tf.setText("" + evaluate(expression));
                    expression = tf.getText();
                } else {
                    expression += text;
                    tf.setText(expression);
                }
            }
        }
    }
    
    private double evaluate(String exp) {

        String[] tokens = exp.split("(?<=[-+*/])|(?=[-+*/])");

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            double num = Double.parseDouble(tokens[i+1]);

            switch(op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": result /= num; break;
            }
        }

        return result;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Calculator calFrame = new Calculator();
        calFrame.setVisible(true);
    }
}
