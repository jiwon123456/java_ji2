package p0913;

public class Deck {
	
	String [] kind = {"Spade","Heart","Diamond","Clover"};
	Card [] c = new Card[52];
	
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(kind [i/13],(i%13)+1);
					
		}//for
	}//Deck
	
	Card pick(int no) {
		if(no>52) {
			System.out.println("잘못된 숫자입니다.");
			return c[no%52];
		}
		return c[no];//주소값c
	}
	
	
	
	Card pick() {
		int random = (int)(Math.random()*52);
		return c[random];
		
	}//Card pick
	
	
	
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			int random =(int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
		
	}
	
	
	
	
	void cardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
