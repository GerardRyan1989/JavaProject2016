import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

public class BlackJackGUI extends JFrame /*implements ActionListener*/ {
	
	private JButton hit, stick, deal;
	private JLabel userCard1, userCard2, userCard3, userCard4, userCard5, usersHand, whiteSpace, dealerCard, dealerCard2, dealerCard3, dealerCard4, dealerCard5, dealersHand;
	private JPanel crdholder, crdholder2, btnholder, spaceholder, spaceholder2;
	private ImageIcon bcard, card1, card2, card3, card4, card5, dcard1, dcard2, dcard3, dacrd4, dcard5;
	public BlackJackGUI(){
		super("BlackJack");
		setSize(800,600);
		setLocation(50,50);
		setLayout(new GridLayout(5,1));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	btnholder = new JPanel(new FlowLayout());
    	crdholder = new JPanel(new FlowLayout());
        crdholder2 = new JPanel(new FlowLayout());
        spaceholder = new JPanel();  
        spaceholder2 = new JPanel();
		bcard = new ImageIcon("cards/backOfCard.jpg");
		userCard1 = new JLabel();
		userCard2 = new JLabel();
		dealerCard = new JLabel();
		dealerCard2 = new JLabel();
		usersHand = new JLabel("Users Hand: ");
		dealersHand = new JLabel("Dealers Hand: ");
		whiteSpace = new JLabel();
		dealerCard.setIcon(bcard);
		dealerCard2.setIcon(bcard);
	    userCard1.setIcon(bcard);
	    userCard2.setIcon(bcard);
		deal = new JButton("Deal");
		hit = new JButton("Hit");
		stick = new JButton("Stick");
		Font font = new Font("Arial", Font.BOLD, 24);
		deal.setBackground(Color.white);
		deal.setForeground(Color.black);
		deal.setFont(font);
		hit.setBackground(Color.white);
		hit.setForeground(Color.black);
		hit.setFont(font);
		stick.setBackground(Color.white);
		stick.setForeground(Color.black);
	    stick.setFont(font);
	    crdholder2.add(dealersHand);
	    crdholder2.add(dealerCard);
	    crdholder2.add(dealerCard2);
	    crdholder2.setBackground(Color.green);
	    add(crdholder2);
	    spaceholder.setBackground(Color.green);
	    spaceholder.add(whiteSpace);
	    spaceholder2.setBackground(Color.green);
	    spaceholder2.add(whiteSpace);
	    add(spaceholder);
	    add(spaceholder2);
	    crdholder.add(usersHand);
	    crdholder.add(userCard1);
	    crdholder.add(userCard2);
	    crdholder.setBackground(Color.green);
	    add(crdholder);
	    btnholder.add(deal);
		btnholder.add(hit);
		btnholder.add(stick);
		btnholder.setBackground(Color.black);
		add(btnholder);

	}
}