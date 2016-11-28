import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
//declaring class  and setting it so it can inherit from the JFrame class and implements the interface class actionlistener

@SuppressWarnings({"unchecked", "deprecation"})

public class MainMenuGUI extends JFrame implements ActionListener {
	
	private  float balance =0;
	private User u1;
	private ImageIcon blackjackBG = new ImageIcon("cards/background.jpg");
	private JLabel 	backgroundImage;
	private JMenuBar menuStrip;
	private JMenu file, play, register,info ;
	private JMenuItem newGame, loadGame, saveGame, newUser, exit, rulesOfGame;
	private JPanel  backGround; 
	private	ArrayList <User>users = new ArrayList<User>();
		
	public MainMenuGUI(){
		super("Menu");
		setSize(725,510);
		setLocation(150,150);
		//setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		newGame = new JMenuItem("new Game");
		rulesOfGame = new JMenuItem("Rules of BlackJack");
		newGame.addActionListener(this);
		rulesOfGame.addActionListener(this);
		loadGame = new JMenuItem("load Game");
		saveGame = new JMenuItem("Save Game");
		loadGame.addActionListener(this);
		saveGame.addActionListener(this);
		register = new JMenu("Register");
		info = new JMenu("Information");
		file= new JMenu("File");
		play = new JMenu("Play");
		exit = new JMenuItem("Exit");
		newUser = new JMenuItem("register New User");
		newUser.addActionListener(this);
		info.add(rulesOfGame);
		register.add(newUser);
		file.add(saveGame);
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
		setJMenuBar(menuStrip);
		add(backGround);
		setResizable(false);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		BlackJackGUI table = new BlackJackGUI();
		if(e.getSource() == newGame)
		{ 
			
		
			if(u1 != null)	
			{
				table.getBal(u1.getBalance());
			}
			table.setVisible(true);
			this.setVisible(false);
		}
		
		if(e.getSource() == loadGame)
		{
			open();
		}
		
		if(e.getSource() == newUser)
		{   
			int x = 1;
			boolean valid=false;
			String name  ="";
			int age =0;
			double balance =0;
		    u1 = new User();//declaring user
		  do{
			 
			 name =JOptionPane.showInputDialog("Please enter your name: ");
			 
			do{
				
			try{
				 	age = Integer.parseInt(JOptionPane.showInputDialog("please enter your Age: "));
				 	
				 	valid = true;
				 }catch(NumberFormatException a){
				 	JOptionPane.showMessageDialog(null,"please enter a whole number for your age please");
				 }
			
			}while(valid == false);
			
			valid = false;
			
			 
			do{
			try{
				 	
				 	balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter in euros how much you wish to play with:"));
				 	
				 	valid = true;
				 }catch(NumberFormatException a){
				 	JOptionPane.showMessageDialog(null,"please enter a number in the format of \"99.99\"");
				 }
			
			}while(valid == false);
			
				 u1.setAge(age);
				 u1.setName(name); 
				 u1.setBalance(balance);
			 
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
		
		if(e.getSource() == saveGame)
		{
		try{
                save();
            }
            catch (IOException f){
                 f.printStackTrace();
            }
		}	
			
		if(e.getSource() == loadGame)
		{
			String gamenum ="";
			open();
			JTextArea area = new JTextArea("choose your game");
			for(int i =0; i < users.size(); i++){
				gamenum += toString(users.get(i));
			}
			  gamenum += "\n\n please choose the number of the game you wish to load"; 
			   
			JOptionPane.showInputDialog(gamenum);
			
			
		}	
	}
	
	public void setBal(int balance)
	{
		this.balance = balance;
	}
	
	public void save() throws IOException {
      	
      		ObjectOutputStream os;
      		os = new ObjectOutputStream(new FileOutputStream ("users.dat"));
      		os.writeObject(users);
      		os.close();
      	
      }
      
      public void open() {
      	try{
      	  ObjectInputStream is;
      	  is = new ObjectInputStream(new FileInputStream ("users.dat"));
          users  = (ArrayList<User>) is.readObject(); // CHANGED
      	  is.close();
      	}
      	catch(Exception e){
      		JOptionPane.showMessageDialog(null,"open didn't work");
      		e.printStackTrace();
      	}
      } // end
}