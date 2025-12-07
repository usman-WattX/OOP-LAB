import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class PanelDemo extends JFrame{
    public PanelDemo(){
        this.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        Border btnPnlBorder = BorderFactory.createEmptyBorder(1,1,1,1);
        buttonPanel.setBorder(btnPnlBorder);
        buttonPanel.setLayout(new GridLayout(1,5,3,3));

        String[] btnLbl = {"Button1", "Button2", "Button3", "Button4", "Button5"};
        Border btnBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        for(int i = 0; i < btnLbl.length; i++){
            JButton button = new JButton();
            button.setText(btnLbl[i]);
            button.setBorder(btnBorder);
            button.setFocusable(false);
            buttonPanel.add(button);
        }

        this.add(buttonPanel, BorderLayout.SOUTH);
        this.setTitle("Panel Demo");
        this.setSize(350,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}

public class Task4 {
    public static void main(String[] args) {
        PanelDemo pdFrame = new PanelDemo();
        pdFrame.setVisible(true); 
    }   
}
