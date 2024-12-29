package p164h.p165b.p166a.p240h;

import java.util.Date;

/* renamed from: h.b.a.h.d */
public class C11214d {

    /* renamed from: c */
    private static String f22288c = "d";

    /* renamed from: a */
    private int f22289a = 0;

    /* renamed from: b */
    private long f22290b = mo35634a();

    public C11214d() {
    }

    public C11214d(int i) {
        this.f22289a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo35634a() {
        return new Date().getTime() / 1000;
    }

    /* renamed from: b */
    public int mo35635b() {
        return this.f22289a;
    }

    /* renamed from: c */
    public long mo35636c() {
        int i = this.f22289a;
        if (i == 0) {
            return 2147483647L;
        }
        return (this.f22290b + ((long) i)) - mo35634a();
    }

    /* renamed from: d */
    public boolean mo35637d() {
        return mo35638e(false);
    }

    /* renamed from: e */
    public boolean mo35638e(boolean z) {
        int i = this.f22289a;
        if (i != 0) {
            if (this.f22290b + ((long) (i / (z ? 2 : 1))) < mo35634a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo35639f(long j) {
        this.f22290b = j;
    }

    /* renamed from: g */
    public void mo35640g() {
        mo35639f(mo35634a());
    }

    public String toString() {
        return "(" + f22288c + ")" + " MAX AGE: " + this.f22289a;
    }
}
