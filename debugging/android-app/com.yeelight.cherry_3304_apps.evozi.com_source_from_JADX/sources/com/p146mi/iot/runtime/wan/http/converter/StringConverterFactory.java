package com.p146mi.iot.runtime.wan.http.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1147y;
import p262i.C11527e;

/* renamed from: com.mi.iot.runtime.wan.http.converter.StringConverterFactory */
public final class StringConverterFactory extends C11527e.C11528a {
    /* access modifiers changed from: private */
    public static final C1138t MEDIA_TYPE = C1138t.m2782c("text/plain");

    private StringConverterFactory() {
    }

    public static StringConverterFactory create() {
        return new StringConverterFactory();
    }

    public C11527e<C0988a0, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        if (String.class.equals(type)) {
            return new C11527e<C0988a0, String>() {
                public String convert(C0988a0 a0Var) {
                    return a0Var.mo9391t();
                }
            };
        }
        return null;
    }

    public C11527e<?, C1147y> toRequestBody(Type type, Annotation[] annotationArr) {
        if (String.class.equals(type)) {
            return new C11527e<String, C1147y>() {
                public C1147y convert(String str) {
                    return C1147y.m2878c(StringConverterFactory.MEDIA_TYPE, str);
                }
            };
        }
        return null;
    }
}
