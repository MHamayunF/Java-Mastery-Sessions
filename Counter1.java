package calcuator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Counter1 extends JFrame {
	JTextField txt;
	JLabel l1 = new JLabel();
	private int count=0;
	Counter1()
	{
		
		setLayout(null);
		setBounds(40, 40, 500, 500);
		setTitle("Counter");
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		l1.setText("counter");
		c.add(l1);
		txt =new JTextField(count+" ",10);
		txt.setEditable(false);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		c.add(txt);
		
		JButton b1 = new JButton("Count up");
		c.add(b1);
		b1.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				++count;
				txt.setText(count+"");
			}
		});
		
		JButton b2 = new JButton("Count down");
		c.add(b2);
		b2.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				--count;
				txt.setText(count+"");
			}
			
		});
		
		JButton b3 = new JButton("Reset");
		c.add(b3);
		b3.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count=0;
				txt.setText(count+"");
			}			
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}
