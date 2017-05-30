package org.kizilay.yusuf.CdiApp.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.*;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, TYPE, METHOD })
public @interface EightDigits {

}
