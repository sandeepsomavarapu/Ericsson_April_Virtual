package com.ericsson.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream out = new FileOutputStream("products.txt");
		ObjectOutputStream outstream = new ObjectOutputStream(out);

		Product product = new Product(111, "samsung", 5000, "electronics");
		outstream.writeObject(product);//serialization
		System.out.println("Object saved into file ");

		FileInputStream in = new FileInputStream("products.txt");
		ObjectInputStream instream = new ObjectInputStream(in);

		Product product1 = (Product) instream.readObject();
		System.out.println(product1);//deserialization
	

	}

}
