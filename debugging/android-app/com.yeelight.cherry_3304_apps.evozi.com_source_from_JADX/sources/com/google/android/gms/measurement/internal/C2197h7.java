package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final /* synthetic */ class C2197h7 implements Runnable {

    /* renamed from: a */
    private final C2209i7 f4164a;

    /* renamed from: b */
    private final int f4165b;

    /* renamed from: c */
    private final Exception f4166c;

    /* renamed from: d */
    private final byte[] f4167d;

    /* renamed from: e */
    private final Map f4168e;

    C2197h7(C2209i7 i7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f4164a = i7Var;
        this.f4165b = i;
        this.f4166c = exc;
        this.f4167d = bArr;
        this.f4168e = map;
    }

    public final void run() {
        this.f4164a.mo12745b(this.f4165b, this.f4166c, this.f4167d, this.f4168e);
    }
}
