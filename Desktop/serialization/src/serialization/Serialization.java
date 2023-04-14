package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException  {
		Intern intern =new Intern("KARTHIKEYAN", 12345, "BRANDING");
		
		FileOutputStream fileoutputStream=null;
		
		ObjectOutputStream objectOutputStream=null;
		
		try {
			 fileoutputStream=new FileOutputStream("serialization.txt");
			 objectOutputStream=new  ObjectOutputStream(fileoutputStream);
			objectOutputStream.writeObject(intern);
			
		} 
//		 finally {
//			if (objectOutputStream!=null) {
//				objectOutputStream.close();
//			}
//			
//			if (fileoutputStream!=null) {
//				fileoutputStream.close();
//			}
		}
		
		
		
		
		
		System.out.println("Serialization Completed");
		
		
	}
}
