package p0907;

import java.util.Scanner;

public class J0907_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//선언부분
		int[]lotto = new int[45];
		int[]myNo = new int[6];
		int[]winNo = new int[6];
		int temp = 0, count=0;
		
		//로또번호 순차 입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; 
		}//for
		
		//로또번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0]= lotto[random];
			lotto[random]= temp;
		}
	
		//6개 당첨번호 출력
		for(int i=0;i<6;i++) {
			winNo[i]  = lotto[i];
		}
		
		//번호직접 입력
		
		
		
		
	}//main

}//class
