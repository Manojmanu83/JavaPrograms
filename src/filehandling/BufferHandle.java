package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferHandle {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91831\\Desktop\\eeeem32\\manu.txt");
//		FileWriter fw = new FileWriter(f);
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("ganapathi");
//		bw.newLine();
//		bw.write("manu");
//		bw.flush();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s != null) {
		System.out.println(s);
		s = br.readLine();
		}
	}

}
