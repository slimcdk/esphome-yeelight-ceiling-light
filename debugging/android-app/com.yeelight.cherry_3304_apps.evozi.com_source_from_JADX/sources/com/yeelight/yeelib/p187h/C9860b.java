package com.yeelight.yeelib.p187h;

import com.yeelight.yeelib.p152f.C9773b;
import com.yeelight.yeelib.p187h.p188c.C9861a;
import com.yeelight.yeelib.utils.C10548o;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p156f.C4325c;
import p156f.C4396x;

/* renamed from: com.yeelight.yeelib.h.b */
public class C9860b {

    /* renamed from: a */
    private C4396x.C4398b f17918a = m24127b();

    /* renamed from: b */
    private C4396x.C4398b m24127b() {
        C4396x.C4398b bVar = new C4396x.C4398b();
        bVar.mo24173a(new C9861a());
        bVar.mo24177e(20000, TimeUnit.MILLISECONDS);
        bVar.mo24179g(20000, TimeUnit.MILLISECONDS);
        bVar.mo24182j(20000, TimeUnit.MILLISECONDS);
        bVar.mo24180h(true);
        bVar.mo24175c(new C4325c(new File(C10548o.m25764f()), 10485760));
        C9773b a = C9871g.m24179a();
        bVar.mo24181i(a, a.mo31601a());
        bVar.mo24178f(C9871g.m24180b());
        return bVar;
    }

    /* renamed from: c */
    public static C9860b m24128c() {
        return new C9860b();
    }

    /* renamed from: a */
    public C4396x mo31915a() {
        return this.f17918a.mo24174b();
    }
}
