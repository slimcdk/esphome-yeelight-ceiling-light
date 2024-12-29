package com.google.firebase.p132h;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2828e;
import com.google.firebase.components.C2843n;
import com.google.firebase.p132h.C3198c;

/* renamed from: com.google.firebase.h.b */
public class C3197b implements C3198c {

    /* renamed from: a */
    private C3200d f6168a;

    private C3197b(Context context) {
        this.f6168a = C3200d.m9985a(context);
    }

    @NonNull
    /* renamed from: b */
    public static C2825d<C3198c> m9980b() {
        C2825d.C2827b<C3198c> a = C2825d.m8587a(C3198c.class);
        a.mo17084b(C2843n.m8645f(Context.class));
        a.mo17088f(C3196a.m9978b());
        return a.mo17086d();
    }

    /* renamed from: c */
    static /* synthetic */ C3198c m9981c(C2828e eVar) {
        return new C3197b((Context) eVar.mo17074a(Context.class));
    }

    @NonNull
    /* renamed from: a */
    public C3198c.C3199a mo17781a(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = this.f6168a.mo17784c(str, currentTimeMillis);
        boolean b = this.f6168a.mo17783b(currentTimeMillis);
        return (!c || !b) ? b ? C3198c.C3199a.GLOBAL : c ? C3198c.C3199a.SDK : C3198c.C3199a.NONE : C3198c.C3199a.COMBINED;
    }
}
