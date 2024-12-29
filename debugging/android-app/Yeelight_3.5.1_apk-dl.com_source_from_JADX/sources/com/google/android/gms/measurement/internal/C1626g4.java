package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.g4 */
final class C1626g4 implements Runnable {

    /* renamed from: a */
    private final C1600e4 f2104a;

    /* renamed from: b */
    private final int f2105b;

    /* renamed from: c */
    private final Throwable f2106c;

    /* renamed from: d */
    private final byte[] f2107d;

    /* renamed from: e */
    private final String f2108e;

    /* renamed from: f */
    private final Map f2109f;

    /* synthetic */ C1626g4(String str, C1600e4 e4Var, int i, Throwable th, byte[] bArr, Map map, C1613f4 f4Var) {
        C0917i.m1419j(e4Var);
        this.f2104a = e4Var;
        this.f2105b = i;
        this.f2106c = th;
        this.f2107d = bArr;
        this.f2108e = str;
        this.f2109f = map;
    }

    public final void run() {
        this.f2104a.mo14123a(this.f2108e, this.f2105b, this.f2106c, this.f2107d, this.f2109f);
    }
}
