package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample4 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Administrator\\Desktop\\jsp1.txt");
		try (FileReader fr = new FileReader(f1)){
			char[] arr=new char[(int)f1.length()];
			fr.read(arr);
		}
		String arr = null;
		String s1=new String(arr);
		System.out.println("s1");
	}

}
