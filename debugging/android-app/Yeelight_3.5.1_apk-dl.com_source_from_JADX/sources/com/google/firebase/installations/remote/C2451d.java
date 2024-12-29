package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.C2436e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.remote.d */
class C2451d {

    /* renamed from: d */
    private static final long f4152d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f4153e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C2436e f4154a = C2436e.m6526c();
    @GuardedBy("this")

    /* renamed from: b */
    private long f4155b;
    @GuardedBy("this")

    /* renamed from: c */
    private int f4156c;

    C2451d() {
    }

    /* renamed from: a */
    private synchronized long m6639a(int i) {
        if (!m6640c(i)) {
            return f4152d;
        }
        double pow = Math.pow(2.0d, (double) this.f4156c);
        double e = (double) this.f4154a.mo19062e();
        Double.isNaN(e);
        return (long) Math.min(pow + e, (double) f4153e);
    }

    /* renamed from: c */
    private static boolean m6640c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m6641d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m6642e() {
        this.f4156c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo19122b() {
        return this.f4156c == 0 || this.f4154a.mo19060a() > this.f4155b;
    }

    /* renamed from: f */
    public synchronized void mo19123f(int i) {
        if (m6641d(i)) {
            m6642e();
            return;
        }
        this.f4156c++;
        this.f4155b = this.f4154a.mo19060a() + m6639a(i);
    }
}
