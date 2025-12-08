import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RadioButtons extends JFrame implements ActionListener {
    private JTextField tf;
    private JRadioButton plain, bold, italic, boldItalic;

    public RadioButtons() {
        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        tf = new JTextField(20);
        panel.add(tf);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 4));

        plain = new JRadioButton("Plain");
        bold = new JRadioButton("Bold");
        italic = new JRadioButton("Italic");
        boldItalic = new JRadioButton("BoldItalic");

        plain.addActionListener(this);
        bold.addActionListener(this);
        italic.addActionListener(this);
        boldItalic.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(plain);
        bg.add(bold);
        bg.add(italic);
        bg.add(boldItalic);

        panel2.add(plain);
        panel2.add(bold);
        panel2.add(italic);
        panel2.add(boldItalic);

        this.add(panel, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.setTitle("RadioButton Font Changer");
        this.setSize(400,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Font current = tf.getFont();

        if (plain.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.PLAIN, current.getSize()));
        } 
        else if (bold.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.BOLD, current.getSize()));
        } 
        else if (italic.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.ITALIC, current.getSize()));
        } 
        else if (boldItalic.isSelected()) {
            tf.setFont(new Font(current.getName(), Font.BOLD + Font.ITALIC, current.getSize()));
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        RadioButtons rdbtnFrame = new RadioButtons(); 
        rdbtnFrame.setVisible(true);
    }
}
