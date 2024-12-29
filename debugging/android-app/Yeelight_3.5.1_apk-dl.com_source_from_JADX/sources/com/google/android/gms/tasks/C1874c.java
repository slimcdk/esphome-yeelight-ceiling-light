package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p065m0.C3339g;
import p065m0.C3340h;

/* renamed from: com.google.android.gms.tasks.c */
public final class C1874c {
    /* renamed from: a */
    public static <TResult> TResult m4947a(@NonNull C3339g<TResult> gVar) {
        C0917i.m1417h();
        C0917i.m1420k(gVar, "Task must not be null");
        if (gVar.mo14770m()) {
            return m4954h(gVar);
        }
        C1875d dVar = new C1875d((C3340h) null);
        m4955i(gVar, dVar);
        dVar.mo14742b();
        return m4954h(gVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m4948b(@NonNull C3339g<TResult> gVar, long j, @NonNull TimeUnit timeUnit) {
        C0917i.m1417h();
        C0917i.m1420k(gVar, "Task must not be null");
        C0917i.m1420k(timeUnit, "TimeUnit must not be null");
        if (gVar.mo14770m()) {
            return m4954h(gVar);
        }
        C1875d dVar = new C1875d((C3340h) null);
        m4955i(gVar, dVar);
        if (dVar.mo14745e(j, timeUnit)) {
            return m4954h(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <TResult> C3339g<TResult> m4949c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C0917i.m1420k(executor, "Executor must not be null");
        C0917i.m1420k(callable, "Callback must not be null");
        C1896y yVar = new C1896y();
        executor.execute(new C1897z(yVar, callable));
        return yVar;
    }

    @NonNull
    /* renamed from: d */
    public static <TResult> C3339g<TResult> m4950d(@NonNull Exception exc) {
        C1896y yVar = new C1896y();
        yVar.mo14774q(exc);
        return yVar;
    }

    @NonNull
    /* renamed from: e */
    public static <TResult> C3339g<TResult> m4951e(TResult tresult) {
        C1896y yVar = new C1896y();
        yVar.mo14775r(tresult);
        return yVar;
    }

    @NonNull
    /* renamed from: f */
    public static C3339g<Void> m4952f(@Nullable Collection<? extends C3339g<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m4951e((Object) null);
        }
        for (C3339g requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        C1896y yVar = new C1896y();
        C1877f fVar = new C1877f(collection.size(), yVar);
        for (C3339g i : collection) {
            m4955i(i, fVar);
        }
        return yVar;
    }

    @NonNull
    /* renamed from: g */
    public static C3339g<Void> m4953g(@Nullable Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m4951e((Object) null) : m4952f(Arrays.asList(taskArr));
    }

    /* renamed from: h */
    private static Object m4954h(@NonNull C3339g gVar) {
        if (gVar.mo14771n()) {
            return gVar.mo14768k();
        }
        if (gVar.mo14769l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo14767j());
    }

    /* renamed from: i */
    private static void m4955i(C3339g gVar, C1876e eVar) {
        Executor executor = C1873b.f2907b;
        gVar.mo14762e(executor, eVar);
        gVar.mo14761d(executor, eVar);
        gVar.mo14758a(executor, eVar);
    }
}
