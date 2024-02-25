package calcuator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonWithLogoExample {
    public static void main(String[] args) {
        // Create a new JFrame window
        JFrame frame = new JFrame("Button with Logo Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the logo image
        ImageIcon logoIcon = new ImageIcon("logo.png"); // Replace "logo.png" with the path to your image file
        
        // Create a button with the logo
        JButton button = new JButton("Click me", logoIcon);

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}

