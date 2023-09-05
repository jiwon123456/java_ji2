package p0904;

import java.util.Scanner;

public class J0904_07 {

	public static void main(String[] args) {
		// 1부터 10까지의 랜덤숫자를 생성후 출력하시오.
		// 3개 숫자를 입력받아, 정답을 맞추는 프로그램을 구현하시오.
		// 1개 입력받아 맞는지 확인 정답, 오답
		// 3개의 입력값을 출력. 입력번호 : 1,9,7
		// 정답번호 :5
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 10) + 1;
		int num1 = 0, num2 = 0, num3 = 0;
		// 1
		System.out.println("1번째 숫자를 입력하세요.");
		num1 = scan.nextInt();
		if (random == num1) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		// 2
		System.out.println("2번째 숫자를 입력하세요.");
		num2 = scan.nextInt();
		if (random == num2) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		// 3
		System.out.println("3번째 숫자를 입력하세요.");
		num3 = scan.nextInt();
		if (random == num3) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		// 입력한 숫자 출력
		System.out.printf("입력번호 : %d, %d, %d \n", num1, num2, num3);
		// 정답번호:5
		System.out.println("정답번호 : " + random);


// 랜덤숫자 1~100까지 5개의 랜덤숫자를 생성해서 변수에 저장후 출력하시오. 숫자 중복가능
//		int num = (int)(Math.random()*100)+1;
//		int num1 = (int)(Math.random()*100)+1;
//		int num2 = (int)(Math.random()*100)+1;
//		int num3 = (int)(Math.random()*100)+1;
//		int num4 = (int)(Math.random()*100)+1;
//		
//		System.out.println("첫번째 랜덤 숫자 : "+num);
//		System.out.println("두번째 랜덤 숫자 : "+num1);
//		System.out.println("세번쨰 랜덤 숫자 : "+num2);
//		System.out.println("네번쨰 랜덤 숫자 : "+num3);
//		System.out.println("다섯번째 랜덤 숫자 : "+num4);
	}

}
