package filehandling;

import java.io.File;

public class Sample1 {
public static void main(String[] args) {
	File f1=new File("C:\\Users\\Administrator\\Desktop\\jsp.txt");
	if(f1.mkdirs()) {
		System.out.println("file created");
	}
	else {
		System.out.println("file not created");
	}
	if(f1.exists()) {
		System.out.println("folder exists");
	}
	else {
		System.out.println("folder doesnt exist");
	}
	if(f1.delete()) {
		System.out.println("folder is deleted");
	}
	else {
		System.out.println("folder is not deleted");
	}
}
}
