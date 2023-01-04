import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Computation extends Methods {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Wholesale & Retail Price");

    Computation() {
        JFrame frame = new JFrame("Wholesale & Retail Price");
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2, 2, 1, 1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Compute");

        // Setting the panel sizes
        panelOne.setBounds(10, 30, 220, 80);
        panelTwo.setBounds(10, 120, 200, 40);

        // Color for visualization only

        JLabel labelOne, labelTwo;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(80, 10));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(80, 10));

        labelOne = new JLabel("Enter Original Price (₱): ");
        //labelTwo = new JLabel("Enter Markup Percentage (%): ");

        labelOne.setBounds(10, 10, 90, 10);

        //labelTwo.setBounds(10, 10, 90, 10);


        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        // panelOne.add(labelTwo);
        // panelOne.add(tFieldTwo);

        button.setBounds(10, 10, 90, 10);
        button.setBounds(10, 10, 90, 10);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeRetail(tFieldOne.getText());
                int answer = computeWholesale(tFieldOne.getText());
                displayMessage(String.valueOf(result), String.valueOf(answer));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        frame.setSize(250, 220);
        frame.setResizable(false);
        frame.setLayout(null);

        // center the jframe on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
