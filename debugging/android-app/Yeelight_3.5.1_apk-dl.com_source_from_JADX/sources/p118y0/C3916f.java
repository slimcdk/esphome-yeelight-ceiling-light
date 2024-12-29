package p118y0;

import android.util.Log;

/* renamed from: y0.f */
public class C3916f {

    /* renamed from: c */
    static final C3916f f6556c = new C3916f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f6557a;

    /* renamed from: b */
    private int f6558b = 4;

    public C3916f(String str) {
        this.f6557a = str;
    }

    /* renamed from: a */
    private boolean m11189a(int i) {
        return this.f6558b <= i || Log.isLoggable(this.f6557a, i);
    }

    /* renamed from: f */
    public static C3916f m11190f() {
        return f6556c;
    }

    /* renamed from: b */
    public void mo26399b(String str) {
        mo26400c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo26400c(String str, Throwable th) {
        m11189a(3);
    }

    /* renamed from: d */
    public void mo26401d(String str) {
        mo26402e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo26402e(String str, Throwable th) {
        m11189a(6);
    }

    /* renamed from: g */
    public void mo26403g(String str) {
        mo26404h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo26404h(String str, Throwable th) {
        m11189a(4);
    }

    /* renamed from: i */
    public void mo26405i(String str) {
        mo26406j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo26406j(String str, Throwable th) {
        m11189a(2);
    }

    /* renamed from: k */
    public void mo26407k(String str) {
        mo26408l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo26408l(String str, Throwable th) {
        m11189a(5);
    }
}
