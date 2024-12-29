package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p014c0.C0624m;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C0757c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static final C0757c f587e = new C0757c();

    /* renamed from: a */
    private final AtomicBoolean f588a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f589b = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: c */
    private final ArrayList f590c = new ArrayList();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private boolean f591d = false;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface C0758a {
        @KeepForSdk
        /* renamed from: a */
        void mo11923a(boolean z);
    }

    @KeepForSdk
    private C0757c() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static C0757c m752b() {
        return f587e;
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m753c(@NonNull Application application) {
        C0757c cVar = f587e;
        synchronized (cVar) {
            if (!cVar.f591d) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f591d = true;
            }
        }
    }

    /* renamed from: f */
    private final void m754f(boolean z) {
        synchronized (f587e) {
            Iterator it = this.f590c.iterator();
            while (it.hasNext()) {
                ((C0758a) it.next()).mo11923a(z);
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo11910a(@NonNull C0758a aVar) {
        synchronized (f587e) {
            this.f590c.add(aVar);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean mo11911d() {
        return this.f588a.get();
    }

    @TargetApi(16)
    @KeepForSdk
    /* renamed from: e */
    public boolean mo11912e(boolean z) {
        if (!this.f589b.get()) {
            if (!C0624m.m223b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f589b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f588a.set(true);
            }
        }
        return mo11911d();
    }

    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean compareAndSet = this.f588a.compareAndSet(true, false);
        this.f589b.set(true);
        if (compareAndSet) {
            m754f(false);
        }
    }

    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    public final void onActivityPaused(@NonNull Activity activity) {
    }

    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.f588a.compareAndSet(true, false);
        this.f589b.set(true);
        if (compareAndSet) {
            m754f(false);
        }
    }

    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public final void onActivityStarted(@NonNull Activity activity) {
    }

    public final void onActivityStopped(@NonNull Activity activity) {
    }

    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f588a.compareAndSet(false, true)) {
            this.f589b.set(true);
            m754f(true);
        }
    }
}
