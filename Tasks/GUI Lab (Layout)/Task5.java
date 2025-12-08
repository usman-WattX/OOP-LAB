import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class Scrollable extends JFrame{
    public Scrollable(){
        this.setLayout(new BorderLayout(10,0));

        JPanel bgPanel = new JPanel(new BorderLayout());
        Border border = BorderFactory.createEmptyBorder(5,35,20,35);
        bgPanel.setBorder(border);
        bgPanel.setBackground(Color.GRAY);

        JTextArea ta = new JTextArea("Some People can walk and talk and walk and talk and more walk and talk.....",30,30);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        Border scrlBorder = BorderFactory.createLineBorder(Color.BLACK);
        JScrollPane scrollPanel = new JScrollPane(ta);
        scrollPanel.setBorder(scrlBorder);
        scrollPanel.setBackground(Color.WHITE);
        scrollPanel.setAutoscrolls(true);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        bgPanel.add(scrollPanel, BorderLayout.CENTER);
        
        JPanel btnsPanel = new JPanel();
        btnsPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        btnsPanel.setBackground(Color.DARK_GRAY);
        String[] btnLbl = {
            "Save Memo 1", "Save Memo 2", "Clear", "Get Memo 1", "Get Memo 2"
        };
        Border btnBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        for(int i = 0; i < btnLbl.length; i++){
            JButton button = new JButton();
            button.setText(btnLbl[i]);
            button.setBorder(btnBorder);
            button.setFocusable(false);
            btnsPanel.add(button);
        }

        this.add(bgPanel, BorderLayout.CENTER);
        this.add(btnsPanel, BorderLayout.SOUTH);
        this.setTitle("Scrollable Panel");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scrollable scrolFrame = new Scrollable();
        scrolFrame.setVisible(true);
    }
}
