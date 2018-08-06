package com.del;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.log4j.*;

public class MyObjectReader {

	static Logger logger= Logger.getLogger(MyObjectReader.class);

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
			logger.info("Serializinfg Emp");
			fis = new FileInputStream("Out11.ser");
			ois = new ObjectInputStream(fis);
			Emp e1 = (Emp) ois.readObject();
			System.out.println(e1);
			logger.info(e1);
			
		} catch (FileNotFoundException e1) {
         logger.error(e1);
		}

		catch (IOException e1) {
		logger.error(e1);

		} catch (ClassNotFoundException e1) {
			
		logger.error(e1);

		}
	}
}
