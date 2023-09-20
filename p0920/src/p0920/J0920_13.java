package p0920;

public class J0920_13 {

	public static void main(String[] args) {
		
		//i[10] 저장공간 1개
		int no = 0;
		for(int i=0;i<10;i++) {
			no += i;
		}
		System.out.println(no);
		
		
		//2. String객체 반복 - 반복횟수만큼 메모리공간 사용
		String str = "aaa";
		for(int i=0;i<10;i++) {
			str += ""+i;
		}
		System.out.println(str);
		
		//3. StringBuffer 객체반복 - 1개 메모리공간 사용
		StringBuffer sb = new StringBuffer("aaa");
		//StringBuffer s = "aaa";(객체는 선언 후 사용가능)
		for(int i=0;i<10;i++) {
			sb.append(i);//문자를 추가할떄 append 사용.
		}
		System.out.println(sb);
		
		//4. StringBuffer 비교 equals() 정의되어 있지 않음.
		StringBuffer sb1 = new StringBuffer("abc"); //StringBuffer(equals 비교 안됨)
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1.equals(sb2)) {
			System.out.println("sb1,sb2는 같음");
		}else {
			System.out.println("sb1,sb2는 다름");
			
		}//
		
		//String 비교 - equals() 정의되어 있음.
		String s1 = sb1.toString(); //StringBuffer 객체를 String변환해야만 비교가능.
		String s2 = sb1.toString();
		if(s1.equals(s2)) {
			System.out.println("sb1,sb2는 같음");
		}else {
			System.out.println("sb1,sb2는 다름");
			
		}//
	

	}//main

}//class
