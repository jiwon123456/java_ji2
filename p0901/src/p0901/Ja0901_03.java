package p0901;

public class Ja0901_03 {

	public static void main(String[] args) {
//		int a = 10000000;
//		int b = 10000000;
//		long c = (long)a * b;
//		System.out.printf("%,d",c);
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);

		
		char c4 = (char)(c2+1); //
		System.out.println(c4);
		
		char c5 = ++c2;
		System.out.println(c4);
		
		char c6 = 48; //0 -> 48
		System.out.println(c6);
		System.out.println((char)(c6+1));
		
		int i = '4'-'0';
		System.out.println(i);
		
		int i2 = '7'-'0'; //문자형 숫자를 int타입으로 변경방법은 '0'을 뺴주면 됨. int타입 변경
		System.out.println(i2);
		
	}
	

}
