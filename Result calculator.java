package calcuator;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Result extends JFrame {
	JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1;
	private int num1,num2,num3,num4,num5,Obtain,percent,average;
	Result()
	{
		setLayout(null);
		setBounds(40, 40, 500, 400);
		setTitle("Result");
		Container c =getContentPane();
		c.setLayout(new GridLayout(14,4,20,6));
		l1 = new JLabel("ICT");
		txt1 = new JTextField(10);
		txt1.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l1);
		c.add(txt1);
		
		l2 = new JLabel("RWS");
		txt2 = new JTextField(10);
		txt2.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l2);
		c.add(txt2);
		
		l3 = new JLabel("PF");
		txt3 = new JTextField(10);
		txt3.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l3);
		c.add(txt3);
		
		l4 = new JLabel("Physics");
		txt4 = new JTextField(10);
		txt4.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l4);
		c.add(txt4);
		
		l5 = new JLabel("Pakistan Studies");
		txt5 = new JTextField(10);
		txt5.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l5);
		c.add(txt5);
		
		l6 = new JLabel("Total Marks");
		txt7 = new JTextField(10);
		txt7.setText("250");
		txt7.setHorizontalAlignment(JTextField.RIGHT);
		c.add(l6);
		c.add(txt7);
		
		b1 = new JButton("Click to Find Result");
	
		l8 =  new JLabel("Obtain Marks");
		c.add(l8);
		txt6= new JTextField(10);
		txt6.setHorizontalAlignment(JTextField.RIGHT);
		txt6.setEditable(false);
		c.add(txt6);
		
		txt8 = new JTextField(10);
		txt8.setHorizontalAlignment(JTextField.RIGHT);
		txt8.setEditable(false);
		l7 = new JLabel("Percentage");
		c.add(l7);
		c.add(txt8);
		l9 = new JLabel("Average");
		c.add(l9);
		txt9 = new JTextField(10);
		txt9.setHorizontalAlignment(JTextField.RIGHT);
		txt9.setEditable(false);
		c.add(txt9);

		l10 = new JLabel("Grade");
		txt10 = new JTextField(10);
		txt10.setHorizontalAlignment(JTextField.RIGHT);
		txt10.setEditable(false);
		c.add(l10);
		c.add(txt10);
		c.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num1=Integer.parseInt(txt1.getText());
				num2=Integer.parseInt(txt2.getText());
				num3=Integer.parseInt(txt3.getText());
				num4=Integer.parseInt(txt4.getText());
				num5=Integer.parseInt(txt5.getText());
				Obtain=num1+num2+num3+num4+num5;
				percent=(Obtain*100)/250;
				average=Obtain/5;
				txt6.setText(String.valueOf(Obtain));
				txt8.setText(String.valueOf(percent));
				txt9.setText(String.valueOf(average));
				if(percent>=90)
				{
					txt10.setText("A+");
				}
				else if(percent>=80)
				{
					txt10.setText("A");
				}
				else if(percent>=70)
				{
					txt10.setText("B");
				}
				else if(percent>=60)
				{
					txt10.setText("C");
				}
				else if(percent>=50)
				{
					txt10.setText("D");
				}
				else if(percent>=40)
				{
					txt10.setText("E");
				}
				else
				{
					txt10.setText("F");				}
				
				}
		});
		
		
		
		setVisible(true);
	}

}
