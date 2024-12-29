package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.g */
class C4346g extends C4365s {

    /* renamed from: a */
    final Context f7192a;

    C4346g(Context context) {
        this.f7192a = context;
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        return "content".equals(qVar.f7242d.getScheme());
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        return new C4365s.C4366a(mo28165j(qVar), Picasso.LoadedFrom.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream mo28165j(C4361q qVar) {
        return this.f7192a.getContentResolver().openInputStream(qVar.f7242d);
    }
}
