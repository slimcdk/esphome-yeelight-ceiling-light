package p039h;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import p191o4.C9779a;

/* renamed from: h.g */
public final class C3228g implements C0689b<C3226f> {

    /* renamed from: a */
    private final C9779a<Context> f5211a;

    /* renamed from: b */
    private final C9779a<C3224d> f5212b;

    public C3228g(C9779a<Context> aVar, C9779a<C3224d> aVar2) {
        this.f5211a = aVar;
        this.f5212b = aVar2;
    }

    /* renamed from: a */
    public static C3228g m8676a(C9779a<Context> aVar, C9779a<C3224d> aVar2) {
        return new C3228g(aVar, aVar2);
    }

    /* renamed from: c */
    public static C3226f m8677c(Context context, Object obj) {
        return new C3226f(context, (C3224d) obj);
    }

    /* renamed from: b */
    public C3226f get() {
        return m8677c(this.f5211a.get(), this.f5212b.get());
    }
}
