package p0921;

public class J0921_10 {

	public static void main(String[] args) {
		
		//52장의 카드를 출력하시오.
		ColAction co2 = new ColAction();
		Card[] card = co2.cardInsert();
		for(int i=0;i<card.length;i++) {
			System.out.print(card[i].getKind());
			System.out.println(card[i].getNumber());
		}
		
		
		
		

	}//main

}//class
