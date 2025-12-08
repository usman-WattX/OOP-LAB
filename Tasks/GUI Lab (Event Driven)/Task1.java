import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisplayInfo extends JFrame implements ActionListener{
    private JPanel panel2;
    private JButton button;
    private JTextField tf1;
    private JLabel label2;

    public DisplayInfo(){
        this.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Enter Your Name: ");
        tf1 = new JTextField(20);
        panel1.add(label1);
        panel1.add(tf1);

        button = new JButton();
        button.setText("Display");
        button.setFocusable(false);
        button.addActionListener(this);
        panel1.add(button);

        panel2  = new JPanel();
        panel2.setPreferredSize(new Dimension(400, 200));

        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
        this.setTitle("DisplayFunction");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label2 = new JLabel(tf1.getText());
            panel2.add(label2);   

            panel2.revalidate();
            panel2.repaint();
            }
    }
}

public class Task1{
    public static void main(String[] args){
        DisplayInfo dpFrame = new DisplayInfo();
        dpFrame.setVisible(true);
    }
}