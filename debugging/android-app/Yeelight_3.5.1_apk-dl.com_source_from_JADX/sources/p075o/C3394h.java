package p075o;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;
import p191o4.C9779a;

/* renamed from: o.h */
public final class C3394h implements C0689b<String> {

    /* renamed from: a */
    private final C9779a<Context> f5516a;

    public C3394h(C9779a<Context> aVar) {
        this.f5516a = aVar;
    }

    /* renamed from: a */
    public static C3394h m9278a(C9779a<Context> aVar) {
        return new C3394h(aVar);
    }

    /* renamed from: c */
    public static String m9279c(Context context) {
        return (String) C0691d.m537c(C3391f.m9271b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m9279c(this.f5516a.get());
    }
}
