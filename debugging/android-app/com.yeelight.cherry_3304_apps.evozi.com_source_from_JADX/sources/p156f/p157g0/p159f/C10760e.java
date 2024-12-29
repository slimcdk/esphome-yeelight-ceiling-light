package p156f.p157g0.p159f;

import java.io.IOException;
import p156f.p157g0.C4345c;

/* renamed from: f.g0.f.e */
public final class C10760e extends RuntimeException {

    /* renamed from: a */
    private IOException f20642a;

    /* renamed from: b */
    private IOException f20643b;

    public C10760e(IOException iOException) {
        super(iOException);
        this.f20642a = iOException;
        this.f20643b = iOException;
    }

    /* renamed from: a */
    public void mo33992a(IOException iOException) {
        C4345c.m12354a(this.f20642a, iOException);
        this.f20643b = iOException;
    }

    /* renamed from: b */
    public IOException mo33993b() {
        return this.f20642a;
    }

    /* renamed from: c */
    public IOException mo33994c() {
        return this.f20643b;
    }
}
