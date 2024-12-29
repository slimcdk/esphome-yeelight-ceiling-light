package p011c.p083d.p090b;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.k */
class C1192k extends C1182g {
    C1192k(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m3073k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        return "file".equals(wVar.f2107d.getScheme());
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        return new C1220y.C1221a((Bitmap) null, mo9955j(wVar), C1203t.C1209e.DISK, m3073k(wVar.f2107d));
    }
}
