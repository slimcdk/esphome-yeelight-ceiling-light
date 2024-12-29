package com.p022mi.iot.runtime.wan.http.converter;

import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4321y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p173i7.C9138e;

/* renamed from: com.mi.iot.runtime.wan.http.converter.StringConverterFactory */
public final class StringConverterFactory extends C9138e.C9139a {
    /* access modifiers changed from: private */
    public static final C4307s MEDIA_TYPE = C4307s.m12062c("text/plain");

    private StringConverterFactory() {
    }

    public static StringConverterFactory create() {
        return new StringConverterFactory();
    }

    public C9138e<C4321y, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        if (String.class.equals(type)) {
            return new C9138e<C4321y, String>() {
                public String convert(C4321y yVar) {
                    return yVar.mo28089n();
                }
            };
        }
        return null;
    }

    public C9138e<?, C4315w> toRequestBody(Type type, Annotation[] annotationArr) {
        if (String.class.equals(type)) {
            return new C9138e<String, C4315w>() {
                public C4315w convert(String str) {
                    return C4315w.m12157c(StringConverterFactory.MEDIA_TYPE, str);
                }
            };
        }
        return null;
    }
}
