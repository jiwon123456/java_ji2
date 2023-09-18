package p0918;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction(); //객체선언
		int stuCount = 1;
		String [] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		//메인화면 출력부분
		int choice = stuAction.mainPrint();
		
		switch(choice) {
		
		case 1:
			//1.학생입력메소드
			
			break;
		
		case 2:
			//2.학생성적출력 메소드
			
			break;
			
		case 3:
			//3.학생성적수정 메소드
			
			break;
			
		case 4:
			//4.학생성적삭제 메소드
			
			break;
		
		case 5:
			//5.학생성적검색 메소드
			
			break;
		
			
		
		
		
		}//switch
		
		
		
		

	}//main

}//class
