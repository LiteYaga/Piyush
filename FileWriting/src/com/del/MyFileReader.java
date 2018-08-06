package com.del;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class MyFileReader {

	public static void main(String[] args) {
		
		String input="";
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr= new FileReader("output.txt");
			br= new BufferedReader(fr);
			LineNumberReader lnr= new LineNumberReader(br);
			while((input=lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+". "+ input);	
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
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

}
