package com.lidroid.xutils.p021db.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.lidroid.xutils.db.annotation.Foreign */
public @interface Foreign {
    String column() default "";

    String foreign();
}
