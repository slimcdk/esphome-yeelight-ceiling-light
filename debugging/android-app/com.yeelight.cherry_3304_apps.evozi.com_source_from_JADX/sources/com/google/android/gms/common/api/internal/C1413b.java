package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.C1660n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C1413b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static final C1413b f2613e = new C1413b();

    /* renamed from: a */
    private final AtomicBoolean f2614a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f2615b = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: c */
    private final ArrayList<C1414a> f2616c = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private boolean f2617d = false;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C1414a {
        @KeepForSdk
        /* renamed from: a */
        void mo10882a(boolean z);
    }

    @KeepForSdk
    private C1413b() {
    }

    @KeepForSdk
    /* renamed from: b */
    public static C1413b m3712b() {
        return f2613e;
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m3713c(Application application) {
        synchronized (f2613e) {
            if (!f2613e.f2617d) {
                application.registerActivityLifecycleCallbacks(f2613e);
                application.registerComponentCallbacks(f2613e);
                f2613e.f2617d = true;
            }
        }
    }

    /* renamed from: e */
    private final void m3714e(boolean z) {
        synchronized (f2613e) {
            ArrayList<C1414a> arrayList = this.f2616c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C1414a aVar = arrayList.get(i);
                i++;
                aVar.mo10882a(z);
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo10869a(C1414a aVar) {
        synchronized (f2613e) {
            this.f2616c.add(aVar);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final boolean mo10870d() {
        return this.f2614a.get();
    }

    @TargetApi(16)
    @KeepForSdk
    /* renamed from: f */
    public final boolean mo10871f(boolean z) {
        if (!this.f2615b.get()) {
            if (!C1660n.m4603c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f2615b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f2614a.set(true);
            }
        }
        return mo10870d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2614a.compareAndSet(true, false);
        this.f2615b.set(true);
        if (compareAndSet) {
            m3714e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2614a.compareAndSet(true, false);
        this.f2615b.set(true);
        if (compareAndSet) {
            m3714e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2614a.compareAndSet(false, true)) {
            this.f2615b.set(true);
            m3714e(true);
        }
    }
}
