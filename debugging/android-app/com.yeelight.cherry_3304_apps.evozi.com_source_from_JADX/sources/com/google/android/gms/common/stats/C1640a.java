package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.C1650d;
import java.util.Collections;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.stats.a */
public class C1640a {

    /* renamed from: a */
    private static final Object f3165a = new Object();

    /* renamed from: b */
    private static volatile C1640a f3166b;

    private C1640a() {
        List list = Collections.EMPTY_LIST;
    }

    @KeepForSdk
    /* renamed from: b */
    public static C1640a m4551b() {
        if (f3166b == null) {
            synchronized (f3165a) {
                if (f3166b == null) {
                    f3166b = new C1640a();
                }
            }
        }
        return f3166b;
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo11370a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo11372d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    /* renamed from: c */
    public void mo11371c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: d */
    public final boolean mo11372d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : C1650d.m4578b(context, component.getPackageName())) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
