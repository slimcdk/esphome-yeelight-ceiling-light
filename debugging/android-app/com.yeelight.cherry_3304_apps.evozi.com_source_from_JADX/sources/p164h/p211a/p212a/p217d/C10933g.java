package p164h.p211a.p212a.p217d;

import java.util.Locale;
import p164h.p211a.p212a.p228h.C11120h;

/* renamed from: h.a.a.d.g */
public class C10933g extends C11120h {

    /* renamed from: p */
    C10929e f21314p;

    /* renamed from: q */
    String f21315q;

    public C10933g(String str, Locale locale) {
        super(str, locale);
    }

    /* renamed from: g */
    public synchronized C10929e mo34623g(long j) {
        String a = super.mo35357a(j);
        if (a == this.f21315q) {
            return this.f21314p;
        }
        this.f21315q = a;
        C10938k kVar = new C10938k(a);
        this.f21314p = kVar;
        return kVar;
    }
}
