package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String ...arg) {
		
		try(ObjectOutputStream objOStream = new ObjectOutputStream(new FileOutputStream("serial.txt"))) {
			Student inputObject = new Student("Anshul","1","Class 1st");
			objOStream.writeObject(inputObject);
			System.out.println("Input "+inputObject.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream("serial.txt"))) {
			Student outPutObject = (Student) objIStream.readObject();
			System.out.println("OutPut "+outPutObject.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
