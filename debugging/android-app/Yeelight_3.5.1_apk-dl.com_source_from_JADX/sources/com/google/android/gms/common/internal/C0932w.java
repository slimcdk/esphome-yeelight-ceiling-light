package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.w */
public abstract class C0932w {
    @Nullable

    /* renamed from: a */
    private Object f1065a;

    /* renamed from: b */
    private boolean f1066b = false;

    /* renamed from: c */
    final /* synthetic */ C0897c f1067c;

    public C0932w(C0897c cVar, Object obj) {
        this.f1067c = cVar;
        this.f1065a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12301a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12302b();

    /* renamed from: c */
    public final void mo12326c() {
        Object obj;
        synchronized (this) {
            obj = this.f1065a;
            if (this.f1066b) {
                String obj2 = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo12301a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f1066b = true;
        }
        mo12328e();
    }

    /* renamed from: d */
    public final void mo12327d() {
        synchronized (this) {
            this.f1065a = null;
        }
    }

    /* renamed from: e */
    public final void mo12328e() {
        mo12327d();
        synchronized (this.f1067c.f992q) {
            this.f1067c.f992q.remove(this);
        }
    }
}
