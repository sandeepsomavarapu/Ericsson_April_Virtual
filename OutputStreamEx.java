package com.ericsson.fileio;


import java.io.*;
public class OutputStreamEx {
public static void main(String[] args) throws IOException {
String filepath = "tmp.txt";
//Byte Stream
FileOutputStream outputStream = new FileOutputStream(filepath);
for (int i = 0; i < 10; i++) {
outputStream.write(i);
}

FileInputStream inputStream = new FileInputStream(filepath);
int i;
while ((i = inputStream.read()) != -1) {
System.out.println("I : " + i);
}
}
}
/*

file I/O   stream    java.io

Character stream(FileWriter,FileReader,BufferedReader,BufferedWriter,PrintWriter)

Byte stream(OutputStream,InputStream,FileOutputStream,FileInputStream)2 bytes

Data Stream(DataInput,DataOutput,DataInputStream,DataOutputStream)

Buffered Stream(Reader,Writer,BufferedInputStream,BufferedOutputStream)1024 bytes

Object Stream(ObjectInputStream,ObjectOutputStream) Serialization/de-serialization
	
	transient keyword.
	
	
	Serializable-->empty body--->marker interfaces
	Clonnable---->cloning
	RandomAccess -->zero abstract methods

	java.io.Ser
	
	Emp e=new Emp();//Serilizable
	
	//interface --> any no of methods
	
	//marker interface --> no methods 
	
	//functional interface -->only one abstract method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


*/