package com.ericsson.fileio;
import java.io.*;

public class DataInputStreamEx {
public static void main(String[] args) throws Exception 
{
	FileOutputStream fs=new FileOutputStream("hello.txt");
DataOutputStream dos = new DataOutputStream(fs);


dos.writeInt(10);
dos.writeUTF("vineet");

DataInputStream dis =
 new DataInputStream(new FileInputStream("hello.txt"));

System.out.println("Int : " + dis.readInt());
System.out.println("String : " + dis.readUTF());
}
}