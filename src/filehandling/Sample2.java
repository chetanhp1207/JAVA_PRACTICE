package filehandling;

import java.io.File;
import java.io.IOException;

public class Sample2 {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Administrator\\Desktop\\jsp.txt");
	if(f1.createNewFile()) {
		System.out.println("file is created");
	}
	else {
		System.out.println("file is not created");
	}
}
}
