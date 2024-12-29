package p129b4;

import p051j4.C9189e;
import p134c4.C4006a;
import retrofit2.C3667k;

/* renamed from: b4.d */
public class C3994d {

    /* renamed from: c */
    private static final String f6752c = "d";

    /* renamed from: a */
    private C3667k f6753a;

    /* renamed from: b */
    private C4006a f6754b;

    /* renamed from: b4.d$b */
    private static class C3996b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3994d f6755a = new C3994d();
    }

    private C3994d() {
        m11610c();
    }

    /* renamed from: b */
    public static C3994d m11609b() {
        return C3996b.f6755a;
    }

    /* renamed from: c */
    private void m11610c() {
        try {
            C3667k c = new C3667k.C3669b().mo26057a("https://www.yeelight.com").mo26061e(C3987a.m11563c().mo26570a()).mo26059c();
            this.f6753a = c;
            this.f6754b = (C4006a) c.mo26048d(C4006a.class);
        } catch (Exception e) {
            String str = f6752c;
            C9189e.m22139b(str, "create failure：" + e.getMessage());
        }
    }

    /* renamed from: a */
    public C4006a mo26585a() {
        return this.f6754b;
    }
}
