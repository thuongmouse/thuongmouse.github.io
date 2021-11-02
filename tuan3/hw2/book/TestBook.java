package com.tuan3.hw2.book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com,", 'm');
	    System.out.println(ahTeck);
	    
	    Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
	    System.out.println(dummyBook);
	    
	    dummyBook.setPrice(29.95);
	    dummyBook.setQtyInStock(28);
	    System.out.println("name is: "+dummyBook.getName());
	    System.out.println("price is: "+dummyBook.getPrice());
	    System.out.println("qty is: "+dummyBook.getQtyInStock());
	    System.out.println("Author is: "+dummyBook.getAuthor());
	    
	    System.out.println("Author's name is: "+dummyBook.getAuthor().getName());
	    System.out.println("Author's email is: "+dummyBook.getAuthor().getEmail());
	    
	    Book authorBook = new Book("more Java", new Author("Paul", "paul@somewhere.com", 'm'), 29.95);
	    System.out.println(authorBook);
	    
	    
	}

}
