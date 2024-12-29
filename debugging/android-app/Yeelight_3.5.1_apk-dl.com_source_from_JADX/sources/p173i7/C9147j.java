package p173i7;

import com.google.gson.C2469e;
import com.squareup.okhttp.C4321y;
import java.io.Reader;
import java.lang.reflect.Type;

/* renamed from: i7.j */
final class C9147j<T> implements C9138e<C4321y, T> {

    /* renamed from: a */
    private final C2469e f16914a;

    /* renamed from: b */
    private final Type f16915b;

    C9147j(C2469e eVar, Type type) {
        this.f16914a = eVar;
        this.f16915b = type;
    }

    /* renamed from: a */
    public T convert(C4321y yVar) {
        Reader d = yVar.mo28088d();
        try {
            return this.f16914a.mo19224g(d, this.f16915b);
        } finally {
            C9177t.m22061b(d);
        }
    }
}
