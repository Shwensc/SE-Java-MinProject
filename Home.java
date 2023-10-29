package food.ordering.system;

import javax.swing.*;
import java.awt.*;
// Abstract Window Toolkit(AWT) is an API used for developing GUI(Graphic User Interfaces) or Window-Based Applications in Java. Java AWT is part of the Java Foundation Classes (JFC) that provides a way to build platform-independent graphical applications.
import java.awt.event.*;
// changing the state of the object
import java.util.HashSet;
// Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
import java.util.Set;
// It is an unordered collection of objects in which duplicate values cannot be stored.This interface contains the methods inherited from the Collection interface and adds a feature that restricts the insertion of the duplicate elements. There are two interfaces that extend the set implementation namely SortedSet and NavigableSet.

public class Home extends JFrame implements ActionListener
 /*  JFrame is a Component of Swing
        JFrame -> Creating a Window
        ActionListener - > Interface used for handling button click events
 */
{

    JButton select; // Creating a Button
    // Creating a Home Constructor 
    Home() {
        
        setLayout(null);// components will be manually positioned using absolute coordinates.
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/details.png"));
        //loading the imgae(details.png) from icon package.
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Food Ordering System");
        heading.setBounds(440, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        heading.setForeground(Color.black);
        
        image.add(heading);
        
       select = new JButton("Select Order");
       select.setBounds(490, 530, 150, 40); // Adjusted button position
       select.addActionListener(this);
       image.add(select);


        
        setSize(1120, 630);// Size of JFrame Window(GUI)
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == select) {
            setVisible(false);
            new SelectOrder();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
