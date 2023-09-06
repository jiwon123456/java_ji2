package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		// 1. 1-100 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		// 1.1-100랜덤숫자를 생성하시오.
		// 2. 입력
		// 3. 비교
		// 4. 출력
		Scanner scan = new Scanner(System.in);
		int [] num = new int[10];
		
		int random =(int)(Math.random()*10)+1;
		
		int i = 0;
		
		while(i<10) {
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			
			num[i]=input;
			
			if(random==input) {
				System.out.println("정답입니다.");
				break;
				
			}else if(random>input) {
				System.out.println("입력한 숫자보다 큰 수 입니다.");
				
			}else {
				System.out.println("입력한 숫자보다 작은 수 입니다.");
			}
			if(i==9); {
				
			}
			i++;
		}
		System.out.println("입력 숫자 :");

	}//main

}//class
