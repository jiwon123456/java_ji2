package p0912;

public class Deck {
	
	String [] kind = {"Spade","Heart","Diamond","Clover"};
	Card[] c = new Card[52];
	
	Deck() { //기본생성자
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(kind[i/13],(i%13)+1);
			
			//c[i].kind = kind[i/13];
			//c[i].number = (i%13)+1; //15%13
			//System.out.println(c[i]);
			
		}

	}//Deck
	
	//특정번호 카드 가져오기
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못선택하셨습니다.");
			return c[no%52];
		}
		return c[no];
	}
	
	//랜덤으로 카드 가져오기
	Card pick() {
		int random = (int)(Math.random()*52);
		return c[random];
		
	}
	
	void shuffle() {
		//52 -> 0-51
		Card temp;
		for(int i=0;i<1000;i++) {
			int random =(int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
		
	}
	
	//모든 카드출력메소드
	void cardPrint(){
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}
	
	

}
