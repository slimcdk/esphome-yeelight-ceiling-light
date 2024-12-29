package p075o;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;

/* renamed from: o.g */
public final class C3392g implements C0689b<String> {

    /* renamed from: o.g$a */
    private static final class C3393a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3392g f5515a = new C3392g();
    }

    /* renamed from: a */
    public static C3392g m9274a() {
        return C3393a.f5515a;
    }

    /* renamed from: b */
    public static String m9275b() {
        return (String) C0691d.m537c(C3391f.m9270a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return m9275b();
    }
}
