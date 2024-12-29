package com.google.gson;

import com.google.gson.internal.C2496a;
import com.google.gson.internal.C2512c;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p107v1.C3761l;
import p107v1.C3766n;
import p119y1.C3918a;

/* renamed from: com.google.gson.f */
public final class C2476f {

    /* renamed from: a */
    private C2512c f4182a = C2512c.f4245g;

    /* renamed from: b */
    private LongSerializationPolicy f4183b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c */
    private C2468d f4184c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C2477g<?>> f4185d = new HashMap();

    /* renamed from: e */
    private final List<C2536r> f4186e = new ArrayList();

    /* renamed from: f */
    private final List<C2536r> f4187f = new ArrayList();

    /* renamed from: g */
    private boolean f4188g = false;

    /* renamed from: h */
    private String f4189h;

    /* renamed from: i */
    private int f4190i = 2;

    /* renamed from: j */
    private int f4191j = 2;

    /* renamed from: k */
    private boolean f4192k = false;

    /* renamed from: l */
    private boolean f4193l = false;

    /* renamed from: m */
    private boolean f4194m = true;

    /* renamed from: n */
    private boolean f4195n = false;

    /* renamed from: o */
    private boolean f4196o = false;

    /* renamed from: p */
    private boolean f4197p = false;

    /* renamed from: a */
    private void m6707a(String str, int i, int i2, List<C2536r> list) {
        C2465a aVar;
        C2465a aVar2;
        C2465a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new C2465a(Date.class, str);
            aVar = new C2465a(Timestamp.class, str);
            aVar3 = new C2465a(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            C2465a aVar4 = new C2465a(Date.class, i, i2);
            C2465a aVar5 = new C2465a(Timestamp.class, i, i2);
            C2465a aVar6 = new C2465a(java.sql.Date.class, i, i2);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(C3766n.m10724a(Date.class, aVar2));
        list.add(C3766n.m10724a(Timestamp.class, aVar));
        list.add(C3766n.m10724a(java.sql.Date.class, aVar3));
    }

    /* renamed from: b */
    public C2469e mo19252b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f4186e.size() + this.f4187f.size() + 3);
        arrayList2.addAll(this.f4186e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f4187f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m6707a(this.f4189h, this.f4190i, this.f4191j, arrayList2);
        return new C2469e(this.f4182a, this.f4184c, this.f4185d, this.f4188g, this.f4192k, this.f4196o, this.f4194m, this.f4195n, this.f4197p, this.f4193l, this.f4183b, this.f4189h, this.f4190i, this.f4191j, this.f4186e, this.f4187f, arrayList);
    }

    /* renamed from: c */
    public C2476f mo19253c(Type type, Object obj) {
        boolean z = obj instanceof C2533p;
        C2496a.m6749a(z || (obj instanceof C2527j) || (obj instanceof C2477g) || (obj instanceof C2534q));
        if (obj instanceof C2477g) {
            this.f4185d.put(type, (C2477g) obj);
        }
        if (z || (obj instanceof C2527j)) {
            this.f4186e.add(C3761l.m10717f(C3918a.m11208b(type), obj));
        }
        if (obj instanceof C2534q) {
            this.f4186e.add(C3766n.m10726c(C3918a.m11208b(type), (C2534q) obj));
        }
        return this;
    }

    /* renamed from: d */
    public C2476f mo19254d() {
        this.f4188g = true;
        return this;
    }
}
