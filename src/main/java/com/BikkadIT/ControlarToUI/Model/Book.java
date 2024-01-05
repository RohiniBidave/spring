package com.BikkadIT.ControlarToUI.Model;

public class Book {

	public int BookID;
	public String BookName;
	public double BookPrice;
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [BookID=" + BookID + ", BookName=" + BookName + ", BookPrice=" + BookPrice + "]";
	}
	
	
	
}
