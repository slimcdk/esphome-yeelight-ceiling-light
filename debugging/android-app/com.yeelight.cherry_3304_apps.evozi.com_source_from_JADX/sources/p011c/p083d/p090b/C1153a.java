package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.a */
abstract class C1153a<T> {

    /* renamed from: a */
    final C1203t f1912a;

    /* renamed from: b */
    final C1216w f1913b;

    /* renamed from: c */
    final WeakReference<T> f1914c;

    /* renamed from: d */
    final boolean f1915d;

    /* renamed from: e */
    final int f1916e;

    /* renamed from: f */
    final int f1917f;

    /* renamed from: g */
    final int f1918g;

    /* renamed from: h */
    final Drawable f1919h;

    /* renamed from: i */
    final String f1920i;

    /* renamed from: j */
    final Object f1921j;

    /* renamed from: k */
    boolean f1922k;

    /* renamed from: l */
    boolean f1923l;

    /* renamed from: c.d.b.a$a */
    static class C1154a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C1153a f1924a;

        public C1154a(C1153a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f1924a = aVar;
        }
    }

    C1153a(C1203t tVar, T t, C1216w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f1912a = tVar;
        this.f1913b = wVar;
        this.f1914c = t == null ? null : new C1154a(this, t, tVar.f2066k);
        this.f1916e = i;
        this.f1917f = i2;
        this.f1915d = z;
        this.f1918g = i3;
        this.f1919h = drawable;
        this.f1920i = str;
        this.f1921j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9886a() {
        this.f1923l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo9887b(Bitmap bitmap, C1203t.C1209e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo9888c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9889d() {
        return this.f1920i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9890e() {
        return this.f1916e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9891f() {
        return this.f1917f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1203t mo9892g() {
        return this.f1912a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1203t.C1210f mo9893h() {
        return this.f1913b.f2121r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1216w mo9894i() {
        return this.f1913b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo9895j() {
        return this.f1921j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public T mo9896k() {
        WeakReference<T> weakReference = this.f1914c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo9897l() {
        return this.f1923l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9898m() {
        return this.f1922k;
    }
}
