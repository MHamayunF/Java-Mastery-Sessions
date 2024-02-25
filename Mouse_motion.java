package calcuator;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.event.MouseMotionListener;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	public class Mouse_motion extends JFrame implements MouseListener,MouseMotionListener{
	JLabel l1,l2,l3,l4;
	Mouse_motion()
	{
	setBounds(150, 150, 300, 300);
	setLayout(null);
	l1 = new JLabel();
	l1.setBounds(40, 40, 200, 200);
	l2 = new JLabel();
	l2.setBounds(40, 50, 200, 200);
	l3 = new JLabel();
	l3.setBounds(40, 60, 200, 200);
	l4 = new JLabel();
	l4.setBounds(40, 70, 200, 200);
	addMouseListener(this);
	addMouseMotionListener(this);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	l1.setText("clicked at "+ e.getX()+","+e.getY());
	Graphics G=getGraphics();
	G.setXORMode(Color.RED);
	G.fillOval(e.getX(),e.getY(),30,30);
	}
	@Override
	public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	l2.setText("pressed at"+e.getX()+","+e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	l3.setText("Dradded at "+e.getX()+","+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	l4.setText("Moved at"+e.getX()+","+e.getY());
	}
	}

