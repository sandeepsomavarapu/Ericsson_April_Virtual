package com.ericsson.fileio;
import java.io.*;
public class BufferedStreamEx {
public static void main(String[] args) throws IOException {
String filepath = "sl.txt";
// 1.Create Stream Object
FileOutputStream fos = new FileOutputStream(filepath);//2 bytes
// 2.pass Stream object to BufferStream constructor
BufferedOutputStream bos = new BufferedOutputStream(fos);//1024 bytes
String s = "oracle.com";
byte[] b = s.getBytes();
bos.write(b);
bos.flush();
// 1.Create Stream Object
FileInputStream fis = new FileInputStream(filepath);
// 2.pass Stream object to BufferStream constructor
BufferedInputStream bis = new BufferedInputStream(fis);
int i;
while((i=bis.read())!=-1){
System.out.println((char)i);
}
}
}