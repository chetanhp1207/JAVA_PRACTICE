package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Administrator\\Desktop\\jsp1.txt");
	try (FileWriter fr = new FileWriter(f1,true)) {
		fr.write("hiii");
		fr.write("helllo");
		fr.flush();
	}
	System.out.println("data is written");
}
}
