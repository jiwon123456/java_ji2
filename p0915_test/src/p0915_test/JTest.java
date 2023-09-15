package p0915_test;


import java.util.Scanner;

public class JTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();// StuAction인스턴스 변수 사용을 위해 객체선언
		String[] title = {"번호","이름","국어","영어","수학","합계",
				"평균","등수"};
		int stuCount = 1;//1번쨰부터 시작
		
		while(true) {
			int choice = stuAction.mainPrint();// switch= 입력 하기위해 choice
			
			switch(choice) {
			
			case 1: 
			
			}//switch
			
			
			
			
			
		}//while
		

	}//main

}//class
