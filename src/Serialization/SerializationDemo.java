package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception{
		
		// object creation
		Student student = new Student("Abhishek", 27, "abhi.kr@gmail.com");
		
		// Write data to file
		FileOutputStream fos = new FileOutputStream("src/Serialization/stud.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// how to serialize
		oos.writeObject(student);
		
		oos.close();
		fos.close();
		System.out.println("object state is transfered to file");

	}
}
