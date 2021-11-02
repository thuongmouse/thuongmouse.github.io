package com.tuan3.hw2.book;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com,", 'm');
      System.out.println(ahTeck);
      ahTeck.setEmail("paulTan@nowhere.com");
      System.out.println("name is: "+ahTeck.getName());
      System.out.println("email is: "+ahTeck.getEmail());
      System.out.println("gender is: "+ahTeck.getGender());
      
      
		
	}

}
