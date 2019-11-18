package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model) {
		
		Double BookPrice =bookService.findPriceById(bookId);
		model.addAttribute("price", "Book Price"+ BookPrice);
		
		return "Display";
		
		
	}

}
