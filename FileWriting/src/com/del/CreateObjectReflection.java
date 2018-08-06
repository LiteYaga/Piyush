package com.del;

import java.lang.reflect.Method;
import java.util.Scanner;

public class CreateObjectReflection {
	
	public static void main(String[] args) {
		
		System.out.print("enter Class name: ");
		Scanner scan=new Scanner(System.in);
		String className=scan.nextLine();
		try {
			Class cls=Class.forName(className);
			System.out.println("class loaded");
			Object obj=cls.newInstance();
			Method[] met= cls.getMethods();
			
			for(Method method:met) {
				System.out.println(method);
			}
			if(obj instanceof Emp) {
				Emp e=(Emp) obj;
				e.setName("Harish");
			}
			System.out.println(obj);
		}
		catch(ClassNotFoundException e) {
			
		}
		catch(InstantiationException e) {
			
		}
		catch(IllegalAccessException e) {
			
		}
		
		
	}

}
