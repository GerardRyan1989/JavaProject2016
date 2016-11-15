import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

public class BlackJackGUI extends JFrame implements ActionListener {
	
	private int i=0, j =0, f =0;
	private JButton hitbtn, stickbtn, dealbtn;
	private JLabel userCard1, userCard2, userCard3, userCard4, userCard5, usersHand, whiteSpace, dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5, dealersHand;
	private JPanel crdholder, crdholder2, btnholder, spaceholder, spaceholder2;
	private ImageIcon bcard, card1, card2, card3, card4, card5, dcard1, dcard2, dcard3, dcard4, dcard5;
	Card [] shuffled = new Card[52];
	int userValue =0 , dealerValue=0;
	
	public BlackJackGUI(){
		super("BlackJack");
		setSize(800,600);
		setLocation(150,150);
		setLayout(new GridLayout(5,1));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	btnholder = new JPanel(new FlowLayout());
    	crdholder = new JPanel(new FlowLayout());
        crdholder2 = new JPanel(new FlowLayout());
        spaceholder = new JPanel();  
        spaceholder2 = new JPanel();
		bcard = new ImageIcon("cards/backOfCard.jpg");
		card1 = new ImageIcon("cards/backOfCard.jpg");
		card2 = new ImageIcon("cards/backOfCard.jpg");
		card4 = new ImageIcon("cards/backOfCard.jpg");
		card5 = new ImageIcon("cards/backOfCard.jpg");
		dcard1 = new ImageIcon("cards/backOfCard.jpg");
		dcard2 = new ImageIcon("cards/backOfCard.jpg");
		dcard3 = new ImageIcon("cards/backOfCard.jpg");
		dcard4 = new ImageIcon("cards/backOfCard.jpg");
		dcard5 = new ImageIcon("cards/backOfCard.jpg");
		userCard1 = new JLabel();
		userCard2 = new JLabel();
		userCard3  = new JLabel();
		userCard4  = new JLabel();
		userCard5  = new JLabel();
		dealerCard1 = new JLabel();
		dealerCard2 = new JLabel();
		dealerCard3 =new JLabel();
    	dealerCard4 =new JLabel();
    	dealerCard5 =new JLabel();
		usersHand = new JLabel("Users Hand: ");
		dealersHand = new JLabel("Dealers Hand: ");
		whiteSpace = new JLabel();
		dealerCard1.setIcon(bcard);
		dealerCard2.setIcon(bcard);
		dealerCard3.setIcon(dcard3);
		dealerCard4.setIcon(dcard4);
		dealerCard5.setIcon(dcard5);
	    userCard1.setIcon(bcard);
	    userCard2.setIcon(bcard);
	    userCard4.setIcon(card4);
	    userCard5.setIcon(card5);
		dealbtn = new JButton("Deal");
		hitbtn = new JButton("Hit");
		stickbtn = new JButton("Stick");
		Font font = new Font("Arial", Font.BOLD, 24);
		dealbtn.setBackground(Color.white);
		dealbtn.setForeground(Color.black);
		dealbtn.setFont(font);
		hitbtn.setBackground(Color.white);
		hitbtn.setForeground(Color.black);
		hitbtn.setFont(font);
		stickbtn.setBackground(Color.white);
		stickbtn.setForeground(Color.black);
	    stickbtn.setFont(font);
	    crdholder2.add(dealersHand);
	    crdholder2.add(dealerCard1);
	    crdholder2.add(dealerCard2);
	    crdholder2.setBackground(Color.green);
	    add(crdholder2);
	    spaceholder.setBackground(Color.green);
	    spaceholder.add(whiteSpace);
	    add(spaceholder);
	    crdholder.add(usersHand);
	    crdholder.add(userCard1);
	    crdholder.add(userCard2);
	    crdholder.setBackground(Color.green);
	    add(crdholder);
	    spaceholder2.setBackground(Color.green);
	    spaceholder2.add(whiteSpace);
	    add(spaceholder2);
	    btnholder.add(dealbtn);
		btnholder.add(hitbtn);
		btnholder.add(stickbtn);
		btnholder.setBackground(Color.black);
		add(btnholder);
		hitbtn.addActionListener(this);
		dealbtn.addActionListener(this);
		stickbtn.addActionListener(this);
		Deck deck = new Deck();
		deck.shuffledDeck();
		for(int i = 0; i < shuffled.length; i++)
		{
			shuffled[i] = deck.shuffled[i];
		}
	}
	    
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == hitbtn){
					if(i==0){
					    
						card1 = new ImageIcon(shuffled[j].getImage());
						userCard1.setIcon(card1);
						userValue += shuffled[j].getValue();
						j++;
						crdholder.add(userCard1);
						card2 = new ImageIcon(shuffled[j].getImage());
						userCard2.setIcon(card2);
						crdholder.add(userCard2);
						userValue += shuffled[j].getValue();
						j++;
						System.out.print(userValue);
						crdholder.revalidate();
						crdholder.repaint();
			
					}
					
					if(i==1){
						card3 = new ImageIcon(shuffled[j].getImage());
						userCard3.setIcon(card3);
						crdholder.add(userCard3);
						userValue += shuffled[j].getValue();
						 if(userValue > 11 && shuffled[j].getName().equals("Ace") || userValue > 11 && shuffled[j-1].getName().equals("Ace") ||
						 	  userValue > 11 && shuffled[j-2].getName().equals("Ace"))
			   	   		 {
			   	   			userValue -=10;
			   	  		 }
						System.out.print(userValue);
						crdholder.revalidate();
						crdholder.repaint();
						j++;
					}
					
					if(i==2){
						card4 = new ImageIcon(shuffled[j].getImage());
						userCard4.setIcon(card4);
						crdholder.add(userCard4);
						userValue += shuffled[j].getValue();
						 if(userValue > 11 && shuffled[j].getName().equals("Ace")) 
			   	   		 {
			   	   			userValue -=10;
			   	  		 }
						crdholder.revalidate();
						crdholder.repaint();
						System.out.print(userValue);
						j++;
					}			   	
			   		if(i==3){
			   			card5 = new ImageIcon(shuffled[j].getImage());
						userCard5.setIcon(card5);
						crdholder.add(userCard5);
						userValue += shuffled[j].getValue();
						 if(userValue > 11 && shuffled[j].getName().equals("Ace"))
			   	   		 {
			   	   			userValue -=10;
			   	  		 }
						crdholder.revalidate();
						crdholder.repaint();
						j++;
						System.out.print(userValue);
			   		}
			   	    
			   	    if(i > 3){
			   	    
			   	    JOptionPane.showMessageDialog(null,"Maximum number of cards Selected");	
			   	    
			   	    }
			   	  
			   	   	
			   	   if(userValue > 21)
			   	   {
			   	   	  JOptionPane.showMessageDialog(null,"Dealer wins as you have bust \n\nPress Deal to start a new hand","Not This Time", JOptionPane.INFORMATION_MESSAGE);
			  		  hitbtn.setVisible(false);
			  		  stickbtn.setVisible(false);
			   	   }
			   	i++;
			}
			
			if(e.getSource() == dealbtn){
					hitbtn.setVisible(true);
			  		stickbtn.setVisible(true);
					userValue = 0;
			   	   	dealerValue = 0;
					crdholder.remove(userCard1);
					crdholder.remove(userCard2);
					crdholder.remove(userCard3);
				    crdholder.remove(userCard4);
				    crdholder.remove(userCard5);
					userCard1.setIcon(bcard);
					userCard2.setIcon(bcard);
				    crdholder.add(userCard1);
				    crdholder.add(userCard2);
					crdholder.revalidate();
					crdholder.repaint();
					
					crdholder2.remove(dealerCard1);
					crdholder2.remove(dealerCard2);
					crdholder2.remove(dealerCard3);
				    crdholder2.remove(dealerCard4);
				    crdholder2.remove(dealerCard5);
				    dealerCard1.setIcon(bcard);
				    dealerCard2.setIcon(bcard);
				    crdholder2.add(dealerCard1);
				    crdholder2.add(dealerCard2);
					crdholder2.revalidate();
					crdholder2.repaint();
					
					i = 0;
			}	
			
		
				if (e.getSource() == stickbtn){
						hitbtn.setVisible(false);
			  		    stickbtn.setVisible(false);
						crdholder2.remove(dealerCard1);
					    crdholder2.remove(dealerCard2);
					    
			   	    	dcard1 = new ImageIcon(shuffled[j].getImage());
						dealerCard1.setIcon(dcard1);
						dealerValue += shuffled[j].getValue();
						j++;
						crdholder2.add(dealerCard1);
						
						dcard2 = new ImageIcon(shuffled[j].getImage());
						dealerCard2.setIcon(dcard2);
						dealerValue += shuffled[j].getValue();
						crdholder2.add(dealerCard2);
						j++;
						
						System.out.print("kk"  +dealerValue +"DD");
						crdholder2.revalidate();
						crdholder2.repaint(); 
							
				   if(dealerValue < userValue && dealerValue < 21)
				   {
					   	dcard3 = new ImageIcon(shuffled[j].getImage());
						dealerCard3.setIcon(dcard3);
						dealerValue += shuffled[j].getValue();
						crdholder2.add(dealerCard3);
						crdholder2.revalidate();
						crdholder2.repaint();
						j++;
								if(dealerValue < userValue && dealerValue < 21)
									{
									  dcard4 = new ImageIcon(shuffled[j].getImage());
									  dealerCard4.setIcon(dcard4);
									  dealerValue += shuffled[j].getValue();
									  crdholder2.add(dealerCard4);
									  crdholder2.revalidate();
									  crdholder2.repaint();
									  j++;
									} 
										   	 if(dealerValue < userValue && dealerValue < 21)
											   {
												   	card5 = new ImageIcon(shuffled[j].getImage());
										  			dealerCard5.setIcon(dcard5);
										  			dealerValue += shuffled[j].getValue();
												   	crdholder2.add(dealerCard5);
												   	crdholder2.revalidate();
													crdholder2.repaint();
													j++;
											   }
				   
			}
			
								if(dealerValue > 21)
									{
									   	JOptionPane.showMessageDialog(null,"***Congratulations***\nThe Dealer has Bust\nYou win this Time","Results",JOptionPane.INFORMATION_MESSAGE);
									}
									
								if(dealerValue > userValue && dealerValue <= 21)
									{
										JOptionPane.showMessageDialog(null,"***Conmiserations*** \nThe dealer wins with " + dealerValue,"Results",JOptionPane.INFORMATION_MESSAGE);
									}	   
								
								if(dealerValue == userValue)
									{
									    JOptionPane.showMessageDialog(null,"unfortunatley its a tie as you had " + userValue +
									    	"the dealer had " + dealerValue,"Results",JOptionPane.INFORMATION_MESSAGE);	
									}
									   dealerValue =0;
									   userValue =0;	
							}	    
										  
	}
}