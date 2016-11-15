import javax.swing.*;

public class Card{
	
	private String name;
	private String suit;
	private int value;
	private ImageIcon cardImage;
	
	public Card(String name, String suit,int value,ImageIcon cardImage){
		
		this.name = name;
		this.suit = suit;
		this.value = value;
		this.cardImage = cardImage;
		
	}
	
    
	
	
	public String getName(){
		return name;
	}
	
	public String getSuit(){
		return suit;
	}
	
	public int getValue(){
		return value;
	}
	
	
		
	public String getImage(){
		return cardImage.toString();
	}
	
	public String toString(){
		return name + " " + suit + " " + value + " " + cardImage;
	}	
}