package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.t */
class C4367t extends C4365s {

    /* renamed from: a */
    private final Context f7289a;

    C4367t(Context context) {
        this.f7289a = context;
    }

    /* renamed from: j */
    private static Bitmap m12403j(Resources resources, int i, C4361q qVar) {
        BitmapFactory.Options d = C4365s.m12392d(qVar);
        if (C4365s.m12393g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            C4365s.m12391b(qVar.f7246h, qVar.f7247i, d, qVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        if (qVar.f7243e != 0) {
            return true;
        }
        return "android.resource".equals(qVar.f7242d.getScheme());
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        Resources o = C4376y.m12441o(this.f7289a, qVar);
        return new C4365s.C4366a(m12403j(o, C4376y.m12440n(o, qVar), qVar), Picasso.LoadedFrom.DISK);
    }
}
