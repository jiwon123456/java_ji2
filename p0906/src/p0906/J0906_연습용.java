package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_연습용 {

	public static void main(String[] args) {
		//선언부분
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[]winlotto = new int[6];
		int[]myNum = new int[6];
		
		//입력부분
		for(int i =0;i<lotto.length;i++) {
			lotto[i] = i + 1;
		}//for
		
		//번호섞기
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*45);
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//for
		
		//당첨번호 입력부분
		for(int i=0;i<6;i++) {
			winlotto[i] = lotto[i];
		}//for
		Arrays.sort(winlotto);
		
		//나의 번호입력부분
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.(1-45)");
			myNum[i] = scan.nextInt();
		}
		Arrays.sort(myNum);  
		
		//번호출력
		System.out.println("----------------------");
		System.out.println("    로또 105호차 번호");
		System.out.println("-----------------------");
		//나의번호 출력
		System.out.print(" ◆ 나의입력번호 : ");
		for(int i=0;i<myNum.length;i++) {
			System.out.print(myNum[i]+" ");
		}//for
		System.out.println();
		
		//당첨번호 출력
		System.out.print(" ★ 당첨번호 : ");
	    for(int i =0; i<winlotto.length; i++) {
	        System.out.print(winlotto[i]+" ");	
	    }//for
	    System.out.println();
		
	
	

	}//main

}//class
