package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.stream.C2537a;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p107v1.C3753i;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: v1.m */
final class C3765m<T> extends C2534q<T> {

    /* renamed from: a */
    private final C2469e f6324a;

    /* renamed from: b */
    private final C2534q<T> f6325b;

    /* renamed from: c */
    private final Type f6326c;

    C3765m(C2469e eVar, C2534q<T> qVar, Type type) {
        this.f6324a = eVar;
        this.f6325b = qVar;
        this.f6326c = type;
    }

    /* renamed from: e */
    private Type m10721e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: b */
    public T mo19209b(C3929a aVar) {
        return this.f6325b.mo19209b(aVar);
    }

    /* renamed from: d */
    public void mo19210d(C2537a aVar, T t) {
        C2534q<T> qVar = this.f6325b;
        Type e = m10721e(this.f6326c, t);
        if (e != this.f6326c) {
            qVar = this.f6324a.mo19229l(C3918a.m11208b(e));
            if (qVar instanceof C3753i.C3755b) {
                C2534q<T> qVar2 = this.f6325b;
                if (!(qVar2 instanceof C3753i.C3755b)) {
                    qVar = qVar2;
                }
            }
        }
        qVar.mo19210d(aVar, t);
    }
}
