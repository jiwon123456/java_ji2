package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_03 {

	public static void main(String[] args) throws Exception {
		// 이름,국어,영어,수학점수를 StuScore객체에 담아 ArrayList에 저장하시오.
		//파일 stu2.txt
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		
		while(true) {
			
			System.out.println("이름을 입력하세요.");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			int total = kor+eng+math;
			double avg = total/3.0;
			int rank = 0;
			
			list.add(new StuScore(name,kor,eng,math));
			
			String data = String.format("%s,%d,%d,%d,%d,%.2f,%d \r\n", 
					name,kor,eng,math,total,avg,rank);
			
			FileWriter fw = new FileWriter("c:/aaa/stu2.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			
			System.out.println("입력한 데이터를 저장하였습니다.");
			System.out.println();
		}//while
		

	}//main

}//class
