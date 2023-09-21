package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {
		
		
		ColAction co1 = new ColAction();
		//list출력, list2출력
		HashMap<String, Object> map = co1.scoreAll();
		
		//list 출력
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
	      for(int i =0; i<list.size(); i++) {
	      StuScore s = list.get(i);
	      System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n"
	         ,s.getStuNum(),s.getName(),s.getKor()
	         ,s.getEng(),s.getMath(),s.getTotal()
	         ,s.getAvg(),s.getRank());

	   }
	      
	      System.out.println("--------------------------------------");
	      ArrayList<Car> list2 =(ArrayList<Car>) map.get("list2");
	      for(int i=0; i<list2.size(); i++) {
	         Car c = list2.get(i);
	         System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
	         
	      }
			
		
		
		
		
		
		
		//list를 전달받아, 출력하시오.
//		ArrayList<StuScore> list = co1.scoreAll();
//		for(int i=0;i<list.size();i++) {
//			StuScore s = list.get(i);
//			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
//					s.getStuNum(),s.getName(),s.getKor(),s.getEng()
//					,s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//		}
//		
//		// 차 3대 출력
//		ArrayList<Car> list2 = co1.scoreAll();
//		for(int i=0;i<list2.size();i++) {
//			Car c = list2.get(i);
//			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
//		}	
		
		
//		//카드 52장 출력
//		Card[] card = co1.cardInsert();
//		for(int i=0;i<card.length;i++) {
//			System.out.print(card[i].getKind());
//			System.out.println(card[i].getNumber());
//			
//		}
//		
		
//		
//		//카드1장 출력
//		Card c = co1.cardInsert();
//		System.out.println(c.getKind());
//		System.out.println(c.getNumber());

	}//main

}//class
