package p262i;

import java.io.Reader;
import java.lang.reflect.Type;
import p011c.p012a.p046d.C0664f;
import p011c.p083d.p084a.C0988a0;

/* renamed from: i.j */
final class C11536j<T> implements C11527e<C0988a0, T> {

    /* renamed from: a */
    private final C0664f f22902a;

    /* renamed from: b */
    private final Type f22903b;

    C11536j(C0664f fVar, Type type) {
        this.f22902a = fVar;
        this.f22903b = type;
    }

    /* renamed from: a */
    public T convert(C0988a0 a0Var) {
        Reader g = a0Var.mo9387g();
        try {
            return this.f22902a.mo8703h(g, this.f22903b);
        } finally {
            C11566t.m30353b(g);
        }
    }
}
