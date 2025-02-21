package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FindLongestWordFromFile {
	public static void main(String[] args) {
		File file =new File("demo.txt");
		String longestWord="";
		int longestWordLength=0;
		String line = null;
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{
			while((line=br.readLine())!=null) {
				for(String word:line.split(" ")) {
					if(longestWordLength<word.length()) {
						longestWordLength=word.length();
						longestWord=word;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Longest word from file is : "+longestWord);
		System.out.println("Length of longest word is : "+longestWordLength);
	}
}
