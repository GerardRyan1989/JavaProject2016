import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

public class BlackJackGUI extends JFrame implements ActionListener {
	
	private int i=0, j =0;private 
	JButton hitbtn, stickbtn, dealbtn;
	private JLabel userCard1, userCard2, userCard3, userCard4, userCard5, usersHand, whiteSpace, dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5, dealersHand;
	private JPanel crdholder, crdholder2, btnholder, spaceholder, spaceholder2;
	private ImageIcon bcard, card1, card2, card3, card4, card5, dcard1, dcard2, dcard3, dacrd4, dcard5;
	
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
		dealerCard3.setIcon(bcard);
		dealerCard4.setIcon(bcard);
		dealerCard5.setIcon(bcard);
	    userCard1.setIcon(bcard);
	    userCard2.setIcon(bcard);
	    userCard3.setIcon(bcard);
	    userCard4.setIcon(bcard);
	    userCard5.setIcon(bcard);
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
	    spaceholder2.setBackground(Color.green);
	    spaceholder2.add(whiteSpace);
	    add(spaceholder);
	    add(spaceholder2);
	    crdholder.add(usersHand);
	    crdholder.add(userCard1);
	    crdholder.add(userCard2);
	    crdholder.setBackground(Color.green);
	    add(crdholder);
	    btnholder.add(dealbtn);
		btnholder.add(hitbtn);
		btnholder.add(stickbtn);
		btnholder.setBackground(Color.black);
		add(btnholder);
		
		
		hitbtn.addActionListener(this);
		dealbtn.addActionListener(this);
		stickbtn.addActionListener(this);

	}
	    
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == hitbtn){
					if(i==0){
						crdholder.add(userCard3);
						crdholder.revalidate();
						crdholder.repaint();
					}
					
					if(i==1){
						crdholder.add(userCard4);
						crdholder.revalidate();
						crdholder.repaint();
					}
					
					if(i==2){
						crdholder.add(userCard5);
						crdholder.revalidate();
						crdholder.repaint();
					}			   	
			   	
			   	    if(i > 2){
			   	    
			   	    JOptionPane.showMessageDialog(null,"Maximum number of cards Selected");	
			   	    
			   	    }
			   	i++;
			}
			if(e.getSource() == dealbtn){
					crdholder.remove(userCard3);
				    crdholder.remove(userCard4);
				    crdholder.remove(userCard5);
					crdholder.revalidate();
					crdholder.repaint();
					
					crdholder2.remove(dealerCard3);
				    crdholder2.remove(dealerCard4);
				    crdholder2.remove(dealerCard5);
					crdholder2.revalidate();
					crdholder2.repaint();
					
					i = 0;
			}	
			
		
				if (e.getSource() == stickbtn){
			   
				   if(j < 5)
					   {
					   	 crdholder2.add(dealerCard3);
					   	 crdholder2.revalidate();
						 crdholder2.repaint();
							 if(j < 5 )
							   {
							   	 crdholder2.add(dealerCard4);
							   	 crdholder2.revalidate();
								 crdholder2.repaint();
							   } 
							   	 if(j < 5)
								   {
								   	 crdholder2.add(dealerCard5);
								   	 crdholder2.revalidate();
									 crdholder2.repaint();
								   } 
					   } 
				   else{
				   		JOptionPane.showMessageDialog(null,"Maximum number of cards Selected");	
				   }

				   
			}
		}	    
			  
}