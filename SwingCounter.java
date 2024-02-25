package calcuator;

import java.awt.*;      
import java.awt.event.*;
import javax.swing.*;   

public class SwingCounter extends JFrame {
   private JTextField tfCount;
   private int count = 0;
 
   public SwingCounter() {

      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
 
      cp.add(new JLabel("Counter"));
      tfCount = new JTextField(count + "", 10);
      tfCount.setEditable(false);
      tfCount.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfCount);
 
      JButton btnCount = new JButton("Count up");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
       // @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
      btnCount = new JButton("Count down");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
      //  @Override
        public void actionPerformed(ActionEvent evt) {
          --count; // Decrement the count by 1
          tfCount.setText(count + "");
        }
      });
      btnCount = new JButton("Reset");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent evt) {
          count = 0; // Reset the count to 0
          tfCount.setText(count + "");
        }
      });
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 100);
      setTitle("Swing Counter");
      setVisible(true);
   }
 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
        // @Override
         public void run() {
            new SwingCounter();  
         }
      });
   }
}