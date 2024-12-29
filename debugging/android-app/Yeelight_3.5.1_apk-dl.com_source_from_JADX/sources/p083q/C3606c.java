package p083q;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;

/* renamed from: q.c */
public final class C3606c implements C0689b<C3604a> {

    /* renamed from: q.c$a */
    private static final class C3607a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3606c f6014a = new C3606c();
    }

    /* renamed from: a */
    public static C3606c m10258a() {
        return C3607a.f6014a;
    }

    /* renamed from: b */
    public static C3604a m10259b() {
        return (C3604a) C0691d.m537c(C3605b.m10256a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C3604a get() {
        return m10259b();
    }
}
