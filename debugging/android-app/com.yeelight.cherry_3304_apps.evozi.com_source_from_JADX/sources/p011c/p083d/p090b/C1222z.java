package p011c.p083d.p090b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.z */
class C1222z extends C1220y {

    /* renamed from: a */
    private final Context f2154a;

    C1222z(Context context) {
        this.f2154a = context;
    }

    /* renamed from: j */
    private static Bitmap m3162j(Resources resources, int i, C1216w wVar) {
        BitmapFactory.Options d = C1220y.m3151d(wVar);
        if (C1220y.m3152g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            C1220y.m3150b(wVar.f2111h, wVar.f2112i, d, wVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        if (wVar.f2108e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f2107d.getScheme());
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        Resources o = C1173e0.m3024o(this.f2154a, wVar);
        return new C1220y.C1221a(m3162j(o, C1173e0.m3023n(o, wVar), wVar), C1203t.C1209e.DISK);
    }
}
