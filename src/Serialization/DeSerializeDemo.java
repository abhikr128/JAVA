package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeDemo {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("src/Serialization/stud.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student = (Student) ois.readObject();
		
		student.dispalyName();
		System.out.println("Name: "+student.getName()+", Age: "+student.getAge()+", Email: "+student.getEmail());
	}

}
