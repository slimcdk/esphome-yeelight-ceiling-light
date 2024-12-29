package p039h;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: h.e */
public final class C3225e implements C0689b<C3224d> {

    /* renamed from: a */
    private final C9779a<Context> f5203a;

    /* renamed from: b */
    private final C9779a<C3604a> f5204b;

    /* renamed from: c */
    private final C9779a<C3604a> f5205c;

    public C3225e(C9779a<Context> aVar, C9779a<C3604a> aVar2, C9779a<C3604a> aVar3) {
        this.f5203a = aVar;
        this.f5204b = aVar2;
        this.f5205c = aVar3;
    }

    /* renamed from: a */
    public static C3225e m8669a(C9779a<Context> aVar, C9779a<C3604a> aVar2, C9779a<C3604a> aVar3) {
        return new C3225e(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C3224d m8670c(Context context, C3604a aVar, C3604a aVar2) {
        return new C3224d(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C3224d get() {
        return m8670c(this.f5203a.get(), this.f5204b.get(), this.f5205c.get());
    }
}
