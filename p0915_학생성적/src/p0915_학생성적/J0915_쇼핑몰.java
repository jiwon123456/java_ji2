package p0915_학생성적;

import java.util.Scanner;

public class J0915_쇼핑몰 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id="aaa";
		String pw = "1111";
		String name = "홍길동";
		
		
		Buyer b1 = new Buyer(id,name);
		int choice =0;
		while(true) {
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("8. 총구매목록");
			System.out.println("9. 금액충전");
			System.out.println("0. 프로그램종료");
			System.out.println("---------------------------");
			System.out.println("프로그램을 종료합니다.");
			choice = scan.nextInt();
			
		}//while
		
		

	}//main
	static void productBuy(String pName,Buyer b1) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s \n",pName);
		System.out.println("결제를 진행할까요?(1.예 2.아니오)");
		int choice = scan.nextInt();
		if(choice==0) {
			int check = 0;
			
			if(pName.equals("Tv"))
				check = b1.buy(new Tv());
			else if(pName.equals("컴퓨터"))
				check = b1.buy(new Computer());
			else if(pName.equals("오디오"))
				check = b1.buy(new Audio());
			else if(pName.equals("세탁기"))
				check = b1.buy(new Washing());
			
			if(check==0) return;
			System.out.printf("%s를 구매하였습니다.",pName);
			
				
				
			
			
			
			
			
		}
		
		
		
	}

	
}//class
