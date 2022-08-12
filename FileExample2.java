package project4;

import java.io.File;

public class FileExample2 {

	public static void main(String[] args) {
		File f=new File("C:\\NewWorkSpace\\techout.projectExx\\src\\project6");
		String list[]=f.list();
		for(String l:list) {
			System.out.println(l);
		}
		

	}

}
