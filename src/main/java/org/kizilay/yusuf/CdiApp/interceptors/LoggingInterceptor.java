package org.kizilay.yusuf.CdiApp.interceptors;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	public Object logMethod(InvocationContext invocationContext) throws Exception {

		logger.entering(invocationContext.getTarget().getClass().getName(), invocationContext.getMethod().getName());

		try {
			return invocationContext.proceed();
		} finally {
			logger.exiting(invocationContext.getTarget().getClass().getName(), invocationContext.getMethod().getName());
		}

	}

}
