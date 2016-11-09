

public class BlackJack{
	public static void main(String [] args){
		
		String suit="";
		String name="";
		int value =0, num =0;
		User ger = new User();
		Card [] Deck = new Card[52];
		for(int j =0; j < 4; j++){
			switch(j){
				case 0: suit = "Hearts";
						break;
					
				case 1: suit = "Clubs";
						break;
						
				case 2: suit = "Diamonds";
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
		 	Deck[num] = new Card(name,suit,value);
		 	
		 	num++;
		 
			}
		}
		
		for(int i = 0; i < 52; i++){
			System.out.println(Deck[i] +"\n");
		}
				System.out.print(ger);
	}
}