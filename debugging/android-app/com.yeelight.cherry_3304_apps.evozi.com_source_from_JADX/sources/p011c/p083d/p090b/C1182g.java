package p011c.p083d.p090b;

import android.content.Context;
import java.io.InputStream;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.g */
class C1182g extends C1220y {

    /* renamed from: a */
    final Context f1992a;

    C1182g(Context context) {
        this.f1992a = context;
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        return "content".equals(wVar.f2107d.getScheme());
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        return new C1220y.C1221a(mo9955j(wVar), C1203t.C1209e.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream mo9955j(C1216w wVar) {
        return this.f1992a.getContentResolver().openInputStream(wVar.f2107d);
    }
}
