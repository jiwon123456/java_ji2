package p0831;

public class Ja0831_13 {

	public static void main(String[] args) {
		int a = 1;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		int b = 10;
		int c = 10;
		b--;
		b--;
	    --b;
		--b;
		--b;
		c= b--; //c:5 b:4
		c = b;
		//System.out.println(b);
		//System.out.println(c);
		
		boolean power = true;
		System.out.println(power); //true
		power = !power;
		System.out.println(power); //false
		power = !power;
		System.out.println(power); //true
		
		char ch = 'A'; //65
		char ch2 = 'a'; //97
		System.out.println(ch+ch2); //65+95=162
		System.out.printf("%c,%c \n",ch,ch2);
		//System.out.println(!power);
		

	}

}
