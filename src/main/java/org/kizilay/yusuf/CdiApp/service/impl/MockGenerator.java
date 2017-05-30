package org.kizilay.yusuf.CdiApp.service.impl;

import java.util.Random;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.jboss.logging.Logger;
import org.kizilay.yusuf.CdiApp.interceptors.Loggable;
import org.kizilay.yusuf.CdiApp.qualifiers.ThirteenDigits;
import org.kizilay.yusuf.CdiApp.service.NumberGenerator;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {
		String mock = "Mock-" + Math.abs(new Random().nextInt());
		logger.info("Generated Mock: " + mock);
		return mock;
	}

}
