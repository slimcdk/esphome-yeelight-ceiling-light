package p225w5;

import java.util.Locale;
import org.eclipse.jetty.util.C9984h;

/* renamed from: w5.f */
public class C11944f extends C9984h {

    /* renamed from: p */
    C11940d f21827p;

    /* renamed from: q */
    String f21828q;

    public C11944f(String str, Locale locale) {
        super(str, locale);
    }

    /* renamed from: g */
    public synchronized C11940d mo42466g(long j) {
        String a = super.mo40244a(j);
        if (a == this.f21828q) {
            return this.f21827p;
        }
        this.f21828q = a;
        C11946h hVar = new C11946h(a);
        this.f21827p = hVar;
        return hVar;
    }
}
