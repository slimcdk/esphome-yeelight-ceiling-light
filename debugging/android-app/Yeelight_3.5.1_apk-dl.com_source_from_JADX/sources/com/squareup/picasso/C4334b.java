package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.b */
class C4334b extends C4365s {

    /* renamed from: b */
    private static final int f7160b = 22;

    /* renamed from: a */
    private final AssetManager f7161a;

    public C4334b(Context context) {
        this.f7161a = context.getAssets();
    }

    /* renamed from: j */
    static String m12282j(C4361q qVar) {
        return qVar.f7242d.toString().substring(f7160b);
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        Uri uri = qVar.f7242d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        return new C4365s.C4366a(this.f7161a.open(m12282j(qVar)), Picasso.LoadedFrom.DISK);
    }
}
