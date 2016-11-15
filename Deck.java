import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class Deck{
	
	
	String suit="";
	private String name="";
	private int value =0, num =0;
    static Card [] deck = new Card[52];
    static int [] gg = new int[52];
    static Card [] shuffled = new Card[52];
	
	public Deck(){
		for(int j =0; j < 4; j++){
			switch(j){
				case 0: suit = "Clubs";
						break;
					
				case 1: suit = "Diamonds";
						break;
						
				case 2: suit = "Hearts";
						break;
						
				case 3: suit = "Spades";
						break;
			}
				
			
			for(int i = 0; i < 13; i++){
		 	switch(i){
		 		case 0: name = "Ace";
		 				value = 11;
		 				break;
		 		case 1: name = "Two";
		 			    value = 2;
		 				break;
		 		case 2: name = "Three";
		 			    value = 3;
		 				break;
		 		case 3: name = "Four";
		 			    value = 4;
		 				break;	
		 		case 4: name = "Five";
		 		        value = 5;
		 				break;
		 		case 5: name = "Six";
		 			    value = 6;
		 				break;
		 		case 6: name = "Seven";
		 		        value = 7;
		 				break;
		 		case 7: name = "Eight";
		 		        value = 8;
		 				break;
		 		case 8: name = "Nine";
		 		        value = 9;
		 				break;
		 		case 9: name = "Ten";
		 		        value = 10;
		 				break;
		 		case 10: name = "Jack";
		 		         value = 10;
		 				break;
		 		case 11: name = "Queen";
		 		         value = 10;
		 				break;
		 		case 12: name = "King";
		 		         value = 10;
		 				break;
		 	}
		 	deck[num] = new Card(name,suit,value,new ImageIcon("cards/"+(num+1)+".jpg"));
		 	
		 	num++;
		 	
			}
		}
			
	}
	
	public void shuffledDeck(){
		boolean [] check = new boolean[52];
	    
		for(int i = 0; i < 52; i++)
			{
				int random = (int)(Math.random()*52);
				
				while(check[random])
				{	
						random = (int)(Math.random()*52);	
				}
				
				//System.out.print(random + "  ");
				
				check[random] = true;
				shuffled[i] = deck[random];
				gg[i] = random;
			}
				
		
		}
		
		
		
	public static void main(String args[]){
				Deck SD = new Deck();
				//System.out.print(Deck.deck[i] +"\n");
					
			    SD.shuffledDeck();
			    
			    Arrays.sort(gg);
			    
			    for(int i = 0; i < gg.length; i++)
					System.out.print(gg[i] + " " +" " + i +"\n");
			
	}
}

