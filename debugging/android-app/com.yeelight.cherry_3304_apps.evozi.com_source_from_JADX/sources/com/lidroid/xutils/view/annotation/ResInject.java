package com.lidroid.xutils.view.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p011c.p079c.p080a.p082b.C0986a;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ResInject {
    /* renamed from: id */
    int mo18799id();

    C0986a type();
}
