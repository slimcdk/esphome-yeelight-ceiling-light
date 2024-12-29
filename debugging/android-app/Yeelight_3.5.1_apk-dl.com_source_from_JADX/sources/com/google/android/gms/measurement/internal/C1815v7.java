package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
public final /* synthetic */ class C1815v7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1827w7 f2721a;

    /* renamed from: b */
    public final /* synthetic */ int f2722b;

    /* renamed from: c */
    public final /* synthetic */ Exception f2723c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f2724d;

    /* renamed from: e */
    public final /* synthetic */ Map f2725e;

    public /* synthetic */ C1815v7(C1827w7 w7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f2721a = w7Var;
        this.f2722b = i;
        this.f2723c = exc;
        this.f2724d = bArr;
        this.f2725e = map;
    }

    public final void run() {
        this.f2721a.mo14623b(this.f2722b, this.f2723c, this.f2724d, this.f2725e);
    }
}
