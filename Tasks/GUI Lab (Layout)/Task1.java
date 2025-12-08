import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Calculator extends JFrame {

    public Calculator(){
        this.setLayout(new BorderLayout());

        Border tfBorder = BorderFactory.createLineBorder(Color.BLACK,1);
        Border pBorder = BorderFactory.createEmptyBorder(2,2,2,2);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBorder(pBorder);
        JTextField tf = new JTextField(20);
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
            JButton buttons = new JButton();
            buttons.setBorder(btnBorder);
            buttons.setText(buttonLabels[i]);
            buttons.setFocusable(false);
            panel2.add(buttons);
        }

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.setTitle("Calculator");
        this.setSize(250,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Calculator calFrame = new Calculator();
        calFrame.setVisible(true);
    }
}
