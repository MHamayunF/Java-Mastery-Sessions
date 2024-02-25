package calcuator;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JTextField txt1,txt2,txt3;
	private JLabel l1,l2,l3;
	private JButton b1,b2,b3,b4,b5,b6;
	private int num1,num2;
	int result;
	Calculator()
	{
		setLayout(null);
		setTitle("calculator");
		setBounds(20, 20, 300, 300);
		Container c=getContentPane();
		c.setLayout(new GridLayout(8,4,20,6));
		 l1 = new JLabel("First Number");
		txt1 = new JTextField(10);
		txt1.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l1);
		c.add(txt1);
		
		l2 = new JLabel("Second Number");
		txt2 = new JTextField(10);
		txt2.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l2);
		c.add(txt2);
		
		l3 = new JLabel("Result");
		txt3 = new JTextField(10);
		txt3.setEditable(false);
		txt3.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l3);
		
		c.add(txt3);
		
		b1 = new JButton("+");
		c.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				result=num1+num2;
				txt3.setText(String.valueOf(result));
			}
		});
		
		b2 = new JButton("-");
		c.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				result=num1-num2;
				txt3.setText(String.valueOf(result));
			}
		 });
		
		b3 = new JButton("*");
		c.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				result=num1*num2;
				txt3.setText(String.valueOf(result));
			}
		});
		
		b4 = new JButton("/");
		c.add(b4);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				if(num2!=0)
				{
					result=num1/num2;
					txt3.setText(String.valueOf(result));
				}
				else
				{
					txt3.setText("Error");
				}
			}
					
		});
		
		b5 = new JButton("%");
		c.add(b5);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				result=num1%num2;
				txt3.setText(String.valueOf(result));
			}
		});
		
		b6 = new JButton("clear");
		c.add(b6);
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
			}
		});
		setVisible(true);
	}

}
