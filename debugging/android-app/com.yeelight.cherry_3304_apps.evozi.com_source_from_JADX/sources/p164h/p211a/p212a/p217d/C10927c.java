package p164h.p211a.p212a.p217d;

import java.io.IOException;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.c */
public abstract class C10927c implements C10941m {

    /* renamed from: c */
    private static final C11158c f21306c = C11156b.m29015a(C10927c.class);

    /* renamed from: a */
    private final long f21307a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C10942n f21308b;

    public C10927c(C10942n nVar) {
        this.f21308b = nVar;
        this.f21307a = System.currentTimeMillis();
    }

    public C10927c(C10942n nVar, long j) {
        this.f21308b = nVar;
        this.f21307a = j;
    }

    /* renamed from: b */
    public long mo34603b() {
        return this.f21307a;
    }

    /* renamed from: f */
    public void mo34604f(long j) {
        try {
            f21306c.mo35489e("onIdleExpired {}ms {} {}", Long.valueOf(j), this, this.f21308b);
            if (!this.f21308b.mo34369s()) {
                if (!this.f21308b.mo34368r()) {
                    this.f21308b.mo34370t();
                    return;
                }
            }
            this.f21308b.close();
        } catch (IOException e) {
            f21306c.mo35488d(e);
            try {
                this.f21308b.close();
            } catch (IOException e2) {
                f21306c.mo35488d(e2);
            }
        }
    }

    /* renamed from: g */
    public C10942n mo34605g() {
        return this.f21308b;
    }

    public String toString() {
        return String.format("%s@%x", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode())});
    }
}
