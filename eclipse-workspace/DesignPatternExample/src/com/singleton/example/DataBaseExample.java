package com.singleton.example;

class Database {
	   private static Database dbObject;

	   private Database() {      
	   }

	   public static Database getInstance() {
	      // create object if it's not already created
	      if(dbObject == null) { // only executed for first time
	    	  System.out.println("first time creating the new DB object");
	         dbObject = new Database(); // creating object 
	      }else {
	    	  System.out.println("second time no new object created");
	      }
	       // returns the singleton object
	       return dbObject;
	   }
	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}
	class DataBaseExample {
	   public static void main(String[] args) {
	      Database db1;
	      // refers to the only object of Database
	      db1= Database.getInstance();// 1st call
	     db1= Database.getInstance(); // 2nd time
	     db1= Database.getInstance(); // 3nd time
	     db1= Database.getInstance(); // 4nd time
	     db1= Database.getInstance(); // 5nd time
	     
	     // db1.getConnection();
	   }
	}