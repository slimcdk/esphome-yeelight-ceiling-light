package p225w5;

import java.io.IOException;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: w5.b */
public abstract class C11938b implements C11949j {

    /* renamed from: c */
    private static final C9003c f21819c = C9001b.m21450a(C11938b.class);

    /* renamed from: a */
    private final long f21820a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C11950k f21821b;

    public C11938b(C11950k kVar) {
        this.f21821b = kVar;
        this.f21820a = System.currentTimeMillis();
    }

    public C11938b(C11950k kVar, long j) {
        this.f21821b = kVar;
        this.f21820a = j;
    }

    /* renamed from: b */
    public long mo42446b() {
        return this.f21820a;
    }

    /* renamed from: f */
    public void mo42447f(long j) {
        try {
            f21819c.mo36850e("onIdleExpired {}ms {} {}", Long.valueOf(j), this, this.f21821b);
            if (!this.f21821b.mo39669s()) {
                if (!this.f21821b.mo39668r()) {
                    this.f21821b.mo39670t();
                    return;
                }
            }
            this.f21821b.close();
        } catch (IOException e) {
            f21819c.mo36849d(e);
            try {
                this.f21821b.close();
            } catch (IOException e2) {
                f21819c.mo36849d(e2);
            }
        }
    }

    /* renamed from: g */
    public C11950k mo42448g() {
        return this.f21821b;
    }

    public String toString() {
        return String.format("%s@%x", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode())});
    }
}
