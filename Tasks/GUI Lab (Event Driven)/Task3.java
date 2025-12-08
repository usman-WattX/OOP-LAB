import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DoubleRadioButtons extends JFrame implements ActionListener{
    private JTextField tf;
    private JRadioButton Bold, Italic;

    public DoubleRadioButtons(){
        this.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        tf = new JTextField(20);
        panel1.add(tf);

        JPanel panel2 = new JPanel(new FlowLayout());
        
        Bold = new JRadioButton("Bold");
        Italic = new JRadioButton("Italic");

        panel2.add(Bold);
        panel2.add(Italic);

        Bold.addActionListener(this);
        Italic.addActionListener(this);        

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2,BorderLayout.CENTER);
        this.setTitle("Double Radio Button Shit");
        this.setSize(300,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Font current = tf.getFont();

        if (Bold.isSelected() && Italic.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.BOLD + Font.ITALIC, current.getSize()));
        } else if (Bold.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.BOLD, current.getSize()));
        } else if (Italic.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.ITALIC, current.getSize()));
        } else {
            tf.setFont(new Font(current.getName(), Font.PLAIN, current.getSize()));
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        DoubleRadioButtons dbRdBtn = new DoubleRadioButtons();
        dbRdBtn.setVisible(true);
    }
}
