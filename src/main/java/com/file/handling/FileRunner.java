package com.file.handling;

import java.io.File;

public class FileRunner {
	public static void main(String[] args) {
		//check if file is present or not
		File file=new File("c:\\Users\\yogig\\eclipse-workspace\\StudentManagementSystem\\demo.txt");
		if(file.exists()) {
			System.out.println("file is present");
			System.out.println("File name : "+file.getName());
			System.out.println("Path : "+file.getAbsolutePath());
			System.out.println();
		}else {
			throw new RuntimeException("File is not present");
		}
	}
}
