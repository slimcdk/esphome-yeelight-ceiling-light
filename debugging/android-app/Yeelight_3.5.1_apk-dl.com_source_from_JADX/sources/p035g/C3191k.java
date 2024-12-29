package p035g;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;
import java.util.concurrent.Executor;

/* renamed from: g.k */
public final class C3191k implements C0689b<Executor> {

    /* renamed from: g.k$a */
    private static final class C3192a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3191k f5155a = new C3191k();
    }

    /* renamed from: a */
    public static C3191k m8590a() {
        return C3192a.f5155a;
    }

    /* renamed from: b */
    public static Executor m8591b() {
        return (Executor) C0691d.m537c(C3190j.m8589a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m8591b();
    }
}
