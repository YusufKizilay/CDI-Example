package org.kizilay.yusuf.CdiApp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.kizilay.yusuf.CdiApp.model.Book;
import org.kizilay.yusuf.CdiApp.service.BookService;

public class MainClass {

	public static void main(String[] args) {

		Weld weld = new Weld();
		WeldContainer container = weld.initialize();

		BookService bookService = container.instance().select(BookService.class).get();

		Float price = new Float(12.5);

		Book book = bookService.createBook("H2G2", price, "Geeky scifi Book");

		System.out.println(book);

	}

}
