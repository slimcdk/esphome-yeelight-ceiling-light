package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.dynamite.b */
public final class C0970b {
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: a */
    private static volatile ClassLoader f1209a;
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: b */
    private static volatile Thread f1210b;

    @Nullable
    /* renamed from: a */
    public static synchronized ClassLoader m1618a() {
        ClassLoader classLoader;
        synchronized (C0970b.class) {
            if (f1209a == null) {
                f1209a = m1619b();
            }
            classLoader = f1209a;
        }
        return classLoader;
    }

    @Nullable
    /* renamed from: b */
    private static synchronized ClassLoader m1619b() {
        synchronized (C0970b.class) {
            ClassLoader classLoader = null;
            if (f1210b == null) {
                f1210b = m1620c();
                if (f1210b == null) {
                    return null;
                }
            }
            synchronized (f1210b) {
                try {
                    classLoader = f1210b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    @Nullable
    /* renamed from: c */
    private static synchronized Thread m1620c() {
        C0969a aVar;
        C0969a aVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (C0970b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (aVar == null) {
                        try {
                            aVar2 = new C0969a(threadGroup, "GmsDynamite");
                            try {
                                aVar2.setContextClassLoader((ClassLoader) null);
                                aVar2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            aVar2 = aVar;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to enumerate thread/threadgroup ");
                            sb.append(message);
                            aVar = aVar2;
                            return aVar;
                        }
                        aVar = aVar2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    aVar2 = null;
                    String message2 = e.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to enumerate thread/threadgroup ");
                    sb2.append(message2);
                    aVar = aVar2;
                    return aVar;
                }
            }
            return aVar;
        }
    }
}
