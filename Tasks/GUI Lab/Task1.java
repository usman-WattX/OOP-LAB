import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class CalculatorFrame extends JFrame{

    public CalculatorFrame(){
        this.setLayout(new BorderLayout());

        JPanel textBoxPanel = new JPanel();
        textBoxPanel.setLayout(new BorderLayout());
        JTextField textf = new JTextField(20);
        Border textfBorder = BorderFactory.createLineBorder(Color.BLACK,1);
        Border textPPadding = BorderFactory.createEmptyBorder(2,2,2,2);
        textBoxPanel.setBorder(textPPadding);
        textf.setBorder(textfBorder);
        textBoxPanel.add(textf, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 4,3,3));
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
            buttonsPanel.add(buttons);
        }
        
        this.add(textBoxPanel, BorderLayout.NORTH);
        this.add(buttonsPanel);
        this.setTitle("Calculator");
        this.setSize(400, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Task1 {
    public static void main(String[] args) {
        CalculatorFrame calFrame = new CalculatorFrame();
        calFrame.setVisible(true);
    }
}
