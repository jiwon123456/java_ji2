package p0912;

import java.util.Scanner;

public class J0912_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int stuNo = 0;
		String name = "";
		String [] subject = {"국어","영어","수학"}; //배열선언
		int [] score = new int[3];
		StuScore [] s = new StuScore[3]; //클래스배열선언
		
		//구현 2
		for(int i=0;i<s.length;i++) {
			stuNo = i+1;
			System.out.println("이름을 입력하세요.");
			name = scan.next();
		for(int j=0;j<score.length;j++) {
			System.out.println(subject[j]+"점수를 입력하세요.");
			score[j] = scan.nextInt();
			s[i] = new StuScore(stuNo,name,score[0],score[1],score[2]); //객체선언
		}
		
		//화면출력
			
		}//for
		for(int i=0;i<s.length;i++) {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s[i].stuNo,s[i].name,score[0],score[1],
				score[2],s[i].total,s[i].avg);
		}
	}//main
	
		
		
//		StuScore s = new StuScore();
//		s.stuNo = 1;
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 99;
//		s.total = s.kor + s.eng + s.math;
//		s.avg = s.total/3.0;
//		
//		StuScore s2 = new StuScore(2,"유관순",100,99,88);
//		System.out.println("합계 : "+s2.total);
//		System.out.printf("평균 : %.2f \n ",s2.avg);

	}//class


