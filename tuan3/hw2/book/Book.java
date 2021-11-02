/**
 * 
 */
package com.tuan3.hw2.book;

public class Book {
	private String name;
	private double price;
	private Author author;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.qtyInStock = qtyInStock;
	}

	public Book(String name, Author author, double price) {
		this.name = name;
		this.price = price;
		this.author = author;
		qtyInStock = 0;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return this.author;
	}

	public int getQtyInStock() {
		return this.qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String getAuthorName() {
	      return this.author.getName();
	   }

	   public String getAuthorEmail() {
	      return this.author.getEmail();
	   }

	   public char getAuthorGender() {
	      return this.author.getGender();
	   }

	   public String toString() {
	      return "'" + name +"' by " + author;
	   }   

	/*public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", qtyInStock=" + qtyInStock + "]";
	}*/

}
