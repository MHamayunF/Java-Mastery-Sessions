package calcuator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tasbeeh extends JFrame{
	JTextField txt;
	JLabel l1 = new JLabel();
	JButton b1,b2,b3,b4,b5,b6;
	private int count=0;
	Tasbeeh()
	{
		
		setLayout(null);
		setBounds(40, 40, 500, 500);
		setTitle("Counter");
		Container c= getContentPane();
		c.setLayout(null);
		
		b1 = new JButton("Tasbih Fatima");
		b1.setBounds(10, 10, 150, 50);
		c.add(b1);

		b1.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("say tasbih fatima");
			}
		});
		
		b2 = new JButton("1st kalima");
		b2.setBounds(180, 10, 150, 50);
		c.add(b2);
	
		b2.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("say 1st kalima");
			}
			
		});
		
		b3 = new JButton("Astagfar");
		b3.setBounds(350, 10, 150, 50);
		c.add(b3);
	
		b3.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("say Astagfar");
			}
			
		});
		
		b4 = new JButton("Darood");
		b4.setBounds(10, 80, 150, 50);
		c.add(b4);
		
		b4.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("say Darood");
			}
			
		});
		
		b5 = new JButton("Ayat E Karima");
		b5.setBounds(180, 80, 150, 50);
		c.add(b5);
		b5.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("Say Ayat E Karima");
			}
			
		});
		
		JButton b3 = new JButton("Reset");
		b3.setBounds(350, 80, 150, 50);
		c.add(b3);
		b3.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count=0;
				l1.setText("");
				txt.setText("0");
			}			
		});
		

		txt = new JTextField(100);
		txt.setBounds(150, 200, 200, 200);
		txt.setEditable(false);
        Font font = new Font(txt.getFont().getName(), Font.PLAIN, 150); // Adjust the font size as desired
        txt.setFont(font);
        txt.setHorizontalAlignment(JTextField.CENTER);
		add(l1);
		l1.setBounds(210, 150, 150, 50);
		add(txt);
		b6 = new JButton("Count");
		b6.setBounds(180, 430, 150, 50);
		c.add(b6);
		b6.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				++count;
				txt.setText(count+"");
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

}
}
