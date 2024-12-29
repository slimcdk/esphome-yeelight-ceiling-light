package okio;

import java.util.concurrent.TimeUnit;

/* renamed from: okio.i */
public class C9842i extends C9854s {

    /* renamed from: e */
    private C9854s f17831e;

    public C9842i(C9854s sVar) {
        if (sVar != null) {
            this.f17831e = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public C9854s mo39085a() {
        return this.f17831e.mo39085a();
    }

    /* renamed from: b */
    public C9854s mo39086b() {
        return this.f17831e.mo39086b();
    }

    /* renamed from: c */
    public long mo39087c() {
        return this.f17831e.mo39087c();
    }

    /* renamed from: d */
    public C9854s mo39088d(long j) {
        return this.f17831e.mo39088d(j);
    }

    /* renamed from: e */
    public boolean mo39089e() {
        return this.f17831e.mo39089e();
    }

    /* renamed from: f */
    public void mo39090f() {
        this.f17831e.mo39090f();
    }

    /* renamed from: g */
    public C9854s mo39091g(long j, TimeUnit timeUnit) {
        return this.f17831e.mo39091g(j, timeUnit);
    }

    /* renamed from: i */
    public final C9854s mo39092i() {
        return this.f17831e;
    }

    /* renamed from: j */
    public final C9842i mo39093j(C9854s sVar) {
        if (sVar != null) {
            this.f17831e = sVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
