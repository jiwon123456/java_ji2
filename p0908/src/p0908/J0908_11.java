package p0908;

public class J0908_11 {

	public static void main(String[] args) {
		//3개의 점수를 입력받아 합계와 평균을 구하시오.
		int kor = 100;
		int eng = 99;
		int math = 98;
		
		System.out.println("합계 : "+total(kor,eng,math));
		
		J0908_11 j = new J0908_11();
		
		System.out.println("평균 : "+j.avg(kor,eng,math));
		
		

	}//main
	//  리턴탕비 메소드명(매개변수명,매개변수명,매개변수명)
	 static int total(int kor, int eng, int math) {
		return kor+eng+math;//리턴타입과 return타입은 무조건 일치
	}
	
	 double avg(int kor,int eng,int math) {
		return (kor+eng+math)/3.0;
	}

}//class
