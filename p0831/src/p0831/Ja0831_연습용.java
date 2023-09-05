package p0831;

import java.util.Scanner;

public class Ja0831_연습용 {

	public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in); 
		
	   String name = "홍길동";
       int kor =0;
       int eng =0;
       int math =0;
   
    
       int total = kor + eng + math;
       double avg = total/3.0;
    
       System.out.printf("이름 : %s \n", name);
       System.out.printf("국어 : %d, 영어 : %d, 수학 : %d \n", kor,eng,math);
       System.out.printf("합계 : %d \n", total);
       System.out.printf("평균 : %.2f \n", avg);
	}
	

}
