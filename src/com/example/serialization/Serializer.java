package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer<T> {

	T object;
	
	public Serializer(T object) {
		this.object=object;
	}
	
	public void serialize(String fileName) {
		try(ObjectOutputStream objOStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
			objOStream.writeObject(object);
			System.out.println("Input "+object.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public T deserialize(String fileName) {
		T object = null;
		try(ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream(fileName))) {
		    object = (T) objIStream.readObject();
			System.out.println("Output "+object.toString());
		} catch (InvalidClassException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
}
