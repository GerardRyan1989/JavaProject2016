
public class Card{
	
	private String name;
	private String suit;
	private int value;
	
	public Card(){
	
		this.name = "";
		this.suit = "";
		this.value = 0;
	}
	
	
	public Card(String name, String suit,int value){
		
		this.name = name;
		this.suit = suit;
		this.value = value;
		
	}
	
	
	public String toString(){
		
		return name + " " + suit + " " + value;
	}	
	
}