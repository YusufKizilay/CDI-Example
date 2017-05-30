package org.kizilay.yusuf.CdiApp.service.impl;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.kizilay.yusuf.CdiApp.interceptors.Loggable;
import org.kizilay.yusuf.CdiApp.qualifiers.ThirteenDigits;
import org.kizilay.yusuf.CdiApp.service.NumberGenerator;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {

		String isbn = "13-84356" + Math.abs(new Random().nextInt());
		logger.info("Generated ISBN: " + isbn);
		return isbn;
	}

}
