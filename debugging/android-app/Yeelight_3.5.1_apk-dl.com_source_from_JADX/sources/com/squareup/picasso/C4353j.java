package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.j */
class C4353j extends C4346g {
    C4353j(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m12348k(Uri uri) {
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
    public boolean mo28100c(C4361q qVar) {
        return "file".equals(qVar.f7242d.getScheme());
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        return new C4365s.C4366a((Bitmap) null, mo28165j(qVar), Picasso.LoadedFrom.DISK, m12348k(qVar.f7242d));
    }
}
