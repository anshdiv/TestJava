package com.example.serialization;


import com.example.UIUtils;

public class SerializationDemo {

	public static void main(String ...arg) {
		
		Student inputStudent = new Student("Anshul","1","Class 1st");
		Serializer<Student> serializer = new Serializer<Student>(inputStudent);

		UIUtils.addSection("Serialization");
		serializer.serialize("serial.txt");
		UIUtils.addSection("DeSerialization");
		Student outputStudent = serializer.deserialize("serial.txt");
		outputStudent.toString();		
	}
  
}
