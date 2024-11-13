package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\91831\\Pictures\\im6.jpg");
		FileInputStream fin = new FileInputStream(f);
		byte[] arr = new byte[(int)f.length()];
		fin.read(arr);
		
//		File f1 = new File();
		FileOutputStream fout = new FileOutputStream("C:\\Users\\91831\\Desktop\\eeeem32\\mmmm.jpg");
		fout.write(arr);
		fout.flush();
	}

}
