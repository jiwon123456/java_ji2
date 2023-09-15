package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();//전체학생성적저장
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	//메인화면 출력부분
	int mainPrint() {
		System.out.println("------------------------");
		System.out.println("[    학생성적 프로그램    ]");
		System.out.println("------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		int choice = scan.nextInt();
		return choice;
	}//mainPrint
	
	//학생입력메소드
	int StuInput() {
		while(true) {
			System.out.println();
			System.out.println("[ 학생입력 ]");
			
			
		}//while
		
		
		
		
	}//StuInput
	
	

}
