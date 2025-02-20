package com.file.handling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		//Write content in file
		try 
		{
			File file=new File("demo.txt");
			try(FileWriter fw=new FileWriter(file, true);){
				fw.write("Hello I'm writing into the file using java codeww\n");
			}	
		}
		catch(Exception e) {
			
		}
	}
}
