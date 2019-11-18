package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exception.NoBookFoundException;
@Service
public class BookServiceImpl implements BookService{

	@Override
	public double findPriceById(String bookId) {
		
		if(bookId.equals("B101")) {
			return 101.02;
		}else {
			throw new NoBookFoundException("No Book found with given Id");
		}
		
		
	}

}
