package p0907;

public class J0907_01 {

	public static void main(String[] args) {
		int[][] num = new int[5][3];
		
		//입력부분
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j] = (3*i)+j+1; //(ex: new int[10][9] = (9*i)+j+1
	    	}                            
		}		
		
		//출력부분
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}	
		
		System.out.println();
		
		System.out.println("-----------------------------");
		
		
		
		
		//-------1차원 배열-----------
		//선언부분
		int[] score = new int[10];
		
		//score 1-10까지 숫자입력, 출력하시오.
		
		//입력부분
		for(int i=0;i<score.length;i++) {
			score[i] = i+1;
		}
		
		//출력부분
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}

	}//main

}//class
