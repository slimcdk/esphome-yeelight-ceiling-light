package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p014c0.C0624m;
import p028e0.C3144c;
import p109w.C3843h0;

@KeepForSdk
/* renamed from: com.google.android.gms.common.stats.a */
public class C0956a {

    /* renamed from: b */
    private static final Object f1170b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C0956a f1171c;
    @NonNull
    @VisibleForTesting

    /* renamed from: a */
    public ConcurrentHashMap f1172a = new ConcurrentHashMap();

    private C0956a() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static C0956a m1580b() {
        if (f1171c == null) {
            synchronized (f1170b) {
                if (f1171c == null) {
                    f1171c = new C0956a();
                }
            }
        }
        C0956a aVar = f1171c;
        C0917i.m1419j(aVar);
        return aVar;
    }

    /* renamed from: e */
    private static void m1581e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m1582f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3144c.m8403a(context).mo23627b(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m1583g(serviceConnection)) {
            return m1584h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f1172a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean h = m1584h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f1172a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m1583g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C3843h0);
    }

    /* renamed from: h */
    private static final boolean m1584h(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return (!C0624m.m230i() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo12423a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return m1582f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo12424c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!m1583g(serviceConnection) || !this.f1172a.containsKey(serviceConnection)) {
            m1581e(context, serviceConnection);
            return;
        }
        try {
            m1581e(context, (ServiceConnection) this.f1172a.get(serviceConnection));
        } finally {
            this.f1172a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo12425d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return m1582f(context, str, intent, serviceConnection, i, true, executor);
    }
}
