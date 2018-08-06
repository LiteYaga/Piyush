package com.del;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectWriter {
	
	
	public static void main(String[] args) {
		
		ObjectOutputStream oos=null;
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream("Out11.ser");
			oos= new ObjectOutputStream(fos);
			Emp e= new Emp(111,"Tanmay",9012341234L);
			oos.writeObject(e);
			System.out.println("written");
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				
			}
			
			
		}
		
		
		
	}

}
