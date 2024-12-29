package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wearable.PutDataRequest;
import p011c.p012a.p019b.p028b.p032c.p036d.C0581a;
import p011c.p012a.p019b.p028b.p032c.p036d.C0583c;

/* renamed from: com.google.android.gms.wearable.internal.v0 */
public final class C2507v0 extends C0581a implements C2504u0 {
    C2507v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* renamed from: B0 */
    public final void mo13374B0(C2488p0 p0Var, zzfw zzfw) {
        Parcel c = mo8555c();
        C0583c.m359b(c, p0Var);
        C0583c.m360c(c, zzfw);
        mo8556e(17, c);
    }

    /* renamed from: O */
    public final void mo13375O(C2488p0 p0Var, zzd zzd) {
        Parcel c = mo8555c();
        C0583c.m359b(c, p0Var);
        C0583c.m360c(c, zzd);
        mo8556e(16, c);
    }

    /* renamed from: e0 */
    public final void mo13376e0(C2488p0 p0Var, PutDataRequest putDataRequest) {
        Parcel c = mo8555c();
        C0583c.m359b(c, p0Var);
        C0583c.m360c(c, putDataRequest);
        mo8556e(6, c);
    }

    /* renamed from: p */
    public final void mo13377p(C2488p0 p0Var, String str, String str2, byte[] bArr) {
        Parcel c = mo8555c();
        C0583c.m359b(c, p0Var);
        c.writeString(str);
        c.writeString(str2);
        c.writeByteArray(bArr);
        mo8556e(12, c);
    }

    /* renamed from: s0 */
    public final void mo13378s0(C2488p0 p0Var) {
        Parcel c = mo8555c();
        C0583c.m359b(c, p0Var);
        mo8556e(15, c);
    }
}
