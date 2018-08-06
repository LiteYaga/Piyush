package com.del;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileChannelTransfer {

	public static void main(String[] args) {
		
		RandomAccessFile rFile=null;
		RandomAccessFile rToFile=null;
		try {
			rFile=new RandomAccessFile("output.txt", "rw");
			FileChannel fromChnl=rFile.getChannel();
			rToFile= new RandomAccessFile("file2.txt","rw");
			FileChannel toChnl=rToFile.getChannel();
			long pos=0;
			long count=fromChnl.size();
			toChnl.transferFrom(fromChnl, pos, count);
			System.out.println("data transfered");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rToFile!=null) {
					rToFile.close();
				}
				if(rFile!=null) {
					rFile.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
