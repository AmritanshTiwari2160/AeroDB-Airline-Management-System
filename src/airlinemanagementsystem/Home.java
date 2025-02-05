package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);

        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500, 50, 1000, 45);
        heading.setFont(new Font("SansSerif", Font.BOLD, 55));
        image.add(heading);

        JLabel tagline = new JLabel("Where Every Journey Feels Like Home");
        tagline.setBounds(450,100,1000,55);
        tagline.setFont(new Font("SansSerif", Font.BOLD,45));
        tagline.setForeground(new Color(0, 0, 0, 0)); // Initially transparent
        image.add(tagline);

        Timer timer = new Timer(50, new ActionListener() {
            private int alpha = 0; // Initial alpha value

            @Override
            public void actionPerformed(ActionEvent e) {
                if (alpha < 255) {
                    alpha += 5;
                    tagline.setForeground(new Color(0, 0, 0, alpha));
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        timer.setInitialDelay(500);
        timer.start();

        JMenuBar menubar = new JMenuBar();
        menubar.setBackground(new Color(255, 102, 102));
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("DETAILS");
        details.setFont(new Font("Dialog", Font.BOLD,20));
        menubar.add(details);

        details.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                details.setForeground(new Color(0, 0, 255)); // Change color to Gold when hovered
                details.setFont(new Font("Dialog", Font.BOLD, 20)); // Slightly larger font
                details.setText("<html><u>" + details.getText() + "</u></html>"); // Add underline on hover

            }

            @Override
            public void mouseExited(MouseEvent e) {
                details.setForeground(new Color(0, 0, 0)); // Revert to White when not hovered
                details.setFont(new Font("Dialog", Font.BOLD, 20)); // Revert to original size
                details.setText(details.getText().replaceAll("<html><u>", "").replaceAll("</u></html>", ""));
            }
        });
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        Font newFont = new Font(flightDetails.getFont().getFamily(), flightDetails.getFont().getStyle(), 15);
        flightDetails.setFont(newFont);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        newFont = new Font(customerDetails.getFont().getFamily(), customerDetails.getFont().getStyle(), 15);
        customerDetails.setFont(newFont);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        newFont = new Font(bookFlight.getFont().getFamily(), bookFlight.getFont().getStyle(), 15);
        bookFlight.setFont(newFont);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        newFont = new Font(journeyDetails.getFont().getFamily(), journeyDetails.getFont().getStyle(), 15);
        journeyDetails.setFont(newFont);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        newFont = new Font(ticketCancellation.getFont().getFamily(), ticketCancellation.getFont().getStyle(), 15);
        ticketCancellation.setFont(newFont);
        details.add(ticketCancellation);

        JMenu Tickets = new JMenu("TICKETS");
        Tickets.setFont(new Font("Dialog", Font.BOLD, 20));
        menubar.add(Tickets);

        Tickets.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Tickets.setForeground(new Color(0, 0, 255)); // Change color to Blue when hovered
                Tickets.setFont(new Font("Dialog", Font.BOLD, 20)); // Slightly larger font
                Tickets.setText("<html><u>" + Tickets.getText() + "</u></html>"); // Add underline on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Tickets.setForeground(new Color(0, 0, 0)); // Revert to Black when not hovered
                Tickets.setFont(new Font("Dialog", Font.BOLD, 20)); // Revert to original size
                Tickets.setText(Tickets.getText().replaceAll("<html><u>", "").replaceAll("</u></html>", ""));
            }
        });
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        newFont = new Font(boardingPass.getFont().getFamily(), boardingPass.getFont().getStyle(), 15);
        boardingPass.setFont(newFont);
        Tickets.add(boardingPass);

        JMenu Support = new JMenu("SUPPORT");
        Support.setFont(new Font("Dialog", Font.BOLD,20));
        menubar.add(Support);

        Support.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Support.setForeground(new Color(0, 0, 255)); // Change color to Gold when hovered
                Support.setFont(new Font("Dialog", Font.BOLD, 20)); // Slightly larger font
                Support.setText("<html><u>" + Support.getText() + "</u></html>"); // Add underline on hover

            }

            @Override
            public void mouseExited(MouseEvent e) {
                Support.setForeground(new Color(0, 0, 0)); // Revert to White when not hovered
                Support.setFont(new Font("Dialog", Font.BOLD, 20)); // Revert to original size
                Support.setText(Support.getText().replaceAll("<html><u>", "").replaceAll("</u></html>", ""));
            }
        });

        JMenuItem ContactUs = new JMenuItem("Contact Us");
        ContactUs.addActionListener(this);
        newFont = new Font(ContactUs.getFont().getFamily(), ContactUs.getFont().getStyle(), 15);
        ContactUs.setFont(newFont);
        Support.add(ContactUs);

        JMenuItem FAQ = new JMenuItem("FAQs");
        newFont = new Font(FAQ.getFont().getFamily(), FAQ.getFont().getStyle(), 15);
        FAQ.setFont(newFont);
        Support.add(FAQ);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Contact Us")) {
            new Contact();
        }
    }


    
    public static void main(String[] args) {
        new Home();
    }
}
