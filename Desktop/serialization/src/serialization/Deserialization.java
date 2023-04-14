package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream inputStream=null;
		
		ObjectInputStream inputStream2=null;
		
		try {
			 inputStream=new FileInputStream("serialization.txt");
			
			 inputStream2=new ObjectInputStream(inputStream);
			
			Intern readObject =(Intern) inputStream2.readObject();
			
			System.out.println(readObject);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			// TODO: handle exception
		} finally {
			if (inputStream!=null) {
				
				inputStream.close();
			}

			if (inputStream2!=null) {
				
				inputStream2.close();
			}
		}
		
		
		
	}

}
