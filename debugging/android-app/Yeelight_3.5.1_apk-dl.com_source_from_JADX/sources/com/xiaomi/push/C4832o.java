package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.xiaomi.push.o */
public class C4832o {

    /* renamed from: a */
    private static volatile Handler f9324a;

    /* renamed from: a */
    private static final Object f9325a = new Object();

    /* renamed from: b */
    private static volatile Handler f9326b;

    /* renamed from: a */
    public static Intent m15023a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return m15024a(context, broadcastReceiver, intentFilter, (String) null);
    }

    /* renamed from: a */
    public static Intent m15024a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, m15028b());
    }

    /* renamed from: a */
    public static Handler m15025a() {
        if (f9326b == null) {
            synchronized (f9325a) {
                if (f9326b == null) {
                    HandlerThread handlerThread = new HandlerThread("receiver_task");
                    handlerThread.start();
                    f9326b = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f9326b;
    }

    /* renamed from: a */
    private static void m15026a(Context context, ComponentName componentName) {
        m15028b().post(new C4833p(context, componentName));
    }

    /* renamed from: a */
    public static void m15027a(Context context, Class<?> cls) {
        if (context != null && cls != null) {
            m15026a(context, new ComponentName(context, cls));
        }
    }

    /* renamed from: b */
    private static Handler m15028b() {
        if (f9324a == null) {
            synchronized (C4832o.class) {
                if (f9324a == null) {
                    HandlerThread handlerThread = new HandlerThread("handle_receiver");
                    handlerThread.start();
                    f9324a = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f9324a;
    }
}
