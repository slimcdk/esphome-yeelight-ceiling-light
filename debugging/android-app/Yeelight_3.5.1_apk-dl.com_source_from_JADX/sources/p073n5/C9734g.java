package p073n5;

import java.util.List;
import okhttp3.C3509b0;
import okhttp3.C3537p;
import okhttp3.C3558z;
import okhttp3.C9796e;
import okhttp3.C9801i;
import okhttp3.C9834u;
import okhttp3.internal.connection.C3526a;
import p186m5.C9554e;

/* renamed from: n5.g */
public final class C9734g implements C9834u.C9835a {

    /* renamed from: a */
    private final List<C9834u> f17549a;

    /* renamed from: b */
    private final C9554e f17550b;

    /* renamed from: c */
    private final C9729c f17551c;

    /* renamed from: d */
    private final C3526a f17552d;

    /* renamed from: e */
    private final int f17553e;

    /* renamed from: f */
    private final C3558z f17554f;

    /* renamed from: g */
    private final C9796e f17555g;

    /* renamed from: h */
    private final C3537p f17556h;

    /* renamed from: i */
    private final int f17557i;

    /* renamed from: j */
    private final int f17558j;

    /* renamed from: k */
    private final int f17559k;

    /* renamed from: l */
    private int f17560l;

    public C9734g(List<C9834u> list, C9554e eVar, C9729c cVar, C3526a aVar, int i, C3558z zVar, C9796e eVar2, C3537p pVar, int i2, int i3, int i4) {
        this.f17549a = list;
        this.f17552d = aVar;
        this.f17550b = eVar;
        this.f17551c = cVar;
        this.f17553e = i;
        this.f17554f = zVar;
        this.f17555g = eVar2;
        this.f17556h = pVar;
        this.f17557i = i2;
        this.f17558j = i3;
        this.f17559k = i4;
    }

    /* renamed from: a */
    public C3558z mo38901a() {
        return this.f17554f;
    }

    /* renamed from: b */
    public int mo38902b() {
        return this.f17558j;
    }

    /* renamed from: c */
    public int mo38903c() {
        return this.f17559k;
    }

    /* renamed from: d */
    public C3509b0 mo38904d(C3558z zVar) {
        return mo38910j(zVar, this.f17550b, this.f17551c, this.f17552d);
    }

    /* renamed from: e */
    public int mo38905e() {
        return this.f17557i;
    }

    /* renamed from: f */
    public C9796e mo38906f() {
        return this.f17555g;
    }

    /* renamed from: g */
    public C9801i mo38907g() {
        return this.f17552d;
    }

    /* renamed from: h */
    public C3537p mo38908h() {
        return this.f17556h;
    }

    /* renamed from: i */
    public C9729c mo38909i() {
        return this.f17551c;
    }

    /* renamed from: j */
    public C3509b0 mo38910j(C3558z zVar, C9554e eVar, C9729c cVar, C3526a aVar) {
        if (this.f17553e < this.f17549a.size()) {
            this.f17560l++;
            if (this.f17551c != null && !this.f17552d.mo24454s(zVar.mo24660i())) {
                throw new IllegalStateException("network interceptor " + this.f17549a.get(this.f17553e - 1) + " must retain the same host and port");
            } else if (this.f17551c == null || this.f17560l <= 1) {
                C9734g gVar = new C9734g(this.f17549a, eVar, cVar, aVar, this.f17553e + 1, zVar, this.f17555g, this.f17556h, this.f17557i, this.f17558j, this.f17559k);
                C9834u uVar = this.f17549a.get(this.f17553e);
                C3509b0 a = uVar.mo35530a(gVar);
                if (cVar != null && this.f17553e + 1 < this.f17549a.size() && gVar.f17560l != 1) {
                    throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + uVar + " returned null");
                } else if (a.mo24356a() != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f17549a.get(this.f17553e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: k */
    public C9554e mo38911k() {
        return this.f17550b;
    }
}
