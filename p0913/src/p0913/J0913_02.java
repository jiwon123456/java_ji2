package p0913;


import java.text.SimpleDateFormat;
import java.util.*;


public class J0913_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		String str = new String("a"); //java.lang 패키지를 생략가능
		//날짜 객체 1
		Date today = new Date();
		System.out.println(today);
		//format설정 - yyyy/mm/dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(today));
		//날짜 객체 2. 
		Calendar ca1 = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf3.format(ca1.getTime()));
		
	}

}
