package p0911;

public class J0911_01 {
	
	int num = 0; //인스턴스 변수
	static int number = 0; //클래스 변수

	public static void main(String[] args) {
		// boolean, char, byte, short, int, long, float, double 타입
		//1. 기본형타입 - 변수이름에 데이터를 직접 저장
		int a =0; //지역변수
		char ch = 'c';
		long l = 0;
		double d = 0.5;
		
		//--------
		
		//2. 배열 - 변수이름에 주소값을 저장
		int[] n = new int[3];
		//배열의 주소에 데이터를 직접 저장
		n[0] = 0;
		n[1] = 1;
		n[2] = 0;
		
		//3. 객체선언 - 변수이름에 주소값을 저장
		J0911_01 j = new J0911_01();
		
		//객체의 변수이름에 데이터를 직접 저장
		j.num = 0; //참조변수명.변수명
		
		
		

	}//main

}//class
