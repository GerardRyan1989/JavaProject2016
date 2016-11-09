import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class
public class BlackJackGUI extends JFrame {
	
	private JButton hit, stick, deal;
	public BlackJackGUI(){
		super("BlackJack");
		setSize(800,600);
		setLocation(50,50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		cPane.setBackground(Color.green);
		cPane.setLayout(new FlowLayout());
		deal = new JButton("Deal Cards");
		hit = new JButton("Hit");
		stick = new JButton("Stick");
		Font font = new Font("Arial", Font.BOLD, 24);
		deal.setBackground(Color.black);
		deal.setForeground(Color.white);
		deal.setFont(font);
		hit.setBackground(Color.black);
		hit.setForeground(Color.white);
		hit.setFont(font);
		stick.setBackground(Color.black);
		stick.setForeground(Color.white);
	    stick.setFont(font);
	    cPane.add(deal);
		cPane.add(hit);
		cPane.add(stick);
	}
}