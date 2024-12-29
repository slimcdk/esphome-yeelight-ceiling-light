package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.C0917i;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
final class C1653i5 extends FutureTask implements Comparable {

    /* renamed from: a */
    private final long f2158a;

    /* renamed from: b */
    final boolean f2159b;

    /* renamed from: c */
    private final String f2160c;

    /* renamed from: d */
    final /* synthetic */ C1679k5 f2161d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1653i5(C1679k5 k5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f2161d = k5Var;
        C0917i.m1419j(str);
        long andIncrement = C1679k5.f2220l.getAndIncrement();
        this.f2158a = andIncrement;
        this.f2160c = str;
        this.f2159b = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            k5Var.f2143a.mo14228b().mo14035r().mo14693a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1653i5(C1679k5 k5Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f2161d = k5Var;
        C0917i.m1419j("Task exception on worker thread");
        long andIncrement = C1679k5.f2220l.getAndIncrement();
        this.f2158a = andIncrement;
        this.f2160c = "Task exception on worker thread";
        this.f2159b = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            k5Var.f2143a.mo14228b().mo14035r().mo14693a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        C1653i5 i5Var = (C1653i5) obj;
        boolean z = this.f2159b;
        if (z != i5Var.f2159b) {
            return !z ? 1 : -1;
        }
        long j = this.f2158a;
        long j2 = i5Var.f2158a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f2161d.f2143a.mo14228b().mo14037t().mo14694b("Two tasks share the same index. index", Long.valueOf(this.f2158a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f2161d.f2143a.mo14228b().mo14035r().mo14694b(this.f2160c, th);
        if ((th instanceof zzgd) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
