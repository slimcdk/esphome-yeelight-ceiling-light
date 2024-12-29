package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import java.util.List;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.f4 */
final class C2170f4 implements Runnable {

    /* renamed from: a */
    private final C2182g4 f4110a;

    /* renamed from: b */
    private final int f4111b;

    /* renamed from: c */
    private final Throwable f4112c;

    /* renamed from: d */
    private final byte[] f4113d;

    /* renamed from: e */
    private final String f4114e;

    /* renamed from: f */
    private final Map<String, List<String>> f4115f;

    private C2170f4(String str, C2182g4 g4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C1609u.m4475k(g4Var);
        this.f4110a = g4Var;
        this.f4111b = i;
        this.f4112c = th;
        this.f4113d = bArr;
        this.f4114e = str;
        this.f4115f = map;
    }

    public final void run() {
        this.f4110a.mo12664a(this.f4114e, this.f4111b, this.f4112c, this.f4113d, this.f4115f);
    }
}
