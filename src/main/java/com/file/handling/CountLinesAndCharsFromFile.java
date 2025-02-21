package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLinesAndCharsFromFile {
	public static void main(String[] args) {
		File file=new File("demo.txt");
		int totalChar=0;
		int totalLines=0;
		int ch=0;
		if(file.exists()) 
		{
			try(BufferedReader br=new BufferedReader(new FileReader(file)))
			{
				while(ch!=-1) 
				{
					ch=br.read();
					if(ch=='\n') {
						totalLines++;
					}
					totalChar++;
				}
				System.out.println("Total chars in file : "+totalChar);
				System.out.println("Totoal lines in file : "+totalLines);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			throw new RuntimeException("File not present with given name : "+file.getName());
		}
		
	}
}
