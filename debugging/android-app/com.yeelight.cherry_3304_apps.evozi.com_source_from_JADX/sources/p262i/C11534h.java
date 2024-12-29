package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p011c.p012a.p046d.C0664f;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1147y;
import p262i.C11527e;

/* renamed from: i.h */
public final class C11534h extends C11527e.C11528a {

    /* renamed from: a */
    private final C0664f f22897a;

    private C11534h(C0664f fVar) {
        if (fVar != null) {
            this.f22897a = fVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public static C11534h m30263a() {
        return m30264b(new C0664f());
    }

    /* renamed from: b */
    public static C11534h m30264b(C0664f fVar) {
        return new C11534h(fVar);
    }

    public C11527e<C0988a0, ?> fromResponseBody(Type type, Annotation[] annotationArr) {
        return new C11536j(this.f22897a, type);
    }

    public C11527e<?, C1147y> toRequestBody(Type type, Annotation[] annotationArr) {
        return new C11535i(this.f22897a, type);
    }
}
