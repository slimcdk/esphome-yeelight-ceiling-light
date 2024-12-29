package p039h;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C0687e;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;
import p083q.C3604a;

/* renamed from: h.d */
class C3224d {

    /* renamed from: a */
    private final Context f5200a;

    /* renamed from: b */
    private final C3604a f5201b;

    /* renamed from: c */
    private final C3604a f5202c;

    @Inject
    C3224d(Context context, @WallTime C3604a aVar, @Monotonic C3604a aVar2) {
        this.f5200a = context;
        this.f5201b = aVar;
        this.f5202c = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0687e mo23780a(String str) {
        return C0687e.m526a(this.f5200a, this.f5201b, this.f5202c, str);
    }
}
