package project4;
import java.io.File;
import java.io.IOException;

public class FileExample
{
	public static void main(String[] args) {

			File f=new File("ruk1");
			try {
				if(f.createNewFile()) {
					System.out.println("file is created");
				}
				else {
					System.out.println("file is not created");
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			}

}
}
