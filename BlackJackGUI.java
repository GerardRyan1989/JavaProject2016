import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

public class BlackJackGUI extends JFrame implements ActionListener {
	
	private int i=0, j =0, f =0, ace =0;
	private double balance =0;
	private JMenuBar menu;
	private JMenu file;
	private JMenuItem exit, back;
	private JButton hitbtn, stickbtn, dealbtn, stakebtn;
	private JLabel userCard1, userCard2, userCard3, userCard4, userCard5, usersHand, whiteSpace, infoHold, dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5, dealersHand;
	private JPanel crdholder, crdholder2, btnholder, spaceholder, spaceholder2;
	private ImageIcon bcard, card1, card2, card3, card4, card5, dcard1, dcard2, dcard3, dcard4, dcard5;
	Card [] shuffled = new Card[52];
	private int userValue =0 , dealerValue=0;
	private double stake = 0;
	public BlackJackGUI(){
		super("BlackJack");
		setSize(800,600);
		setLocation(150,150);
		setLayout(new GridLayout(5,1));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		back = new JMenuItem("Back");
		exit = new JMenuItem("Exit");
		file = new JMenu("file");
		exit.addActionListener(this);
		back.addActionListener(this);
		file.add(back);
		file.add(exit);
		menu = new JMenuBar();
		menu.add(file);
		//add(menu);
		setJMenuBar(menu);
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
		infoHold = new JLabel("Stake: €" + String.format("%.2f",stake) + "\t Balance: €" + String.format("%.2f",balance));
		whiteSpace = new JLabel("");
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
		stakebtn = new JButton("Set Stake");
		Font font = new Font("Arial", Font.BOLD, 24);
		Font font2 = new Font("Arial", Font.BOLD,12);
		dealbtn.setBackground(Color.white);
		dealbtn.setForeground(Color.black);
		dealbtn.setFont(font);
		hitbtn.setBackground(Color.white);
		hitbtn.setForeground(Color.black);
		hitbtn.setFont(font);
		stickbtn.setBackground(Color.white);
		stickbtn.setForeground(Color.black);
	    stickbtn.setFont(font);
	    stakebtn.setBackground(Color.white);
		stakebtn.setForeground(Color.black);
		stakebtn.setFont(font);
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
	    spaceholder2.setFont(font2);
	    spaceholder2.add(infoHold);
	    add(spaceholder2);
	    btnholder.add(stakebtn);
	    btnholder.add(dealbtn);
		btnholder.add(hitbtn);
		btnholder.add(stickbtn);
		btnholder.setBackground(Color.black);
		add(btnholder);
		hitbtn.addActionListener(this);
		dealbtn.addActionListener(this);
		stickbtn.addActionListener(this);
		stakebtn.addActionListener(this);
		stickbtn.setVisible(false);
		hitbtn.setVisible(false);
		dealbtn.setVisible(false);
		setResizable(false);
		Deck deck = new Deck();
		deck.shuffledDeck();
		for(int i = 0; i < shuffled.length; i++)
		{
			shuffled[i] = deck.shuffled[i];
		}
	}
	    
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == hitbtn){
					
					
					if(i == 0){
						card1 = new ImageIcon(shuffled[j].getImage());
						userCard1.setIcon(card1);
						userValue += shuffled[j].getValue();
						if(shuffled[j].getName().equals("Ace"))
								{
									ace++;
								}
						j++;
						crdholder.add(userCard1);
					}
					if(i == 1)
					{
					
						card2 = new ImageIcon(shuffled[j].getImage());
						userCard2.setIcon(card2);
						crdholder.add(userCard2);
						userValue += shuffled[j].getValue();
							if(shuffled[j].getName().equals("Ace"))
								{
									ace++;
								}
						
						crdholder.revalidate();
						crdholder.repaint();
						j++;
					}
					
				
					
					if(i==2){
						card3 = new ImageIcon(shuffled[j].getImage());
						userCard3.setIcon(card3);
						crdholder.add(userCard3);
						userValue += shuffled[j].getValue();
						if(shuffled[j].getName().equals("Ace"))
							{
						
								ace++;
							}
						crdholder.revalidate();
						crdholder.repaint();
						j++;
					}
					
					if(i==3){
						card4 = new ImageIcon(shuffled[j].getImage());
						userCard4.setIcon(card4);
						crdholder.add(userCard4);
						userValue += shuffled[j].getValue();
						if(shuffled[j].getName().equals("Ace"))
							{
								ace++;
							} 
						crdholder.revalidate();
						crdholder.repaint();
						j++;
					}			   	
			   		if(i==4){
			   			card5 = new ImageIcon(shuffled[j].getImage());
						userCard5.setIcon(card5);
						crdholder.add(userCard5);
						userValue += shuffled[j].getValue();
						if(shuffled[j].getName().equals("Ace"))
								{
									ace++;
								}
						crdholder.revalidate();
				        crdholder.repaint();
						j++;
						
			   		}
			   	    
			   	    if(i > 4){
			   	    
			   	    JOptionPane.showMessageDialog(null,"Maximum number of cards Selected");	
			   	    
			   	    }
			   	    
					
						   	   
					if(userValue >11)
					{
						stickbtn.setVisible(true);
					}
					
					if(userValue == 11 && ace >  0)
					{
						hitbtn.setVisible(false);
					}
					
					if(userValue >=2 && ace > 0)
					{
						stickbtn.setVisible(true);
					}
				
					if(j > 50)
			   	   		{
			   	   			Deck SD = new Deck();
			   	   			SD.shuffledDeck();
			   	   			for(int x =0; x < shuffled.length; x++)
					   	   			{
					   	   				shuffled[x] = SD.shuffled[x];	
					   	   			}
			   	   		   JOptionPane.showMessageDialog(null,"The current deck in use is now empty....\n\n\nplease wait while the dealer shuffles a new deck");
			   	   	
			   	   			j=0;
			   	  		 }	 
			   	   
			   	   if(userValue > 21)
			   	   {
			   	   	  JOptionPane.showMessageDialog(null,"Dealer wins as you have bust \n\nPress Deal to start a new hand" +"\nYou had: " + userValue,"Not This Time", JOptionPane.INFORMATION_MESSAGE);
			   	   	  dealbtn.setVisible(true);
			  		  stickbtn.setVisible(false);
			  		  hitbtn.setVisible(false);
			  		  stakebtn.setVisible(true);
			  		  balance -= stake;
			  		  infoHold.setText("Stake: €" + String.format("%.2f",stake) + "\t Balance: €" + String.format("%.2f",balance));
			   	   }
			   	   
			   	  
			   	i++;
			}
			
			if(e.getSource() == dealbtn){
				    ace =0;
					stakebtn.setVisible(false);
					dealbtn.setVisible(false);
					hitbtn.setVisible(true);
			  		stickbtn.setVisible(false);
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
					
					if(j >50)
			   	   		{
			   	   			Deck SD = new Deck();
			   	   			SD.shuffledDeck();
			   	   			for(int x =0; x < shuffled.length; x++)
					   	   			{
					   	   				shuffled[x] = SD.shuffled[x];	
					   	   			}
			   	   		   JOptionPane.showMessageDialog(null,"The current deck in use is now empty....\n\n\nplease wait while the dealer shuffles a new deck");
			   	   	
			   	   			j=0;
			   	  		 }
			   	  		 
			   	  	while(stake > balance){
			   	  		boolean valid = false;
			   	  		do{
			   	  		try{
			   	  				int yesNO = 0;
			   	  				yesNO =JOptionPane.showConfirmDialog(null,"Your balance does not\n cover your stake \n\n"+
			   	  						"Would you like deposit Money","Insuffiecnt Funds",JOptionPane.YES_NO_OPTION);
			   	  				if(yesNO == 0)
			   	  					{
			   	  						balance += Integer.parseInt(JOptionPane.showInputDialog(null,"how much would you like to deposit:"));
			   	  					}
			   	  				else
			   	  					{
			   	  					stake = Double.parseDouble(JOptionPane.showInputDialog(null,"please reudce your Stake as it\n" +
			   	  						"it is greater than you balance\n enter new stake here:"));	
			   	  					}
				   	  			
				   	  			
				   	  			valid = true;
			   	  		}catch(NumberFormatException s){
				   	  			JOptionPane.showMessageDialog(null,"please enter a number in the format of \"99.99\"");
				   	  		}
			   	  		}while(valid == false);
			   	  	}
					i = 0;
					infoHold.setText("Stake: €" + String.format("%.2f",stake) + "\t Balance: €" + String.format("%.2f",balance));	
			}	
			
		
				if (e.getSource() == stickbtn){
						int k =0;
						
						if(j >45)
			   	   		{
			   	   			Deck SD = new Deck();
			   	   			SD.shuffledDeck();
			   	   			for(int x =0; x < shuffled.length; x++)
					   	   			{
					   	   				shuffled[x] = SD.shuffled[x];	
					   	   			}
			   	   		   JOptionPane.showMessageDialog(null,"The current deck in use is now empty....\n\n\nplease wait while the dealer shuffles a new deck");
			   	   	
			   	   			j=0;
			   	  		 }
			   	  		 
						if(userValue <=11 && ace > 0)
						{
							userValue += 10;
						}
					
						
				    	
						crdholder2.remove(dealerCard1);
					    crdholder2.remove(dealerCard2);
			   	    	dcard1 = new ImageIcon(shuffled[j].getImage());
						dealerCard1.setIcon(dcard1);
						dealerValue += shuffled[j].getValue();
						crdholder2.add(dealerCard1);
						j++;
						
						dcard2 = new ImageIcon(shuffled[j].getImage());
						dealerCard2.setIcon(dcard2);
						dealerValue += shuffled[j].getValue();
						crdholder2.add(dealerCard2);
						j++;
						crdholder2.revalidate();
						crdholder2.repaint(); 
							
				   if(dealerValue < userValue && dealerValue < 21)
				   {
					   	dcard3 = new ImageIcon(shuffled[j].getImage());
						dealerCard3.setIcon(dcard3);
						dealerValue +=  shuffled[j].getValue();
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
												   	dcard5 = new ImageIcon(shuffled[j].getImage());
										  			dealerCard5.setIcon(dcard5);
										  			dealerValue += shuffled[j].getValue();
												   	crdholder2.add(dealerCard5);
												   	crdholder2.revalidate();
													crdholder2.repaint();
													k=5;
													j++;
											   }
				   
		    	}
		    	
		    	
		    	
		    					if(dealerValue < 21 && dealerValue < userValue && k==5)
									{
									   	JOptionPane.showMessageDialog(null,"***Congratulations***\nYou win The Dealer has " + dealerValue +"You have " + userValue,"Results",JOptionPane.INFORMATION_MESSAGE);
									   	dealbtn.setVisible(true);
			  		 					hitbtn.setVisible(false);
			  							stickbtn.setVisible(false);
			  							balance += (stake*2);
									}
			
								if(dealerValue > 21)
									{
									   	JOptionPane.showMessageDialog(null,"***Congratulations***\nThe Dealer has Bust\nYou win this Time" +"\nYou had: " + userValue,"Results",JOptionPane.INFORMATION_MESSAGE);
									   	dealbtn.setVisible(true);
			  		 					hitbtn.setVisible(false);
			  							stickbtn.setVisible(false);
			  							balance += (stake*2);
									}
									
								if(dealerValue > userValue && dealerValue <= 21)
									{
										JOptionPane.showMessageDialog(null,"***Conmiserations*** \nThe dealer wins with " + dealerValue +"\nYou had: " + userValue,"Results",JOptionPane.INFORMATION_MESSAGE);
										dealbtn.setVisible(true);
			  							hitbtn.setVisible(false);
			  		 					stickbtn.setVisible(false);
			  		 					balance -= stake;
									}	   
								
								if(dealerValue == userValue)
									{
									    JOptionPane.showMessageDialog(null,"unfortunatley its a tie as you had " + userValue +
									    	" the dealer had " + dealerValue  ,"Results",JOptionPane.INFORMATION_MESSAGE);
									    
									    dealbtn.setVisible(true);
			  		  					hitbtn.setVisible(false);
			  		 					stickbtn.setVisible(false);	
									}
							
							
								infoHold.setText("Stake: €" + String.format("%.2f",stake) + "\t Balance: €" + String.format("%.2f",balance));
								dealerValue =0;
								userValue =0;
									   
							
					
						stakebtn.setVisible(true);
					    dealbtn.setVisible(true);
						hitbtn.setVisible(false);
			  		    stickbtn.setVisible(false);
						
						
							}	    
			if (e.getSource() == stakebtn)
			{
				dealbtn.setVisible(true);
				boolean valid=false;
				do{
				
				    try{
				    	stake = Double.parseDouble(JOptionPane.showInputDialog("Set Your Stake:"));
				    	
				    	valid = true;
				    }catch(NumberFormatException x)
				    {
				          JOptionPane.showMessageDialog(null,"Please enter number in the form of \"99.99\"");
				    }
					
					
				}while(valid == false);//end of do while statement		
				infoHold.setText("Stake: €" + String.format("%.2f",stake) + "\t Balance: €" + String.format("%.2f",balance)); 
			}
			
			if(e.getSource() == back)
			{
						this.setVisible(false);
						MainMenuGUI menu = new MainMenuGUI();
						menu.setVisible(true);
			}
			
			if(e.getSource() == exit)
			{
				int x= 0;
				
				x = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit without Saving","Exit",JOptionPane.YES_NO_OPTION);
				if(x == 0)
					{
							
							System.exit(0);
					}	
				else
					{
						  JOptionPane.showMessageDialog(null,"To save game go back to menu");	
					}
				
			
			}					  
	}
	public void getBal(double bal)
	{
		this.balance = bal;
	}
}