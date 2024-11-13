package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandleFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91831\\Desktop\\eeeem32\\manu.txt");
		
//		if(f.createNewFile())
//			System.out.println("created");
//		else 
//			System.out.println("failed to create");
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("tignesh");
//		fw.write(" alias vignesh");
//		fw.flush();
//		System.out.println("written");
		
		FileReader fr = new FileReader(f);
		char arr[] = new char[(int)f.length()];
		fr.read(arr);
		
		String s1 = new String(arr);
		System.out.println(arr);
	}

}
