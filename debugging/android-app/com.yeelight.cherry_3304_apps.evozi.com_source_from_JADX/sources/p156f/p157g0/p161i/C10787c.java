package p156f.p157g0.p161i;

import com.xiaomi.mipush.sdk.Constants;
import p156f.C4388s;
import p156f.p157g0.C4345c;
import p163g.C4411f;

/* renamed from: f.g0.i.c */
public final class C10787c {

    /* renamed from: d */
    public static final C4411f f20730d = C4411f.m12868h(Constants.COLON_SEPARATOR);

    /* renamed from: e */
    public static final C4411f f20731e = C4411f.m12868h(":status");

    /* renamed from: f */
    public static final C4411f f20732f = C4411f.m12868h(":method");

    /* renamed from: g */
    public static final C4411f f20733g = C4411f.m12868h(":path");

    /* renamed from: h */
    public static final C4411f f20734h = C4411f.m12868h(":scheme");

    /* renamed from: i */
    public static final C4411f f20735i = C4411f.m12868h(":authority");

    /* renamed from: a */
    public final C4411f f20736a;

    /* renamed from: b */
    public final C4411f f20737b;

    /* renamed from: c */
    final int f20738c;

    /* renamed from: f.g0.i.c$a */
    interface C10788a {
        /* renamed from: a */
        void mo34050a(C4388s sVar);
    }

    public C10787c(C4411f fVar, C4411f fVar2) {
        this.f20736a = fVar;
        this.f20737b = fVar2;
        this.f20738c = fVar.mo24297q() + 32 + fVar2.mo24297q();
    }

    public C10787c(C4411f fVar, String str) {
        this(fVar, C4411f.m12868h(str));
    }

    public C10787c(String str, String str2) {
        this(C4411f.m12868h(str), C4411f.m12868h(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10787c)) {
            return false;
        }
        C10787c cVar = (C10787c) obj;
        return this.f20736a.equals(cVar.f20736a) && this.f20737b.equals(cVar.f20737b);
    }

    public int hashCode() {
        return ((527 + this.f20736a.hashCode()) * 31) + this.f20737b.hashCode();
    }

    public String toString() {
        return C4345c.m12371r("%s: %s", this.f20736a.mo24303v(), this.f20737b.mo24303v());
    }
}
