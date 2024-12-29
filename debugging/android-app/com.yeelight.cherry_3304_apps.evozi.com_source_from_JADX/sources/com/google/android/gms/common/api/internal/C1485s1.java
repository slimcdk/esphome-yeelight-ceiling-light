package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.C1514q;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
final class C1485s1 implements IBinder.DeathRecipient, C1488t1 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f2812a;

    /* renamed from: b */
    private final WeakReference<C1514q> f2813b;

    /* renamed from: c */
    private final WeakReference<IBinder> f2814c;

    private C1485s1(BasePendingResult<?> basePendingResult, C1514q qVar, IBinder iBinder) {
        this.f2813b = new WeakReference<>(qVar);
        this.f2812a = new WeakReference<>(basePendingResult);
        this.f2814c = new WeakReference<>(iBinder);
    }

    /* synthetic */ C1485s1(BasePendingResult basePendingResult, C1514q qVar, IBinder iBinder, C1482r1 r1Var) {
        this(basePendingResult, (C1514q) null, iBinder);
    }

    /* renamed from: b */
    private final void m4011b() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f2812a.get();
        C1514q qVar = (C1514q) this.f2813b.get();
        if (!(qVar == null || basePendingResult == null)) {
            qVar.mo11033a(basePendingResult.mo10851p().intValue());
        }
        IBinder iBinder = (IBinder) this.f2814c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo11012a(BasePendingResult<?> basePendingResult) {
        m4011b();
    }

    public final void binderDied() {
        m4011b();
    }
}
