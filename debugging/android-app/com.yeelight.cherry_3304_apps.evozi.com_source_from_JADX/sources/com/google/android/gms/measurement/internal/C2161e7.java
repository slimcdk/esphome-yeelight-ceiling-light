package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
final class C2161e7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f4087a;

    /* renamed from: b */
    private final /* synthetic */ Uri f4088b;

    /* renamed from: c */
    private final /* synthetic */ String f4089c;

    /* renamed from: d */
    private final /* synthetic */ String f4090d;

    /* renamed from: e */
    private final /* synthetic */ C2113a7 f4091e;

    C2161e7(C2113a7 a7Var, boolean z, Uri uri, String str, String str2) {
        this.f4091e = a7Var;
        this.f4087a = z;
        this.f4088b = uri;
        this.f4089c = str;
        this.f4090d = str2;
    }

    public final void run() {
        this.f4091e.m6756b(this.f4087a, this.f4088b, this.f4089c, this.f4090d);
    }
}
