package com.singleton.example;

public class SingletonExampleArchitecture {
	 // private field that refers to the object
	   private static SingletonExampleArchitecture singleObject;
	                                              
	   private SingletonExampleArchitecture() {
	      // constructor of the SingletonExample class
	   }

	   public static SingletonExampleArchitecture getObject() {
		   // if null - then create an new object singleObject
		   // if not null then return the existing object of singleObject
		return singleObject;
	      // write code that allows us to create only one object
	      // access the object as per our need
	   }

}
