package com.google.gson.internal;

import com.google.gson.C2466b;
import com.google.gson.C2467c;
import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.stream.C2537a;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p119y1.C3918a;
import p122z1.C3929a;

/* renamed from: com.google.gson.internal.c */
public final class C2512c implements C2536r, Cloneable {

    /* renamed from: g */
    public static final C2512c f4245g = new C2512c();

    /* renamed from: a */
    private double f4246a = -1.0d;

    /* renamed from: b */
    private int f4247b = 136;

    /* renamed from: c */
    private boolean f4248c = true;

    /* renamed from: d */
    private boolean f4249d;

    /* renamed from: e */
    private List<C2466b> f4250e = Collections.emptyList();

    /* renamed from: f */
    private List<C2466b> f4251f = Collections.emptyList();

    /* renamed from: com.google.gson.internal.c$a */
    class C2513a extends C2534q<T> {

        /* renamed from: a */
        private C2534q<T> f4252a;

        /* renamed from: b */
        final /* synthetic */ boolean f4253b;

        /* renamed from: c */
        final /* synthetic */ boolean f4254c;

        /* renamed from: d */
        final /* synthetic */ C2469e f4255d;

        /* renamed from: e */
        final /* synthetic */ C3918a f4256e;

        C2513a(boolean z, boolean z2, C2469e eVar, C3918a aVar) {
            this.f4253b = z;
            this.f4254c = z2;
            this.f4255d = eVar;
            this.f4256e = aVar;
        }

        /* renamed from: e */
        private C2534q<T> m6781e() {
            C2534q<T> qVar = this.f4252a;
            if (qVar != null) {
                return qVar;
            }
            C2534q<T> m = this.f4255d.mo19230m(C2512c.this, this.f4256e);
            this.f4252a = m;
            return m;
        }

        /* renamed from: b */
        public T mo19209b(C3929a aVar) {
            if (!this.f4253b) {
                return m6781e().mo19209b(aVar);
            }
            aVar.mo26174j0();
            return null;
        }

        /* renamed from: d */
        public void mo19210d(C2537a aVar, T t) {
            if (this.f4254c) {
                aVar.mo19434s();
            } else {
                m6781e().mo19210d(aVar, t);
            }
        }
    }

    /* renamed from: d */
    private boolean m6769d(Class<?> cls) {
        if (this.f4246a == -1.0d || m6776o((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.f4248c && m6772h(cls)) || m6771g(cls);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m6770e(Class<?> cls, boolean z) {
        for (C2466b b : z ? this.f4250e : this.f4251f) {
            if (b.mo19223b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m6771g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: h */
    private boolean m6772h(Class<?> cls) {
        return cls.isMemberClass() && !m6773i(cls);
    }

    /* renamed from: i */
    private boolean m6773i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: j */
    private boolean m6774j(Since since) {
        return since == null || since.value() <= this.f4246a;
    }

    /* renamed from: k */
    private boolean m6775k(Until until) {
        return until == null || until.value() > this.f4246a;
    }

    /* renamed from: o */
    private boolean m6776o(Since since, Until until) {
        return m6774j(since) && m6775k(until);
    }

    /* renamed from: a */
    public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
        Class<? super T> c = aVar.mo26409c();
        boolean d = m6769d(c);
        boolean z = d || m6770e(c, true);
        boolean z2 = d || m6770e(c, false);
        if (z || z2) {
            return new C2513a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2512c clone() {
        try {
            return (C2512c) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo19370c(Class<?> cls, boolean z) {
        return m6769d(cls) || m6770e(cls, z);
    }

    /* renamed from: f */
    public boolean mo19372f(Field field, boolean z) {
        Expose expose;
        if ((this.f4247b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4246a != -1.0d && !m6776o((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4249d && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.f4248c && m6772h(field.getType())) || m6771g(field.getType())) {
            return true;
        }
        List<C2466b> list = z ? this.f4250e : this.f4251f;
        if (list.isEmpty()) {
            return false;
        }
        C2467c cVar = new C2467c(field);
        for (C2466b a : list) {
            if (a.mo19222a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
