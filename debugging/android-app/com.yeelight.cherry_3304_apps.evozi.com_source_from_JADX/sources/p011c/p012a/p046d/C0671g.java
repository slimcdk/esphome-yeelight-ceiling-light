package p011c.p012a.p046d;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p011c.p012a.p046d.p047x.C0691a;
import p011c.p012a.p046d.p047x.C0711d;
import p011c.p012a.p046d.p047x.p048n.C0759l;
import p011c.p012a.p046d.p047x.p048n.C0764n;
import p011c.p012a.p046d.p051y.C0808a;

/* renamed from: c.a.d.g */
public final class C0671g {

    /* renamed from: a */
    private C0711d f397a = C0711d.f440g;

    /* renamed from: b */
    private C0685u f398b = C0685u.DEFAULT;

    /* renamed from: c */
    private C0663e f399c = C0656d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C0672h<?>> f400d = new HashMap();

    /* renamed from: e */
    private final List<C0690w> f401e = new ArrayList();

    /* renamed from: f */
    private final List<C0690w> f402f = new ArrayList();

    /* renamed from: g */
    private boolean f403g = false;

    /* renamed from: h */
    private String f404h;

    /* renamed from: i */
    private int f405i = 2;

    /* renamed from: j */
    private int f406j = 2;

    /* renamed from: k */
    private boolean f407k = false;

    /* renamed from: l */
    private boolean f408l = false;

    /* renamed from: m */
    private boolean f409m = true;

    /* renamed from: n */
    private boolean f410n = false;

    /* renamed from: o */
    private boolean f411o = false;

    /* renamed from: p */
    private boolean f412p = false;

    /* renamed from: a */
    private void m660a(String str, int i, int i2, List<C0690w> list) {
        C0653a aVar;
        C0653a aVar2;
        C0653a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new C0653a(Date.class, str);
            aVar = new C0653a(Timestamp.class, str);
            aVar3 = new C0653a(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            C0653a aVar4 = new C0653a(Date.class, i, i2);
            C0653a aVar5 = new C0653a(Timestamp.class, i, i2);
            C0653a aVar6 = new C0653a(java.sql.Date.class, i, i2);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(C0764n.m888b(Date.class, aVar2));
        list.add(C0764n.m888b(Timestamp.class, aVar));
        list.add(C0764n.m888b(java.sql.Date.class, aVar3));
    }

    /* renamed from: b */
    public C0664f mo8730b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f401e.size() + this.f402f.size() + 3);
        arrayList2.addAll(this.f401e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f402f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m660a(this.f404h, this.f405i, this.f406j, arrayList2);
        return new C0664f(this.f397a, this.f399c, this.f400d, this.f403g, this.f407k, this.f411o, this.f409m, this.f410n, this.f412p, this.f408l, this.f398b, this.f404h, this.f405i, this.f406j, this.f401e, this.f402f, arrayList);
    }

    /* renamed from: c */
    public C0671g mo8731c(Type type, Object obj) {
        boolean z = obj instanceof C0683s;
        C0691a.m699a(z || (obj instanceof C0675k) || (obj instanceof C0672h) || (obj instanceof C0688v));
        if (obj instanceof C0672h) {
            this.f400d.put(type, (C0672h) obj);
        }
        if (z || (obj instanceof C0675k)) {
            this.f401e.add(C0759l.m880f(C0808a.m1033b(type), obj));
        }
        if (obj instanceof C0688v) {
            this.f401e.add(C0764n.m887a(C0808a.m1033b(type), (C0688v) obj));
        }
        return this;
    }

    /* renamed from: d */
    public C0671g mo8732d() {
        this.f403g = true;
        return this;
    }
}
