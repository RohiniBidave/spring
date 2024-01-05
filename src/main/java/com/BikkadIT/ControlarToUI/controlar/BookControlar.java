package com.BikkadIT.ControlarToUI.controlar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.ControlarToUI.Model.Book;

@Controller
public class BookControlar {
	
	@GetMapping("/getbook")
	public String getbook (Model model) {
		Book b = new Book ();
		b.setBookID(111);
		b.setBookName("Java");
		b.setBookPrice(100.50);
		model.addAttribute("Book", b);
		return "book";
		}
	
	@GetMapping("/getallbooks")
	public ModelAndView getAllBook() {
		
		Book b1 = new Book ();
		b1.setBookID(222);
		b1.setBookName("Mvc");
		b1.setBookPrice(50.50);
		
		Book b2 = new Book ();
		b2.setBookID(333);
		b2.setBookName("python");
		b2.setBookPrice(80.50);
		
		Book b3 = new Book ();
		b3.setBookID(333);
		b3.setBookName("C++");
		b3.setBookPrice(65.50);
		
		List<Book> Books= new ArrayList();
		Books.add(b1);
		Books.add(b2);
		Books.add(b3);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("Books",Books);
		mav.setViewName("BOOKS");
		
		return mav;
		
		
		
		
	}
	
	
	
	
	
	
	

}
