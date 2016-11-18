import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

public class MainMenuGUI extends JFrame implements ActionListener {
	
	ImageIcon blackjackBG = new ImageIcon("cards/background.jpg");
	JLabel 	backgroundImage;
	JMenuBar menuStrip;
	JMenu file, play, register,info ;
	JMenuItem newGame, loadGame, newUser, exit, rulesOfGame;
	JPanel  backGround; 
		
	public MainMenuGUI(){
		super("Menu");
		setSize(1230,800);
		setLocation(150,150);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		newGame = new JMenuItem("new Game");
		rulesOfGame = new JMenuItem("Rules of BlackJack");
		newGame.addActionListener(this);
		rulesOfGame.addActionListener(this);
		loadGame = new JMenuItem("load Game");
		loadGame.addActionListener(this);
		register = new JMenu("Register");
		info = new JMenu("Information");
		file= new JMenu("File");
		play = new JMenu("Play");
		exit = new JMenuItem("Exit");
		newUser = new JMenuItem("register New User");
		newUser.addActionListener(this);
		info.add(rulesOfGame);
		register.add(newUser);
		file.add(exit);
		exit.addActionListener(this);
		play.add(newGame);
		play.add(loadGame);
		menuStrip = new JMenuBar();
		menuStrip.add(info);
		menuStrip.add(play);
		menuStrip.add(register);
		menuStrip.add(file);
		backgroundImage = new JLabel();
		backgroundImage.setIcon(blackjackBG);
		backGround = new JPanel();
		backGround.add(backgroundImage);
		add(menuStrip);
		add(backGround);
		setResizable(false);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == newGame)
		{ 
			BlackJackGUI table = new BlackJackGUI();
			table.setVisible(true);
			this.setVisible(false);
		}
		
		if(e.getSource() == loadGame)
		{
			message();
		}
		
		if(e.getSource() == newUser)
		{   
			int x = 1;
			do{
		
				 User u1 = new User();
				 String name;
				 int age;
				 double balance;
				 name =JOptionPane.showInputDialog("Please enter your name: ");
				 u1.setName(name); 
				 age = Integer.parseInt(JOptionPane.showInputDialog("please enter your Age: "));
				 u1.setAge(age);
				 balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter in euros how much you wish to play with:"));
				 u1.setBalance(balance);
				 
				 //JOptionPane.showMessageDialog(null,"Name: " + u1.getName() +"\nAge: " + u1.getAge() + "\nBalance: " + u1.getBalance());
				 
				 x = JOptionPane.showConfirmDialog(null,"Name: " + u1.getName() +"\nAge: " + u1.getAge() + "\nDeposit: " + u1.getBalance() +
				 											"\n\nAre these details correct","Details",JOptionPane.YES_NO_OPTION);
		
			}while(x == 1);
		}
		if(e.getSource() == rulesOfGame){
			
			JOptionPane.showMessageDialog(null,"***Rules of BlackJack***\n\n1: Each person Starts with 2 cards.\n2: \"Hit\"--  User takes another Card\n  \"Stick\"--User takes no more cards and sticks with current hand\n"
				+ " " + "\"Deal\"--  A new game of BlackJack is started\n" + " " + "\"Stake\"-- The amount of money the user wish to bet on each game(odds are Even) \n3: The maximum cards a player can have at any one time  is 5." + 
					"\n4: The winner is decided by hich hand has a greater value and/or if a hand greater than 21 results in a loss"+
						" \n5: If the user has the same value as the dealer e.g. both the dealer and the user have  21, it will result in a split pot i.e both parties share the winnings");
		}
		if(e.getSource() == exit)	
		{
			int x = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","exit confimation",JOptionPane.YES_NO_OPTION);
			if(x == 0)
			{
				System.exit(0);	
			}
			
		}
		
	}
	
	
	public void message(){
		JOptionPane.showMessageDialog(null,"not yet implemented");
	}
}