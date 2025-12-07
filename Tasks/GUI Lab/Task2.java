import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class ThreeColoredPanels extends JFrame{
    public ThreeColoredPanels(){
        this.setLayout(new BorderLayout(10,2));

        JPanel topPanel = new JPanel(new GridLayout(1,3));
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GRAY);

        topPanel.add(panel1);
        topPanel.add(panel2);
        topPanel.add(panel3);

        JPanel textPanel = new JPanel(new GridLayout(1,3,5,5));
        Border lblBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        JLabel lbl1 = new JLabel();
        lbl1.setText("BLUE");
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.BLUE);
        lbl1.setBorder(lblBorder);
        JLabel lbl2 = new JLabel();
        lbl2.setText("WHITE");
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setOpaque(true);
        lbl2.setBackground(Color.WHITE);
        lbl2.setBorder(lblBorder);
        JLabel lbl3 = new JLabel();
        lbl3.setText("GRAY");
        lbl3.setHorizontalAlignment(JLabel.CENTER);
        lbl3.setOpaque(true);
        lbl3.setBackground(Color.GRAY);
        lbl3.setBorder(lblBorder);
        textPanel.add(lbl1);
        textPanel.add(lbl2);
        textPanel.add(lbl3);

        this.add(topPanel, BorderLayout.CENTER);
        this.add(textPanel, BorderLayout.SOUTH);
        this.setTitle("ThreeColoredPanels");
        this.setSize(400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}


public class Task2 {
    public static void main(String[] args) {

        ThreeColoredPanels triColorFrame = new ThreeColoredPanels();
        triColorFrame.setVisible(true);
    }
}
