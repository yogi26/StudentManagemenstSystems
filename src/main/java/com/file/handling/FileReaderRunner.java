package com.file.handling;

import java.io.File;
import java.io.FileReader;

public class FileReaderRunner {
	public static void main(String[] args) {
		File file=new File("demo.txt");
		int data = 0;
		try (FileReader fr=new FileReader(file)){
			while(data!=-1) {
				data=fr.read();
				System.out.print((char)data);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
