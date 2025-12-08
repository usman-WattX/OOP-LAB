import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class SixButtons extends JFrame{
    
    public SixButtons(){
        this.setLayout(new GridLayout(2, 3,3,3));


        String[] btnLbl = {
            "One", "Two", "Three",
            "Four", "Five", "Six"
        };

        Border btnBorder = BorderFactory.createLineBorder(Color.BLACK,1);
        for(int i = 0; i < btnLbl.length; i++){
            JButton button = new JButton();
            button.setText(btnLbl[i]);
            button.setBorder(btnBorder);
            button.setFocusable(false);
            this.add(button);
        }
        
        this.setTitle("Six Buttons");
        this.setSize(350,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }   
}




public class Task3 {
    public static void main(String[] args) {
        SixButtons sixButtons = new SixButtons();
        sixButtons.setVisible(true);
    }
}