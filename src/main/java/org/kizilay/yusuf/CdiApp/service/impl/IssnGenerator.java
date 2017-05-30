package org.kizilay.yusuf.CdiApp.service.impl;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.kizilay.yusuf.CdiApp.interceptors.Loggable;
import org.kizilay.yusuf.CdiApp.qualifiers.EightDigits;
import org.kizilay.yusuf.CdiApp.service.NumberGenerator;

@EightDigits
public class IssnGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Generated ISSN: " + issn);

		return issn;
	}

}
