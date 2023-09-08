package p0908;

public class J0908_09 {

	public static void main(String[] args) {
		//Spade-13장, Heart-13장, Diamond -13장, Clover -13장
		//배열선언
		Card[]c=new Card[52];
		String[]shape = {"Spade","Heart","Diamond","Clover"};
		//객체선언후 사용가능
		
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();//객체선언
			c[i].number = (i%13)+1;
			c[i].kind = shape[i/13]; //shape - 0-12:Spade, 13-25:Heart,26-38:Diamond,39-51:Clover
		}
		System.out.println("Card number : ");
		for(int i=0;i<c.length;i++) {
			System.out.printf("%d,%s \n" ,c[i].number,c[i].kind);
		}
		System.out.println();
		System.out.println("--------------");
		
		
		
//		int[] num = new int[13];
//		//1-13 입력해보세요.
//		//입력부분
//		for(int i=0;i<13;i++) {
//			num[i] = i+1;
//		}
//		//출력부분
//		System.out.print("num : ");
//		for(int i=0;i<13;i++) {
//			System.out.printf("%d",num[i]);
//		}
//		
		
		

	}//main

}//class
