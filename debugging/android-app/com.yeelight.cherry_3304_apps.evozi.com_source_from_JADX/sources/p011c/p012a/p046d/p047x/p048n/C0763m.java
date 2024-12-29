package p011c.p012a.p046d.p047x.p048n;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.p047x.p048n.C0751i;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.m */
final class C0763m<T> extends C0688v<T> {

    /* renamed from: a */
    private final C0664f f547a;

    /* renamed from: b */
    private final C0688v<T> f548b;

    /* renamed from: c */
    private final Type f549c;

    C0763m(C0664f fVar, C0688v<T> vVar, Type type) {
        this.f547a = fVar;
        this.f548b = vVar;
        this.f549c = type;
    }

    /* renamed from: e */
    private Type m884e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: b */
    public T mo8694b(C0809a aVar) {
        return this.f548b.mo8694b(aVar);
    }

    /* renamed from: d */
    public void mo8695d(C0812c cVar, T t) {
        C0688v<T> vVar = this.f548b;
        Type e = m884e(this.f549c, t);
        if (e != this.f549c) {
            vVar = this.f547a.mo8706k(C0808a.m1033b(e));
            if (vVar instanceof C0751i.C0753b) {
                C0688v<T> vVar2 = this.f548b;
                if (!(vVar2 instanceof C0751i.C0753b)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.mo8695d(cVar, t);
    }
}
