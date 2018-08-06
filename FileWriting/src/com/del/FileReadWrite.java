package com.del;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) {
		
		String input="";
		FileReader fr=null;
		BufferedReader br=null;
		File f = new File("output2.txt");
		FileWriter fw= null;
		BufferedWriter bw=null;
		try {
			fr= new FileReader("output.txt");
			br= new BufferedReader(fr);
			fw= new FileWriter(f);
			bw= new BufferedWriter(fw);
			
			while((input=br.readLine())!=null) {
				bw.write(input);
				bw.newLine();
				System.out.println("writing");
			}
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
