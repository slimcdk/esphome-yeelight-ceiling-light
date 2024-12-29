package p173i7;

import com.google.gson.C2469e;
import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4321y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import p173i7.C9138e;

/* renamed from: i7.h */
public final class C9145h extends C9138e.C9139a {

    /* renamed from: a */
    private final C2469e f16909a;

    private C9145h(C2469e eVar) {
        Objects.requireNonNull(eVar, "gson == null");
        this.f16909a = eVar;
    }

    /* renamed from: a */
    public static C9145h m21971a() {
        return m21972b(new C2469e());
    }

    /* renamed from: b */
    public static C9145h m21972b(C2469e eVar) {
        return new C9145h(eVar);
    }

    public C9138e<C4321y, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        return new C9147j(this.f16909a, type);
    }

    public C9138e<?, C4315w> toRequestBody(Type type, Annotation[] annotationArr) {
        return new C9146i(this.f16909a, type);
    }
}
