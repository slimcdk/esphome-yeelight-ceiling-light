package p011c.p083d.p090b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.b */
class C1158b extends C1220y {

    /* renamed from: b */
    private static final int f1941b = 22;

    /* renamed from: a */
    private final AssetManager f1942a;

    public C1158b(Context context) {
        this.f1942a = context.getAssets();
    }

    /* renamed from: j */
    static String m2967j(C1216w wVar) {
        return wVar.f2107d.toString().substring(f1941b);
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        Uri uri = wVar.f2107d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        return new C1220y.C1221a(this.f1942a.open(m2967j(wVar)), C1203t.C1209e.DISK);
    }
}
