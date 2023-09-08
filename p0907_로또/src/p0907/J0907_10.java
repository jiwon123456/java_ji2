package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 선언
		int [] lotto = new int[45];
		int [] myNo = new int[6];
		int[] winNo = new int [6];
		int temp, count= 0;
				
		//로또번호 순차
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}//for
		
		//로또 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp =lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//for
		
		//로또 6개 출력
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
		}
		System.out.println(Arrays.toString(winNo));
		System.out.println("--------------------------------");
		System.out.println("-------- 로또번호 입력 --------");
		System.out.println("---------------------------------");
		
		
		//직접번호 입력
		for(int i=0;i<6;i++) {
			System.out.println("번호를 입력하세요.");
			myNo[i] = scan.nextInt();
			
		}//for
		
		//당첨번호 출력
		for(int i=0;i<6;i++) {
			
		}
		
		
		
		//
		

	}//main

}//class
