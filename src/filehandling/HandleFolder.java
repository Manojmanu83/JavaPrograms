package filehandling;

import java.io.File;

public class HandleFolder {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\91831\\Desktop\\eeeem32");
		if(f.mkdirs())
			System.out.println("folder created");
		else 
			System.out.println("failed to create folder");
		
//		if(f.exists())
//			System.out.println("folder exists");
//		else 
//			System.out.println("folder doesn't exist");
		
//		if(f.delete())
//			System.out.println("folder deleted");
//		else 
//			System.out.println("failed to delete folder");
	}

}
