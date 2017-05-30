package org.kizilay.yusuf.CdiApp.interceptors;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ METHOD, TYPE })
public @interface Loggable {

}
