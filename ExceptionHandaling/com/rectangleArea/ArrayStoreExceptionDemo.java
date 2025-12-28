package com.rectangleArea;

public class ArrayStoreExceptionDemo {
    void main() {
    	try {
    		
    		storeObjects();
    		IO.println("Objects stored successfully.");
    	}
    	catch (ArrayStoreException e) {
    		IO.println(e);
			
		}
    	
    	
    }
    
    public static void storeObjects() throws ArrayStoreException
    {
    	String[] str= new String[5];
        str[0]="java";
        str[1]="10";
    	
		
	}
}

