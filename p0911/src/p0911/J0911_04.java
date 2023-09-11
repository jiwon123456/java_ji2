package p0911;

import java.util.Scanner;

public class J0911_04 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("1번째 수를 입력하세요.(0.프로그램종료)");
			a = scan.nextInt();
			// 0을 입력하면종료
			if(a==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				
			System.out.println("2번쨰 수를 입력하세요.");
			b = scan.nextInt();
			
			int result = max (a, b); //클래스명.메소드명 - 같은 클래스 내에 선언되어있으면, 클래스명 생략가능
			System.out.println("큰수 : "+result);
		}//while
	}//main
	
	
	// static 있으면 클래스변수- 객체선언없이 클래스명.변수명
	//static없으면 인스턴스변수 - 객체선언후 참조변수명.변수명
	// static 있으면 클래스메소드 - 객체선언없이 클래스명.메소드명, 
	//static없으면 인스턴스 메소드 - 객체선언후 참조변수명.메소드명
	static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}//class
