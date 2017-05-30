package org.kizilay.yusuf.CdiApp.service;

import javax.inject.Inject;

import org.kizilay.yusuf.CdiApp.interceptors.Loggable;
import org.kizilay.yusuf.CdiApp.model.Book;
import org.kizilay.yusuf.CdiApp.qualifiers.ThirteenDigits;

@Loggable
public class BookService {

	@Inject
	@ThirteenDigits
	private NumberGenerator numberGenerator;

	public Book createBook(String title, Float price, String description){
		Book book= new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}

}
