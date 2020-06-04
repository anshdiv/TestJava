package main.com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.com.example.UIUtils;

public class SerializationDemo {

	public static void main(String ...arg) {
		
		UIUtils.addSection("Serialization");
		//serialize();
		UIUtils.addSection("DeSerialization");
		deserialize();
		
	}
  
	
	public static void serialize() {
		try(ObjectOutputStream objOStream = new ObjectOutputStream(new FileOutputStream("serial.txt"))) {
			Student inputObject = new Student("Anshul","1","Class 1st");
			objOStream.writeObject(inputObject);
			System.out.println("Input "+inputObject.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public static void deserialize() {

		try(ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream("serial.txt"))) {
			Student outPutObject = (Student) objIStream.readObject();
			System.out.println("OutPut "+outPutObject.toString());
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
