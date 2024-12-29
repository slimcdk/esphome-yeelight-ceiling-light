package p011c.p012a.p046d.p047x;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p011c.p012a.p046d.C0654b;
import p011c.p012a.p046d.C0655c;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p051y.C0808a;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.d */
public final class C0711d implements C0690w, Cloneable {

    /* renamed from: g */
    public static final C0711d f440g = new C0711d();

    /* renamed from: a */
    private double f441a = -1.0d;

    /* renamed from: b */
    private int f442b = 136;

    /* renamed from: c */
    private boolean f443c = true;

    /* renamed from: d */
    private boolean f444d;

    /* renamed from: e */
    private List<C0654b> f445e = Collections.emptyList();

    /* renamed from: f */
    private List<C0654b> f446f = Collections.emptyList();

    /* renamed from: c.a.d.x.d$a */
    class C0712a extends C0688v<T> {

        /* renamed from: a */
        private C0688v<T> f447a;

        /* renamed from: b */
        final /* synthetic */ boolean f448b;

        /* renamed from: c */
        final /* synthetic */ boolean f449c;

        /* renamed from: d */
        final /* synthetic */ C0664f f450d;

        /* renamed from: e */
        final /* synthetic */ C0808a f451e;

        C0712a(boolean z, boolean z2, C0664f fVar, C0808a aVar) {
            this.f448b = z;
            this.f449c = z2;
            this.f450d = fVar;
            this.f451e = aVar;
        }

        /* renamed from: e */
        private C0688v<T> m752e() {
            C0688v<T> vVar = this.f447a;
            if (vVar != null) {
                return vVar;
            }
            C0688v<T> m = this.f450d.mo8708m(C0711d.this, this.f451e);
            this.f447a = m;
            return m;
        }

        /* renamed from: b */
        public T mo8694b(C0809a aVar) {
            if (!this.f448b) {
                return m752e().mo8694b(aVar);
            }
            aVar.mo8866j0();
            return null;
        }

        /* renamed from: d */
        public void mo8695d(C0812c cVar, T t) {
            if (this.f449c) {
                cVar.mo8874D();
            } else {
                m752e().mo8695d(cVar, t);
            }
        }
    }

    /* renamed from: d */
    private boolean m740d(Class<?> cls) {
        if (this.f441a == -1.0d || m747p((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.f443c && m743k(cls)) || m742j(cls);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m741e(Class<?> cls, boolean z) {
        for (C0654b b : z ? this.f445e : this.f446f) {
            if (b.mo8700b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private boolean m742j(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: k */
    private boolean m743k(Class<?> cls) {
        return cls.isMemberClass() && !m744l(cls);
    }

    /* renamed from: l */
    private boolean m744l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: m */
    private boolean m745m(Since since) {
        return since == null || since.value() <= this.f441a;
    }

    /* renamed from: o */
    private boolean m746o(Until until) {
        return until == null || until.value() > this.f441a;
    }

    /* renamed from: p */
    private boolean m747p(Since since, Until until) {
        return m745m(since) && m746o(until);
    }

    /* renamed from: a */
    public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
        Class<? super T> c = aVar.mo8967c();
        boolean d = m740d(c);
        boolean z = d || m741e(c, true);
        boolean z2 = d || m741e(c, false);
        if (z || z2) {
            return new C0712a(z2, z, fVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0711d clone() {
        try {
            return (C0711d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo8791c(Class<?> cls, boolean z) {
        return m740d(cls) || m741e(cls, z);
    }

    /* renamed from: f */
    public boolean mo8793f(Field field, boolean z) {
        Expose expose;
        if ((this.f442b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f441a != -1.0d && !m747p((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f444d && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.f443c && m743k(field.getType())) || m742j(field.getType())) {
            return true;
        }
        List<C0654b> list = z ? this.f445e : this.f446f;
        if (list.isEmpty()) {
            return false;
        }
        C0655c cVar = new C0655c(field);
        for (C0654b a : list) {
            if (a.mo8699a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
