package com.tuan3.hw2.book;

import java.util.Arrays;

public class Book2 {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book2(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public Book2(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		qty = 0;
	}

	public String getName() {
		return this.name;
	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book2 [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}

}
