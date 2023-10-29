package food.ordering.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash()
    {
        
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel heading = new JLabel("Java Mini-Project");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.blue);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 150, 1100, 550);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setFocusable(false);
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.yellow);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(2300, 760);
        setLocation(200, 50);
        setVisible(true);
        
        while (true) {
    // Set the visibility of the "heading" component to false (hidden).
    heading.setVisible(false);
    
    try {
        // Pause the thread for 500 milliseconds (0.5 seconds).
        Thread.sleep(500);
    } catch (Exception e) {
        // Handle any exceptions (although this code doesn't specify any specific exception handling).
    }
    
    // Set the visibility of the "heading" component to true (visible).
    heading.setVisible(true);
    
    try {
        // Pause the thread for another 500 milliseconds (0.5 seconds).
        Thread.sleep(500);
    } catch (Exception e) {
        // Handle any exceptions (although this code doesn't specify any specific exception handling).
    }
}

    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}
