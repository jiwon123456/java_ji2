package p0921;

public class ColAction2 {
	
	Card[] card = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	void carAll() {
		for(int i=0;i<card.length;i++) {
			int number = i%13+1;
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
		}
		
	}//carAll
	
	
	Card[] cardInsert() {
		carAll();
		return card;
	}
	
}
