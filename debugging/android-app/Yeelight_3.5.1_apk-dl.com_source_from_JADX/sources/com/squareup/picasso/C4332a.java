package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
abstract class C4332a<T> {

    /* renamed from: a */
    final Picasso f7147a;

    /* renamed from: b */
    final C4361q f7148b;

    /* renamed from: c */
    final WeakReference<T> f7149c;

    /* renamed from: d */
    final boolean f7150d;

    /* renamed from: e */
    final int f7151e;

    /* renamed from: f */
    final int f7152f;

    /* renamed from: g */
    final int f7153g;

    /* renamed from: h */
    final Drawable f7154h;

    /* renamed from: i */
    final String f7155i;

    /* renamed from: j */
    final Object f7156j;

    /* renamed from: k */
    boolean f7157k;

    /* renamed from: l */
    boolean f7158l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C4333a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C4332a f7159a;

        public C4333a(C4332a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f7159a = aVar;
        }
    }

    C4332a(Picasso picasso, T t, C4361q qVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f7147a = picasso;
        this.f7148b = qVar;
        this.f7149c = t == null ? null : new C4333a(this, t, picasso.f7128k);
        this.f7151e = i;
        this.f7152f = i2;
        this.f7150d = z;
        this.f7153g = i3;
        this.f7154h = drawable;
        this.f7155i = str;
        this.f7156j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28122a() {
        this.f7158l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo28123b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo28124c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo28125d() {
        return this.f7155i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo28126e() {
        return this.f7151e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo28127f() {
        return this.f7152f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Picasso mo28128g() {
        return this.f7147a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Picasso.Priority mo28129h() {
        return this.f7148b.f7256r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4361q mo28130i() {
        return this.f7148b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo28131j() {
        return this.f7156j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public T mo28132k() {
        WeakReference<T> weakReference = this.f7149c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo28133l() {
        return this.f7158l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo28134m() {
        return this.f7157k;
    }
}
