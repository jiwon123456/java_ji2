package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_06 {

	public static void main(String[] args) throws Exception{//예외처리 위
		File f = new File("C:/downlod/aaa.txt"); 
		if(!f.exists()) {
			f.createNewFile();
		}//if
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("안녕하세요. 반갑습니다. 다음에 뵙겠습니다. \r\n두번째 줄입니다.\r\n");
		writer.close();
		
		
		System.out.println("파일이 생성되었습니다.");
		
	  

	}//main

}//class
