package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.f */
final class C1877f<T> implements C1876e<T> {

    /* renamed from: a */
    private final Object f2909a = new Object();

    /* renamed from: b */
    private final int f2910b;

    /* renamed from: c */
    private final C1896y f2911c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private int f2912d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private int f2913e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private int f2914f;
    @GuardedBy("mLock")

    /* renamed from: g */
    private Exception f2915g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private boolean f2916h;

    public C1877f(int i, C1896y yVar) {
        this.f2910b = i;
        this.f2911c = yVar;
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    private final void m4961b() {
        if (this.f2912d + this.f2913e + this.f2914f != this.f2910b) {
            return;
        }
        if (this.f2915g != null) {
            C1896y yVar = this.f2911c;
            int i = this.f2913e;
            int i2 = this.f2910b;
            yVar.mo14774q(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f2915g));
        } else if (this.f2916h) {
            this.f2911c.mo14776s();
        } else {
            this.f2911c.mo14775r((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo14741a(T t) {
        synchronized (this.f2909a) {
            this.f2912d++;
            m4961b();
        }
    }

    /* renamed from: c */
    public final void mo14743c() {
        synchronized (this.f2909a) {
            this.f2914f++;
            this.f2916h = true;
            m4961b();
        }
    }

    /* renamed from: d */
    public final void mo14744d(@NonNull Exception exc) {
        synchronized (this.f2909a) {
            this.f2913e++;
            this.f2915g = exc;
            m4961b();
        }
    }
}
