package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
final class C2384y4<V> extends FutureTask<V> implements Comparable<C2384y4<V>> {

    /* renamed from: a */
    private final long f4731a;

    /* renamed from: b */
    final boolean f4732b;

    /* renamed from: c */
    private final String f4733c;

    /* renamed from: d */
    private final /* synthetic */ C2373x4 f4734d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2384y4(C2373x4 x4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f4734d = x4Var;
        C1609u.m4475k(str);
        long andIncrement = C2373x4.f4705l.getAndIncrement();
        this.f4731a = andIncrement;
        this.f4733c = str;
        this.f4732b = false;
        if (andIncrement == Long.MAX_VALUE) {
            x4Var.mo12427b().mo13096F().mo13130a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2384y4(C2373x4 x4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f4734d = x4Var;
        C1609u.m4475k(str);
        long andIncrement = C2373x4.f4705l.getAndIncrement();
        this.f4731a = andIncrement;
        this.f4733c = str;
        this.f4732b = z;
        if (andIncrement == Long.MAX_VALUE) {
            x4Var.mo12427b().mo13096F().mo13130a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        C2384y4 y4Var = (C2384y4) obj;
        boolean z = this.f4732b;
        if (z != y4Var.f4732b) {
            return z ? -1 : 1;
        }
        long j = this.f4731a;
        long j2 = y4Var.f4731a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f4734d.mo12427b().mo13097G().mo13131b("Two tasks share the same index. index", Long.valueOf(this.f4731a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f4734d.mo12427b().mo13096F().mo13131b(this.f4733c, th);
        super.setException(th);
    }
}
