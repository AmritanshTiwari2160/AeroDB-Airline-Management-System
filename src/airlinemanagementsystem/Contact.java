package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contact extends JFrame {

    public Contact(){
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);

        JLabel heading = new JLabel("CONTACT US");
        heading.setBounds(235, 50, 1000, 45);
        heading.setFont(new Font("SansSerif", Font.BOLD, 55));
        heading.setForeground(new Color(0, 0, 255));
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/whatsapp.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(235, 130, 80, 80);
        add(image);

        JLabel whatsnum= new JLabel("Hello");
        whatsnum.setBounds(260, 120, 50, 45);
        whatsnum.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(whatsnum);

        setSize(900, 600);
        setLocation(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Contact();
    }
}
