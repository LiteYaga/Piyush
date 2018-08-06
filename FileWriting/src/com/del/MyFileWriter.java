package com.del;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	public static void main(String[] args) {
		
		File f = new File("output.txt");
		FileWriter fw= null;
		BufferedWriter bw=null;
		try {
			fw= new FileWriter(f,true);
			bw= new BufferedWriter(fw);
			
			bw.write("java is a language");
			bw.newLine();
			System.out.println("written");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
			
			}
		}

	}

}
