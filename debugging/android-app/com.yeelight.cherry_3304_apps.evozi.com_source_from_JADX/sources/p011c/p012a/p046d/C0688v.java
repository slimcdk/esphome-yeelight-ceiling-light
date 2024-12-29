package p011c.p012a.p046d;

import java.io.IOException;
import p011c.p012a.p046d.p047x.p048n.C0744f;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.v */
public abstract class C0688v<T> {

    /* renamed from: c.a.d.v$a */
    class C0689a extends C0688v<T> {
        C0689a() {
        }

        /* renamed from: b */
        public T mo8694b(C0809a aVar) {
            if (aVar.mo8861V() != C0811b.NULL) {
                return C0688v.this.mo8694b(aVar);
            }
            aVar.mo8859Q();
            return null;
        }

        /* renamed from: d */
        public void mo8695d(C0812c cVar, T t) {
            if (t == null) {
                cVar.mo8874D();
            } else {
                C0688v.this.mo8695d(cVar, t);
            }
        }
    }

    /* renamed from: a */
    public final C0688v<T> mo8769a() {
        return new C0689a();
    }

    /* renamed from: b */
    public abstract T mo8694b(C0809a aVar);

    /* renamed from: c */
    public final C0676l mo8770c(T t) {
        try {
            C0744f fVar = new C0744f();
            mo8695d(fVar, t);
            return fVar.mo8880b0();
        } catch (IOException e) {
            throw new C0677m((Throwable) e);
        }
    }

    /* renamed from: d */
    public abstract void mo8695d(C0812c cVar, T t);
}
