import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JFrame;
public class Main extends JFrame {
    private JList leftlist;
    private JList rightlist;
    private JButton addbutton;
    private JButton totalbutton;
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
    private ImageIcon image4;
    private JLabel label4;
    private ImageIcon image5;
    private JLabel label5;
    private ImageIcon image6;
    private JLabel label6;
    private JLabel mylabel1;
    private JLabel mylabel2;
    private JLabel mylabel3;
    private JLabel mylabel4;
    private JLabel mylabel5;
    private JLabel mylabel6;
    private JLabel labelTitle;
    private static String[] items = {"Bracelets", "Rings", "Necklaces", "Earrings", "Charms", "Pendant"};
    private JButton total;
    public Main() {
        super("Forever Gems Store");
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("image1.jpg"));
        label1 = new JLabel(image1);
        add(label1);

        JLabel mylabel1 = new JLabel();
        mylabel1.setText("Earrings - 1,200 PHP");
        mylabel1.setFont(new Font("Didot", Font.BOLD,15));
        mylabel1.setHorizontalTextPosition(label1.CENTER);
        add(mylabel1);

        image2 = new ImageIcon(getClass().getResource("image2.jpg"));
        label2 = new JLabel(image2);
        add(label2);

        JLabel mylabel2 = new JLabel();
        mylabel2.setText("Ring - 1,350 PHP");
        mylabel2.setFont(new Font("Didot", Font.BOLD,15));
        add(mylabel2);

        image3 = new ImageIcon(getClass().getResource("image3.jpg"));
        label3 = new JLabel(image3);
        add(label3);

        JLabel mylabel3 = new JLabel();
        mylabel3.setText("Necklace - 2,500 PHP");
        mylabel3.setFont(new Font("Didot", Font.BOLD,15));
        add(mylabel3);

        image4 = new ImageIcon(getClass().getResource("image4.jpg"));
        label4 = new JLabel(image4);
        add(label4);

        JLabel mylabel4 = new JLabel();
        mylabel4.setText("Bracelet - 2,800 PHP");
        mylabel4.setFont(new Font("Didot", Font.BOLD,15));
        add(mylabel4);

        image5 = new ImageIcon(getClass().getResource("image5.jpg"));
        label5 = new JLabel(image5);
        add(label5);

        JLabel mylabel5 = new JLabel();
        mylabel5.setText("Charm - 1,550 PHP");
        mylabel5.setFont(new Font("Didot", Font.BOLD,15));
        add(mylabel5);

        image6 = new ImageIcon(getClass().getResource("image6.jpg"));
        label6 = new JLabel(image6);
        add(label6);

        JLabel mylabel6 = new JLabel();
        mylabel6.setText("Pendant - 1,800 PHP");
        mylabel6.setFont(new Font("Didot", Font.BOLD,15));
        add(mylabel6);

        super.setBackground(Color.pink);

        leftlist = new JList(items);
        leftlist.setVisibleRowCount(4);
        leftlist.setFixedCellWidth(150);
        leftlist.setFixedCellHeight(20);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        leftlist.setBackground(Color.lightGray);

        addbutton = new JButton("ADD");
        addbutton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        rightlist.setListData(leftlist.getSelectedValuesList().toArray());
                    }
                }
        );
        add(addbutton);

        rightlist = new JList();
        rightlist.setVisibleRowCount(2);
        rightlist.setFixedCellWidth(175);
        add(new JScrollPane(rightlist));

        rightlist.setBackground(Color.lightGray);

        JButton totalbutton = new JButton("COMPUTE WHOLESALE & RETAIL PRICE");
        totalbutton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        rightlist.setListData(leftlist.getSelectedValuesList().toArray());
                        if(event.getSource()==totalbutton) {
                            Computation myWindow = new Computation();
                        }
                    }
                }
        );
        add(totalbutton);
    }
    public static void main(String[] args) {
        Main list = new Main();
        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        list.setSize(1200,515);
        list.setResizable(true);
        list.getContentPane().setBackground(Color.pink);

        // center the jframe on screen
        list.setLocationRelativeTo(null);
        list.setVisible(true);

        // make the frame half the height and width
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        // set size to half of screen
        //frame.setSize(width/2, height/2);
    }
}