package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in)){
			while(reader.ready()) {
				String line = reader.readLine();//read entire line
				System.out.println(line);
				String[] words = line.split(",");//split each line into words
				System.out.println("Id: "+words[0]);
				System.out.println("Name: "+words[1]);
				System.out.println("Salary: "+words[2]);
				System.out.println("Gender: "+words[3]);
				System.out.println("********************************");
			}
			
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
